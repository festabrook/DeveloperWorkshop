package com.pillartechnology.main;

import java.util.logging.Logger;

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

	private static final Logger LOGGER = Logger.getLogger(ConTractorM.class.getName());
	
	private static Character dir;
	private static int x;
	private static int y;
	private static String cmds;

	public static void main(String[] args) {

		// Initialization
		dir = 'N';
		x = 0;
		y = 0;
		cmds = "";

		// Parse from file
		dir = args[0].charAt(0);
		x = Integer.parseInt(args[1]);
		y = Integer.parseInt(args[2]);
		cmds = args[3];

		// Initial logging
		System.out.println("The tractor is starting at: " + getX() + "," + y);
		System.out.println("and is facing: " + getDir());

		// process commands
		for (Character c : cmds.toCharArray()) {
			System.out.println("executing command: " + c);
			execute(c);
		}

		// Output
		System.out.println("The tractor is now at: " + getX() + "," + y);
		System.out.println("and is facing: " + getDir());
	}

	/**
	 * All logic for executing commands is in this method
	 * @param Character c
	 */
	private static void execute(Character c) {
		if (c == 'L') {
			switch (dir) {
			case 'N':
				setDir('W');
				break;
			case 'E':
				setDir('N');
				break;
			case 'S':
				setDir('E');
				break;
			case 'W':
				setDir('S');
				break;
			}
		} else if (c == 'R') {
			switch (dir) {
			case 'N':
				setDir('E');
				break;
			case 'E':
				setDir('S');
				break;
			case 'S':
				setDir('W');
				break;
			case 'W':
				setDir('N');
				break;
			}
		} else if (c == 'M') {
			switch (dir) {
			case 'N':
				y++;
				break;
			case 'E':
				x++;
				break;
			case 'S':
				y--;
				break;
			case 'W':
				x--;
				break;
			}
		}
	}

	public static Logger getLogger() {
		return LOGGER;
	}

	public static Character getDir() {
		return dir;
	}

	public static void setDir(Character dir) {
		ConTractorM.dir = dir;
	}

	public static int getX() {
		return x;
	}

	public static void setX(int x) {
		ConTractorM.x = x;
	}

	public static int getY() {
		return y;
	}

	public static void setY(int y) {
		ConTractorM.y = y;
	}
}
