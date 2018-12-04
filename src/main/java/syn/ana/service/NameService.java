package syn.ana.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class NameService {

	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private BabyNameProducer producer;

	@Value("${URL.generator.base}" + "${URL.generator.method}")
	private String accountURL;

	public String getAccountNumber() {
		return restTemplate.getForObject(accountURL, String.class);
	}

}