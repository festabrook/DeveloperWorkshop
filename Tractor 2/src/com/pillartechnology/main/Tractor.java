package com.pillartechnology.main;

public class Tractor {

	private Direction heading;
	private Point currentLocation;

	public Tractor(Direction heading, Point currentLocation) {
		this.heading = heading;
		this.currentLocation = currentLocation;
	}

	public void turnLeft() {
		
	}

	public void turnRight() {
		
	}

	public void moveForward() {
		switch (heading) {
		case NORTH:
			currentLocation = new Point(currentLocation.getX(), currentLocation.getY() + 1);
			break;
		case EAST:
			currentLocation = new Point(currentLocation.getX() + 1, currentLocation.getY());
			break;
		case SOUTH:
			currentLocation = new Point(currentLocation.getX(), currentLocation.getY() - 1);
			break;
		case WEST:
			currentLocation = new Point(currentLocation.getX() - 1, currentLocation.getY());
			break;
		}	}
	
	

}
