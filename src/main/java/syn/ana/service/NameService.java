package syn.ana.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import syn.ana.persistence.domain.BabyName;
import syn.ana.persistence.domain.NameRequest;
import syn.ana.persistence.domain.QueueRequest;
import syn.ana.persistence.domain.QueueRequest.requestType;
import syn.ana.persistence.repository.BabyNameRepository;
import syn.ana.util.QueueRequestProducer;

@Component
public class NameService {

	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private QueueRequestProducer producer;

	@Autowired
	private BabyNameRepository repo;

	@Value("${URL.generator.base}" + "${URL.generator.method}")
	private String NameGenURL;

	public BabyName generate(NameRequest nameRequest) {
		HttpEntity<NameRequest> request = new HttpEntity<>(nameRequest);
		ResponseEntity<BabyName> response = restTemplate.exchange(NameGenURL, HttpMethod.POST, request, BabyName.class);
		if (response.getBody().isName()) {
			persist(response.getBody());
		}
		return response.getBody();
	}

	private void persist(BabyName babyName) {
		repo.save(babyName);
		producer.produce(new QueueRequest(babyName.getName(), requestType.SAVE));
	}

}