package syn.ana.util;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

import com.gareth.persistence.domain.Account;
import com.gareth.persistence.domain.Accounts;

import syn.ana.persistence.domain.BabyName;
import syn.ana.persistence.domain.NameRequest;

@Component
public class BabyNameProducer {

	@Autowired
	private JmsTemplate jmsTemplate;

	public BabyName produce(NameRequest nameRequest) {
		pojoAccount.setAccount(account.toString());
		jmsTemplate.convertAndSend("Audit", pojoAccount);
		return "${successful.message}";
	}
}
