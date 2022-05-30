package gui;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class StudyViewer extends JFrame{

	public StudyViewer() {
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Code");
		model.addColumn("Subject");
		model.addColumn("Professor");
		model.addColumn("Classroom");
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
		
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
}
