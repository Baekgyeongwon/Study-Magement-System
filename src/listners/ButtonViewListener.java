package listners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.swing.JButton;
import gui.StudyViewer;
import gui.WindowFrame;
import manager.StudyManager;

public class ButtonViewListener implements ActionListener {
	
	WindowFrame frame;

	public ButtonViewListener(WindowFrame frame) {
		this.frame = frame;
	}
	
	public void actionPerformed(ActionEvent e) {
		StudyViewer studyViewer = frame.getStudyviewer();
		StudyManager studyManager = getObject("studymanager.ser");
		studyViewer.setStudyManager(studyManager);
		
		frame.getContentPane().removeAll();
		frame.getContentPane().add(studyViewer);
		frame.revalidate();
		frame.repaint();
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

}
