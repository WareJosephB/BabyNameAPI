package syn.ana.persistence.domain;

public class NameRequest {

	private int length;
	private String beginning;

	public NameRequest() {

	}

	public NameRequest(int length) {
		this.length = length;
		this.beginning = "";
	}

	public NameRequest(int length, String beginning) {
		this.length = length;
		this.beginning = beginning;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public String getBeginning() {
		return beginning;
	}

	public void setBeginning(String beginning) {
		this.beginning = beginning;
	}

}
