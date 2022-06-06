package manager;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

import exception.ClassroomFormatException;
import gui.WindowFrame;
import log.EventLogger;

public class MenuManager {
	static EventLogger logger = new EventLogger("log.txt");
	
	public static void main(String[] args) throws ClassroomFormatException {
		
		Scanner input= new Scanner(System.in);
		StudyManager studyManager = getObject("studymanager.ser");
		if(studyManager == null) {
			studyManager = new StudyManager(input);
		}
		
	    WindowFrame frame = new WindowFrame(studyManager);
		selectMenu(input, studyManager);
		putObject(studyManager, "studymanager.ser");
	
	}
	
	public static void selectMenu(Scanner input, StudyManager studyManager) throws ClassroomFormatException {
		int num = -1;
		while (num != 5) {
			try {
				showMenu();
				num = input.nextInt();
				if(num == 1) {
					studyManager.addStudy();
					logger.log("add a study");
				}
				else if(num == 2) {
					studyManager.deleteStudy();
					logger.log("delete a study");
				}
				else if(num == 3) {
					studyManager.editStudy();
					logger.log("edit a study");
				}
				else if(num == 4) {
					studyManager.viewStudies();
					logger.log("view a list of study");
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
	
	public static StudyManager getObject(String filename) {
		StudyManager studyManager = null;
		
		
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			
			studyManager = (StudyManager) in.readObject();
			
			in.close();
			file.close();
		} catch (FileNotFoundException e) {
			return studyManager;
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return studyManager;
	}
	
	public static void putObject(StudyManager studyManager, String filename) {
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(studyManager);
			
			out.close();
			file.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

