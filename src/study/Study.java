package study;

import java.util.Scanner;

public abstract class Study {
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

	public abstract void printInfo();
		
}
