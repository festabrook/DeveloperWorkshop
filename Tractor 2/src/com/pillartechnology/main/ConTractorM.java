package com.pillartechnology.main;

/**
 * 
 * A simple program to control the operations of the tractor given a starting
 * position and a string of commands.
 * 
 * @author John Doe
 * @version 1.0
 * @since 2015-03-31
 */
public class ConTractorM {

	private static Character dir;
	private static String cmds;
	private static Direction heading;
	private static Tractor tractor;

	public static void main(String[] args) {

		dir = args[0].charAt(0);
		int x = Integer.parseInt(args[1]);
		int y = Integer.parseInt(args[2]);
		cmds = args[3];
		heading = Direction.parseDirection(dir);
		Point currentLocation = new Point(x,y);
		tractor = new Tractor(heading, currentLocation);

		System.out.println("The tractor is starting at: " + currentLocation);
		System.out.println("and is facing: " + heading.letterDirection);

		for (Character c : cmds.toCharArray()) {
			System.out.println("executing command: " + c);
			execute(c);
		}

		System.out.println("The tractor is now at: " + currentLocation);
		System.out.println("and is facing: " + heading.letterDirection);
	}

	private static void execute(Character c) {
		if (c == 'L') {
			tractor.turnLeft();
		} else if (c == 'R') {
			tractor.turnRight();
		} else if (c == 'M') {
			tractor.moveForward();
		}
	}
}
