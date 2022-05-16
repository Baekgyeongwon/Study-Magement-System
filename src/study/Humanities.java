package study;

import java.util.Scanner;

import exception.ClassroomFormatException;

public class Humanities extends Study implements StudyInput {
	
	public Humanities (StudyKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) throws ClassroomFormatException {
		setStudyCode(input);
		setStudySubject(input);
		setStudyProfessor(input);
		char answer = 'x';
		while(answer !='y' && answer !='Y' && answer !='n' && answer !='N') {
			System.out.print("Is it offline class? (Y/N): ");
			answer = input.next().charAt(0);
			try {
				if(answer=='y' || answer == 'Y') {
					setStudyClassroom(input);
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
		System.out.println("kind: " +skind+ " code: "+code+" subject: "
				+subject+" prof: "+prof+" classroom: "+classroom);
	}
	
}
