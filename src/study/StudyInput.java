package study;

import java.util.Scanner;

import exception.ClassroomFormatException;

public interface StudyInput {

	public int getCode();

	public void setCode(int code);

	public void setSubject(String subject);

	public void setProf(String prof);

	public void setClassroom(String classroom) throws ClassroomFormatException;
	
	public void getUserInput(Scanner input) throws ClassroomFormatException;

	public void printInfo();

	public void setStudyClassroom(Scanner input);


}
