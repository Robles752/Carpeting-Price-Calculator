public class RoomDimension 
{
  //fields.
	private double length; // holds the room length.
	private double width;  // holds the room width.
	
	/**
	 * Constructor.
	 * @param len: gets the length of a room.
	 * @param w: gets the width of a room.
	 */
	public RoomDimension(double len, double w)
	{
		length = len;
		width = w;
	}
	/**
	 * accessor method.
	 * @return gets the area of the room when called upon and returns the value.
	 */
	public double getArea()
	{
		return length * width;
	}
	
}
