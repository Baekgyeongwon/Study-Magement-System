import java.util.ArrayList;
import java.util.Scanner;

import study.Humanities;
import study.Mathematics;
import study.Programming;
import study.Study;
import study.StudyKind;
public class StudyManager {
	ArrayList<Study> studies = new ArrayList<Study>();
	Scanner input;
	StudyManager(Scanner input){
		this.input= input;
	}
	
	public void addStudy() {
		int kind = 0;
		Study study;
		while(kind!=1 && kind !=2) {
			System.out.print("1 for Dynamics / ");
			System.out.print("2 for Humanities / ");
			System.out.print("3 for Programming / ");
			System.out.println("4 for Mathematics ");
			System.out.print("Select num 1, 2, 3, or 4 for Study Kind: ");
			kind = input.nextInt();
			if(kind == 1 ) {
				study = new Study(StudyKind.Dynamics);
				study.getUserInput(input);
				studies.add(study);
				break;
			}
			else if (kind == 2) {
				study = new Humanities(StudyKind.Humanities);
				study.getUserInput(input);
				studies.add(study);
				break;
			}
			else if (kind == 3) {
				study = new Programming(StudyKind.Programming);
				study.getUserInput(input);
				studies.add(study);
				break;
			}
			else if (kind == 4) {
				study = new Mathematics(StudyKind.Mathematics);
				study.getUserInput(input);
				studies.add(study);
				break;
			}
			else {
				System.out.print("Select num for Study Kind between 1 and 2: ");
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
	
	public void editStudy() {		
		System.out.print("studyCode: ");
		int studyCode = input.nextInt();
		for(int i=0; i<studies.size(); i++) {
			Study study = studies.get(i);
			if (study.getCode() ==studyCode) {
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
						study.setCode(code);
					}
					else if(num == 2) {
						System.out.print("Subject name: ");
						String subject= input.next();
						study.setSubject(subject);
					}
					else if(num == 3) {
						System.out.print("Professor: ");
						String prof= input.next();
						study.setProf(prof);
					}
					else if(num == 4) {
						System.out.print("Classroom: ");
						String classroom= input.next();
						study.setClassroom(classroom);
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
