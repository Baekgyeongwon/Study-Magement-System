package study;

import java.util.Scanner;

import exception.ClassroomFormatException;

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
	
	public void setStudyCode(Scanner input) {
		System.out.print("StudyCode: ");
		int code= input.nextInt();
		this.setCode(code);
	}
	
	public void setStudySubject(Scanner input) {
		System.out.print("Subject name: ");
		String subject = input.next();
		this.setSubject(subject);
	}
	public void setStudyProfessor(Scanner input) {
		System.out.print("Professor: ");
		String prof = input.next();
		this.setProf(prof);
	}

	public void setClassroom(String classroom) throws ClassroomFormatException {
		if(!(classroom.contains("-")) || !(classroom.equals("online"))) {
			throw new ClassroomFormatException();
		}
		
		this.classroom = classroom;
	}
	
	public void setStudyClassroom(Scanner input) {
		String classroom = "";
		while(!classroom.contains("-")) {
			System.out.print("Classroom: ");
			classroom= input.next();
			try {
				this.setClassroom(classroom);
			} catch(ClassroomFormatException e) {
				System.out.println("Incorrect Classroom Format. put classroom with -. ");
			}
		}
		
	}

	public abstract void printInfo();
		
}
