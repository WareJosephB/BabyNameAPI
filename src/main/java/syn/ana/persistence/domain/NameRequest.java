package syn.ana.persistence.domain;

public class NameRequest {

	private long length;
	private String beginning;

	public NameRequest() {

	}

	public NameRequest(long length) {
		this.length = length;
		this.beginning = "";
	}

	public NameRequest(int length, String beginning) {
		this.length = length;
		this.beginning = beginning;
	}

	public long getLength() {
		return length;
	}

	public void setLength(long length) {
		this.length = length;
	}

	public String getBeginning() {
		return beginning;
	}

	public void setBeginning(String beginning) {
		this.beginning = beginning;
	}

}
