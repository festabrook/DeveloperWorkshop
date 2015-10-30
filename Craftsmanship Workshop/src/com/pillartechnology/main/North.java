package com.pillartechnology.main;

public class North extends Direction {

	@Override
	public Direction turnLeft() {
		return Direction.WEST;
	}

	@Override
	public Direction turnRight() {
		return Direction.EAST;
	}

	@Override
	public Point moveForward(Point currentPoint) {
		return new Point(currentPoint.getX(), currentPoint.getY() + 1);
	}

	@Override
	public String toString() {
		return "N";
	}
}