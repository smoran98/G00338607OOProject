package ie.gmit.sw;

public class Shingle {
	private int docId;
	private int hashcode;

	//Constructor & Getters/Setters
	public Shingle() {
		super();
		
	}
	
	public Shingle(int docId, int hashcode) {
		super();
		this.docId = docId;
		this.hashcode = hashcode;
	}
	
	public int getDocId() {
		return docId;
	}

	public void setDocId(int docId) {
		this.docId = docId;
	}

	public int getHashcode() {
		return hashcode;
	}

	public void setHashcode(int hashcode) {
		this.hashcode = hashcode;
	}
}
