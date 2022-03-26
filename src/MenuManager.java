import java.util.Scanner;

public class MenuManager {
	
	public static void main(String[] args) {
		int num = 5;
		Scanner input= new Scanner(System.in);
		
		while (num != 6) {
			System.out.println("1. Add Study");
			System.out.println("2. Delete Study");
			System.out.println("3. Edit Study");
			System.out.println("4. View Study");
			System.out.println("5. Show a Menu");
			System.out.println("6. Exit");
			System.out.print("Select one number between 1-6: ");
			num = input.nextInt();
			if(num == 1) {
				addStudy();
			}
			else if(num == 2) {
				deleteStudy();
			}
			else if(num == 3) {
				editStudy();
			}
			else if(num == 4) {
				viewStudy();
			}
			else {
				continue;
			}
		}
	}
	
	public static void addStudy() {		
		Scanner input= new Scanner(System.in);
		System.out.print("studyCode: ");
		int studyCode = input.nextInt();
		System.out.print("Subject name: ");
		String subjectName = input.next();
		System.out.print("Professor: ");
		String profname = input.next();
		System.out.print("Classroom: ");
		String classroom =input.next();	
		}
	
	public static void deleteStudy() {		
		Scanner input= new Scanner(System.in);
		System.out.print("studyCode: ");
		int studyCode = input.nextInt();
		}
	
	public static void editStudy() {		
		Scanner input= new Scanner(System.in);
		System.out.print("studyCode: ");
		int studyCode = input.nextInt();
		}
	
	public static void viewStudy() {		
		Scanner input= new Scanner(System.in);
		System.out.print("studyCode: ");
		int studyCode = input.nextInt();
		}
}