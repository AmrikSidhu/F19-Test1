
public class Snake {
	private String name;
	private int length; // the length of the snake, in feet
	private String favoriteFood;
	
	/**
	 * Creates a new Snake object.
	 * @param name			the name of the snake
	 * @param length		length of the snake
	 * @param favoriteFood	what the snake likes to eat
	 */
	public Snake(String name, int length, String favoriteFood) {
		this.name = name;
		this.length = length;
		this.favoriteFood = favoriteFood;
	}

	
	/**
	 * Snakes are healthy if they love vegetables
	 * @return true if snake is healthy
	 */
	public boolean isHealthy() {
		return this.favoriteFood.equals("vegetables");
	}

	
	/**
	 * Checks if snake will fit in a cage 
	 * @return true if the length of the snake is less than the cage length
	 */
	public boolean fitsInCage(int cageLength) {
		return this.length < cageLength;
	}
}
