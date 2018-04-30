//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		Robot bob = new Robot();
		bob.penDown();
		bob.setSpeed(100);
		//3. Ask the user what color they would like the robot to draw
		for(int i = 0; i<=3;i++)
		{
		String color = JOptionPane.showInputDialog("what color do you wan the robot to draw");
		
		if(color .equals("red"))
		{
		bob.setPenColor(255,0,0);	
		}
		else if (color .equals("blue"))
		{
			bob.setPenColor(0,0,255);		
		}
		else if (color .equals("green"))
		{
			bob.setPenColor(0,255,0);		
		}
		else
		{
		bob.setRandomPenColor();	
		}
		//5. Use an if/else statement to set the pen color that the user requested

        //6. If the user doesn’t enter anything, choose a random color

        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		bob.setPenWidth(10);
		
	    //2. Make the robot draw a shape (this will take more than one line of code)
		bob.move(100);
		bob.turn(90);
		bob.move(100);
		bob.turn(90);
		bob.move(100);
		bob.turn(90);
		bob.move(100);
		bob.turn(90);


	}
}
}
