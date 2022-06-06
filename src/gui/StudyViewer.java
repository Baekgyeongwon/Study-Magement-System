package gui;

import java.util.Vector;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import manager.StudyManager;
import study.StudyInput;

public class StudyViewer extends JPanel{
	
	WindowFrame frame;
	
	StudyManager studyManager;

	public StudyViewer(WindowFrame frame, StudyManager studyManager) {
		this.frame = frame;
		this.studyManager = studyManager;
		
		System.out.println("***"+studyManager.size()+"***");
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Code");
		model.addColumn("Subject");
		model.addColumn("Professor");
		model.addColumn("Classroom");
		
		for(int i=0; i<studyManager.size(); i++) {
			Vector row = new Vector();
			StudyInput si = studyManager.get(i);
			row.add(si.getCode());
			row.add(si.getSubject());
			row.add(si.getProf());
			row.add(si.getClassroom());
			model.addRow(row);
		}
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
		
	}
}
