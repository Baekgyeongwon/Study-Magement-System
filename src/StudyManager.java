import java.util.Scanner;
public class StudyManager {
	Study study;
	Scanner input;
	StudyManager(Scanner input){
		this.input= input;
	}
	
	public void addStudy() {
		study = new Study();
		System.out.print("studyCode: ");
		study.code = input.nextInt();
		System.out.print("Subject name: ");
		study.subject = input.next();
		System.out.print("Professor: ");
		study.prof = input.next();
		System.out.print("Classroom: ");
		study.classroom =input.next();	
	}
	
	public void deleteStudy() {		
		System.out.print("studyCode: ");
		int studyCode = input.nextInt();
		if (study == null) {
			System.out.println("The study has not been registered.");
			return;
		}
		if (study.code ==studyCode) {
			study = null;
			System.out.println("The study is deleted.");
		}
	}
	
	public void editStudy() {		
		System.out.print("studyCode: ");
		int studyCode = input.nextInt();
		if (study.code ==studyCode) {
			System.out.println("The study to be edited is "+studyCode);
		}
	}
	
	public void viewStudy() {		
		System.out.print("studyCode: ");
		int studyCode = input.nextInt();
		if (study.code ==studyCode) {
			study.printInfo();
		}
	}

}
