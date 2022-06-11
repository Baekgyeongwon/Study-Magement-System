package listners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import gui.WindowFrame;

public class StudyAdderCancelListener implements ActionListener{
	WindowFrame frame;

	public StudyAdderCancelListener(WindowFrame frame) {
		this.frame = frame;
	}
	
	public void actionPerformed(ActionEvent e) {
		frame.getContentPane().removeAll();
		frame.getContentPane().add(frame.getMenuselection());
		frame.revalidate();
		frame.repaint();
	}

}
