package syn.ana.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import syn.ana.persistence.domain.BabyName;
import syn.ana.persistence.domain.NameRequest;
import syn.ana.service.NameService;

@CrossOrigin
@RestController
public class Endpoints {

	@Autowired
	private NameService service;

	@PostMapping("${URL.method.genName}")
	public BabyName getName(@RequestBody NameRequest nameRequest) {
		return service.generate(nameRequest);
	}

}
