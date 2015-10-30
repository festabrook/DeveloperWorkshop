package com.pillartechnology.main;

public enum Direction {
	NORTH('N'),
	EAST('E'),
	SOUTH('S'),
	WEST('W');
	
	char letterDirection;

	private Direction(char letterDirection) {
		this.letterDirection = letterDirection;
	}

	public static Direction parseDirection(Character dir) {
		for (Direction direction : Direction.values()) {
			if(direction.letterDirection == dir){
				return direction;
			}
		}
		throw new RuntimeException("Boom!");
	}
	
}