
public class Study {
	int code;
	String subject;
	String prof;
	String classroom;
	
	public Study() {
	}
	
	public Study (int code, String subject, String prof, String classroom) {
		this.code = code;
		this.subject= subject;
		this.prof= prof;
		this.classroom= classroom;
	}

	public void printInfo() {
		System.out.println("code: "+code+" subject: "+subject+" prof: "+prof+" classroom: "+classroom);
	}
}
