package com.pillartechnology.main;

public class South extends Direction {

	@Override
	public Direction turnLeft() {
		return Direction.EAST;
	}

	@Override
	public Direction turnRight() {
		return Direction.WEST;
	}

	@Override
	public Point moveForward(Point currentPoint) {
		return new Point(currentPoint.getX(), currentPoint.getY()-1);
	}
	
	@Override
	public String toString() {
		return "S";
	}

}