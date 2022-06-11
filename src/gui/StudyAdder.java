package gui;

import javax.swing.*;

import listners.StudyAdderCancelListener;
import listners.StudyAdderListener;
import manager.StudyManager;

public class StudyAdder extends JPanel{
	
	WindowFrame frame;
	StudyManager studyManager;
	
	public StudyAdder(WindowFrame frame, StudyManager studyManager) {
		this.frame = frame;
		this.studyManager = studyManager;
		
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		JLabel labelCode = new JLabel("StudyCode ", JLabel.TRAILING);
		JTextField fieldCode = new JTextField(10);
		labelCode.setLabelFor(fieldCode);
		panel.add(labelCode);
		panel.add(fieldCode);
		
		JLabel labelSubject = new JLabel("Subject ", JLabel.TRAILING);
		JTextField fieldSubject = new JTextField(10);
		labelSubject.setLabelFor(fieldSubject);
		panel.add(labelSubject);
		panel.add(fieldSubject);
		
		JLabel labelProf = new JLabel("Professor ", JLabel.TRAILING);
		JTextField fieldProf = new JTextField(10);
		labelProf.setLabelFor(fieldProf);
		panel.add(labelProf);
		panel.add(fieldProf);
		
		JLabel labelClassroom = new JLabel("Classroom ", JLabel.TRAILING);
		JTextField fieldClassroom = new JTextField(10);
		labelClassroom.setLabelFor(fieldClassroom);
		panel.add(labelClassroom);
		panel.add(fieldClassroom);
		
		JButton saveButton = new JButton("save");
		saveButton.addActionListener(new StudyAdderListener(fieldCode, fieldSubject, fieldProf, fieldClassroom, studyManager));
		
		JButton cancelButton = new JButton("cancel");
		cancelButton.addActionListener(new StudyAdderCancelListener(frame));
		
		panel.add(saveButton);
		panel.add(cancelButton);
		
		SpringUtilities.makeCompactGrid(panel, 5, 2, 6, 6, 6, 6);
		
		this.add(panel);
		this.setVisible(true);

	}
}
