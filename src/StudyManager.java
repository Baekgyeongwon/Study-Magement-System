import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import exception.ClassroomFormatException;
import study.Dynamics;
import study.Humanities;
import study.Mathematics;
import study.Programming;
import study.StudyInput;
import study.StudyKind;

public class StudyManager {
	ArrayList<StudyInput> studies = new ArrayList<StudyInput>();
	Scanner input;
	StudyManager(Scanner input){
		this.input= input;
	}
	
	public void addStudy() throws ClassroomFormatException {
		int kind = 0;
		StudyInput studyInput;
		while(kind < 1 || kind > 4) {
			try {
				System.out.print("1 for Dynamics / ");
				System.out.print("2 for Humanities / ");
				System.out.print("3 for Programming / ");
				System.out.println("4 for Mathematics ");
				System.out.print("Select num 1, 2, 3, or 4 for Study Kind: ");
				kind = input.nextInt();
				if(kind == 1 ) {
					studyInput = new Dynamics(StudyKind.Dynamics);
					studyInput.getUserInput(input);
					studies.add(studyInput);
					break;
				}
				else if (kind == 2) {
					studyInput = new Humanities(StudyKind.Humanities);
					studyInput.getUserInput(input);
					studies.add(studyInput);
					break;
				}
				else if (kind == 3) {
					studyInput = new Programming(StudyKind.Programming);
					studyInput.getUserInput(input);
					studies.add(studyInput);
					break;
				}
				else if (kind == 4) {
					studyInput = new Mathematics(StudyKind.Mathematics);
					studyInput.getUserInput(input);
					studies.add(studyInput);
					break;
				}
				else {
					System.out.print("Select num for Study Kind between 1, 2, 3, and 4: ");
				}
			}catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 4!");
				if(input.hasNext()) {
					input.next();
				}
				kind = -1;
			}
		}
	}
	
	public void deleteStudy() {		
		System.out.print("studyCode: ");
		int studyCode = input.nextInt();
		int index = -1	;
		for(int i=0; i<studies.size(); i++) {
			if (studies.get(i).getCode()==studyCode) {
				index = i;
				break;
			}
		}
		
		if (index >=0) {
			studies.remove(index);
			System.out.println("the study " +studyCode +" is deleted");
		}
		else {
			System.out.println("The study has not been registered.");
			return;
		}
	}
	
	public void editStudy() throws ClassroomFormatException {		
		System.out.print("studyCode: ");
		int studyCode = input.nextInt();
		for(int i=0; i<studies.size(); i++) {
			StudyInput studyInput = studies.get(i);
			if (studyInput.getCode() ==studyCode) {
				int num = -1;
				while (num != 5) {
					System.out.println("1. Edit StudyCode");
					System.out.println("2. Edit Subject name");
					System.out.println("3. Edit Prof name");
					System.out.println("4. Edit Classroom");
					System.out.println("5. Exit");
					System.out.print("Select one number between 1-5: ");
					num = input.nextInt();
					if(num == 1) {
						System.out.print("StudyCode: ");
						int code= input.nextInt();
						studyInput.setCode(code);
					}
					else if(num == 2) {
						System.out.print("Subject name: ");
						String subject= input.next();
						studyInput.setSubject(subject);
					}
					else if(num == 3) {
						System.out.print("Professor: ");
						String prof= input.next();
						studyInput.setProf(prof);
					}
					else if(num == 4) {
						System.out.print("Classroom: ");
						String classroom= input.next();
						studyInput.setClassroom(classroom);
					}
					else {
						continue;
					}
				}
				break;
			}
		}
	}
	
	public void viewStudies() {		
//		System.out.print("studyCode: ");
//		int studyCode = input.nextInt();
		System.out.println("# of registerd studies: "+ studies.size());
		for(int i=0; i<studies.size(); i++) {
			studies.get(i).printInfo();
		}
	}

}
