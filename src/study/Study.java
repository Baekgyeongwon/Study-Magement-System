package study;

import java.util.Scanner;

public class Study {
	protected StudyKind kind = StudyKind.Dynamics;
	protected int code;
	protected String subject;
	protected String prof;
	protected String classroom;
	
	public Study() {
	}
	
	public Study (StudyKind kind) {
		this.kind = kind;
	}
	
	public Study (int code, String subject) {
		this.code = code;
		this.subject= subject;
	}

	public Study (int code, String subject, String prof, String classroom) {
		this.code = code;
		this.subject= subject;
		this.prof= prof;
		this.classroom= classroom;
	}
	
	public Study (StudyKind kind, int code, String subject, String prof, String classroom) {
		this.kind = kind;
		this.code = code;
		this.subject= subject;
		this.prof= prof;
		this.classroom= classroom;
	}
	
	public StudyKind getKind() {
		return kind;
	}

	public void setKind(StudyKind kind) {
		this.kind = kind;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getProf() {
		return prof;
	}

	public void setProf(String prof) {
		this.prof = prof;
	}

	public String getClassroom() {
		return classroom;
	}

	public void setClassroom(String classroom) {
		this.classroom = classroom;
	}

	public void printInfo() {
		String skind = "none";
		switch(this.kind) {
		case Dynamics:
			skind = "Dynamics";
			break;
		case Humanities:
			skind = "Humanities";
			break;
		case Programming:
			skind = "Programming";
			break;
		case Mathematics:
			skind = "Mathematics";
			break;
		default:
		}
		System.out.println("kind: " +skind+ "code: "+code+" subject: "+subject+" prof: "+prof+" classroom: "+classroom);
	}
	
	public void getUserInput(Scanner input) {
		System.out.print("studyCode: ");
		int code = input.nextInt();
		this.setCode(code);
		
		System.out.print("Subject name: ");
		String subject = input.next();
		this.setSubject(subject);
		
		System.out.print("Professor: ");
		String prof = input.next();
		this.setProf(prof);
		
		System.out.print("Classroom: ");
		String classroom =input.next();
		this.setClassroom(classroom);
	}
}
