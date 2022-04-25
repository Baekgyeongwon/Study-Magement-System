package study;

import java.util.Scanner;

public class Humanities extends Study {
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
			if(answer=='y' || answer == 'Y') {
				System.out.print("Classroom: ");
				String classroom =input.next();
				this.setClassroom(classroom);
				break;
			}
			
			else if (answer == 'n' || answer == 'N') {
				this.setClassroom("");
				break;
			}
			else {
			}
		}
	}
}
