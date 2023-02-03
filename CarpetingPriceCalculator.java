import javax.swing.JOptionPane; // imports the GUI

public class CarpetingPriceCalculator 
{

	public static void main(String[] args) 
	{
		//accepts the users input for the rooms length and stores it in the userLength variable.
		String userLength = JOptionPane.showInputDialog("Enter the length of the room.");
		
		//accepts the users input for the rooms width and stores it in the userLength variable.
		String userWidth = JOptionPane.showInputDialog("Enter the width of the room.");
	
		// creates a RoomDimension object called userRoomSize from the class that stores the users input for the rooms dimensions.
		// The userLength and userWidth variables are converted from strings to doubles to be accepted.
		RoomDimension userRoomSize = new RoomDimension(Double.parseDouble(userLength),Double.parseDouble(userWidth));
		
		//accepts the users input for the price per square feet and stores it in the userSQFT variable.
		String userSQFT = JOptionPane.showInputDialog("Enter the price per square foot of the desired carpeting");
		
		//Creates a RoomCarpet object from the class called userPrice that stores the userRoomSize and userSQFT variables.
		RoomCarpet userPrice = new RoomCarpet(userRoomSize, Double.parseDouble(userSQFT));
		
		// Displays the price of the carpeting by calling getTotalCost method which calculates the price.
		JOptionPane.showMessageDialog(null, "The carpeting price for the room is $" + userPrice.getTotalCost());
	}

}
