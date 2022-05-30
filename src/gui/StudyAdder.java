package gui;

import javax.swing.*;

public class StudyAdder extends JFrame{
	
	public StudyAdder() {
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
		
		panel.add(new JButton("save"));
		panel.add(new JButton("cancel"));
		
		SpringUtilities.makeCompactGrid(panel, 5, 2, 6, 6, 6, 6);
		
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setContentPane(panel);
		this.setVisible(true);

	}
}
