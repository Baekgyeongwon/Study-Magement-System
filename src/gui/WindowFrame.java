package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import manager.StudyManager;

public class WindowFrame extends JFrame{

	StudyManager studyManager;
	
	MenuSelection menuselection;
	StudyAdder studyadder;
	StudyViewer studyviewer;
	
	public WindowFrame(StudyManager studyManager) {
		this.setSize(500,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("My Frame");
		
		this.studyManager = studyManager;
	    menuselection = new MenuSelection(this);
		studyadder = new StudyAdder(this);
		studyviewer = new StudyViewer(this, this.studyManager);
		
		this.add(menuselection);
	
		this.setVisible(true);
	}
	
	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
	}
	
	public MenuSelection getMenuselection() {
		return menuselection;
	}

	public void setMenuselection(MenuSelection menuselection) {
		this.menuselection = menuselection;
	}

	public StudyAdder getStudyadder() {
		return studyadder;
	}

	public void setStudyadder(StudyAdder studyadder) {
		this.studyadder = studyadder;
	}

	public StudyViewer getStudyviewer() {
		return studyviewer;
	}

	public void setStudyviewer(StudyViewer studyviewer) {
		this.studyviewer = studyviewer;
	}

}
