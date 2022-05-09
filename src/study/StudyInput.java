package study;

import java.util.Scanner;

public interface StudyInput {

	public int getCode();

	public void setCode(int code);

	public void setSubject(String subject);

	public void setProf(String prof);

	public void setClassroom(String classroom);
	
	public void getUserInput(Scanner input);

	public void printInfo();


}
