package syn.ana.persistence.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BabyName {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	private boolean workingName;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public boolean isWorkingName() {
		return this.workingName;
	}
	
	public void setWorkingName(boolean workingName) {
		this.workingName = workingName;
	}

}
