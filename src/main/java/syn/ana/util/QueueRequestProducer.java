package syn.ana.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

import syn.ana.persistence.domain.QueueRequest;

@Component
public class QueueRequestProducer {

	@Autowired
	private JmsTemplate jmsTemplate;

	@Value("${queue.name}")
	String queueName;

	public String produce(QueueRequest request) {
		jmsTemplate.convertAndSend(queueName, request);
		return "Persisted succesfully";
	}
}
