import java.util.Scanner;

public class MenuManager {
	
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		StudyManager studymanager = new StudyManager(input);
		int num = -1;
		while (num != 5) {
			System.out.println("1. Add Study");
			System.out.println("2. Delete Study");
			System.out.println("3. Edit Study");
			System.out.println("4. View Study");
			System.out.println("5. Exit");
			System.out.print("Select one number between 1-5: ");
			num = input.nextInt();
			if(num == 1) {
				studymanager.addStudy();
			}
			else if(num == 2) {
				studymanager.deleteStudy();
			}
			else if(num == 3) {
				studymanager.editStudy();
			}
			else if(num == 4) {
				studymanager.viewStudy();
			}
			else {
				continue;
			}
		}
	}
	
	
}

