import java.util.InputMismatchException;
import java.util.Scanner;
import exception.ClassroomFormatException;

public class MenuManager {
	
	public static void main(String[] args) throws ClassroomFormatException {
		Scanner input= new Scanner(System.in);
		StudyManager studyManager = new StudyManager(input);
	
		selectMenu(input, studyManager);
	
	}
	
	public static void selectMenu(Scanner input, StudyManager studyManager) throws ClassroomFormatException {
		int num = -1;
		while (num != 5) {
			try {
				showMenu();
				num = input.nextInt();
				if(num == 1) {
					studyManager.addStudy();
				}
				else if(num == 2) {
					studyManager.deleteStudy();
				}
				else if(num == 3) {
					studyManager.editStudy();
				}
				else if(num == 4) {
					studyManager.viewStudies();
				}
				else {
					continue;
				}
			}catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 5!");
				if(input.hasNext()) {
					input.next();
				}
				num = -1;
			}
		}
	}
	
	public static void showMenu() {
		System.out.println("1. Add Study");
		System.out.println("2. Delete Study");
		System.out.println("3. Edit Study");
		System.out.println("4. View Studies");
		System.out.println("5. Exit");
		System.out.print("Select one number between 1 and 5: ");
	}
	
	
}

