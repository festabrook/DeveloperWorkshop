package com.pillartechnology.main;

public class East extends Direction {

	@Override
	public Direction turnLeft() {
		return Direction.NORTH;
	}

	@Override
	public Direction turnRight() {
		return Direction.SOUTH;
	}

	@Override
	public Point moveForward(Point currentPoint) {
		return new Point(currentPoint.getX() +1, currentPoint.getY());
	}
	
	@Override
	public String toString() {
		return "W";
	}

}