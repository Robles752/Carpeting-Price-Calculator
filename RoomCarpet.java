public class RoomCarpet 
{
	//fields
	private RoomDimension size; // RoomDimension object as a field for the size.
	private double carpetCost;	//holds the carpet cost per square foot.
	
	/**
	 * Constructor
	 * @param dim: Gets the room size.
	 * @param cost: Gets the carpet cost per square foot.
	 */
	public RoomCarpet(RoomDimension dim, double cost)
	{
		size = dim;
		carpetCost = cost;
	}
	
	/**
	 * accessor method.
	 * @return Gets the total cost of the carpet by multiplying its area and cost per
	 * square foot and returns the value.
	 */
	
	public double getTotalCost()
	{
		return size.getArea() * carpetCost;
	}
	
}
