import java.util.Scanner;

public class MenuManager {
	
	public static void main(String[] args) {
		int num = 0;
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
			
			switch(num) {
			case 1:
				System.out.print("studyCode: ");
				int studyCode = input.nextInt();
				System.out.print("Subject name: ");
				String subjectName = input.next();
				System.out.print("Professor: ");
				String profname = input.next();
				System.out.print("Classroom: ");
				String classroom =input.next();
				break;
			case 2:
			case 3:
			case 4:
				System.out.print("studyCode: ");
				int studyCode2 = input.nextInt();
			}
		}
		input.close();

	}

}
