package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
	Robot r2d2 = new Robot();
	r2d2.move(50);
	r2d2.setSpeed(190);
	r2d2.move(50);
	r2d2.turn(180);
	r2d2.move(150);
	r2d2.setPenColor(Color.blue);
	r2d2.penDown();
	for(int i=0; i<4; i++) {
	r2d2.move(100);
	r2d2.turn(90);
	}
	r2d2.penUp();
	r2d2.turn(180);
	r2d2.move(100);
	r2d2.setPenColor(Color.PINK);
	r2d2.turn(-90);
	r2d2.penDown();
	for(int i=0; i<3; i++) {
	r2d2.move(80);
	r2d2.turn(120);
	}
	}
}
