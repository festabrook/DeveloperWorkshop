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

	
	private static final char LEFT = 'L';
	private static final char RIGHT = 'R';
	private static final char MOVE = 'M';

	private static Direction heading;
	private static Point currentLocation;
	private static String cmds;

	public static void main(String[] args) {

		int horizontal = Integer.parseInt(args[1]);
		int vertical = Integer.parseInt(args[2]);
		
		heading = Direction.getDirection(args[0].charAt(0));
		currentLocation = new Point(horizontal, vertical);
		
		cmds = args[3];

		System.out.println("The tractor is starting at: " + currentLocation.getX() + "," + currentLocation.getY());
		System.out.println("and is facing: " + heading);

		for (Character c : cmds.toCharArray()) {
			System.out.println("executing command: " + c);
			execute(c);
		}

		System.out.println("The tractor is now at: " + currentLocation.getX() + "," + currentLocation.getY());
		System.out.println("and is facing: " + heading);
	}

	private static void execute(Character directionalCommand) {
		if (directionalCommand == LEFT) {
			heading = heading.turnLeft();
		} else if (directionalCommand == RIGHT) {
			heading = heading.turnRight();
		} else if (directionalCommand == MOVE) {
			currentLocation = heading.moveForward(currentLocation);
		}
	}
}
