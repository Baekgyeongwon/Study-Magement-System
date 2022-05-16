package study;

import java.util.Scanner;

import exception.ClassroomFormatException;

public class Programming extends Study implements StudyInput {
	
	public Programming (StudyKind kind) {
		super(kind);
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
		
		
		char answer = 'x';
		while(answer !='y' && answer !='Y' && answer !='n' && answer !='N') {
			System.out.print("Is it offline class? (Y/N): ");
			answer = input.next().charAt(0);
			try {
				if(answer=='y' || answer == 'Y') {
					System.out.print("Classroom: ");
					String classroom =input.next();
					this.setClassroom(classroom);
					break;
				}
				
				else if (answer == 'n' || answer == 'N') {
					this.setClassroom("online");
					break;
				}
				else {
				}
			}
			catch(ClassroomFormatException e) {
				System.out.println("Incorrect Classroom Format. put classroom with -. ");
			}
		}
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
		System.out.println("kind: " +skind+ " code: "+code+" subject: "+subject+" prof: "+prof+" classroom: "+classroom);
	}
	
	public void setStudyClassroom(String classroom) {
		classroom = "";
		while(!classroom.contains("-")) {
			System.out.print("Classroom: ");
			Scanner input = null;
			classroom= input.next();
			try {
				this.setClassroom(classroom);
			} catch(ClassroomFormatException e) {
				System.out.println("Incorrect Classroom Format. put classroom with -. ");
			}
		}
	}

		
}
