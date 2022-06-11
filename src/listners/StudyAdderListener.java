package listners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JTextField;

import exception.ClassroomFormatException;
import manager.StudyManager;
import study.Dynamics;
import study.StudyInput;
import study.StudyKind;

public class StudyAdderListener implements ActionListener {

	JTextField fieldCode;
	JTextField fieldSubject;
	JTextField fieldProf;
	JTextField fieldClassroom;
	
	StudyManager studyManager;
	
	public StudyAdderListener(
			JTextField fieldCode, 
			JTextField fieldSubject, 
			JTextField fieldProf,
			JTextField fieldClassroom, StudyManager studyManager) {
		this.fieldCode = fieldCode;
		this.fieldSubject = fieldSubject;
		this.fieldProf = fieldProf;
		this.fieldClassroom = fieldClassroom;
		this.studyManager = studyManager;
	}

	public void actionPerformed(ActionEvent e) {
		
		StudyInput study = new Dynamics(StudyKind.Dynamics);
		
		try {
 			study.setCode(Integer.parseInt(fieldCode.getText()));
			study.setSubject(fieldSubject.getText());
			study.setProf(fieldProf.getText());
			study.setClassroom(fieldClassroom.getText());
			studyManager.addStudent(study);
			putObject(studyManager, "studymanager.ser");
			study.printInfo();
		} catch (ClassroomFormatException e1) {
			e1.printStackTrace();
		}
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
