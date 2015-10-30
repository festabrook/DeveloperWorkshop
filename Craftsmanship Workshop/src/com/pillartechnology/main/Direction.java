package com.pillartechnology.main;

public abstract class Direction {

	public static final West WEST = new West();
	public static final East EAST = new East();
	public static final South SOUTH = new South();
	public static final North NORTH = new North();

	public abstract Direction turnLeft();

	public abstract Direction turnRight();
	
	public abstract Point moveForward(Point currentPoint);

	public static Direction getDirection(char direction) {

		Direction newDirection;

		switch (direction) {
		case 'N':
			newDirection = NORTH;
			break;

		case 'S':
			newDirection = SOUTH;
			break;

		case 'E':
			newDirection = EAST;
			break;

		case 'W':
			newDirection = WEST;
			break;

		default:
			throw new RuntimeException("Que?");

		}

		return newDirection;
	}

}