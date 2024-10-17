import java.util.Scanner;

public class Comp132Lab0 {
	// Don't forget to include the Pledge og Honor
	/* *********** Pledge of Honor ************************************************
	*
	* I hereby certify that I have completed this lab assignment on my own
	* without any help from anyone else. I understand that the only sources of authorized
	* information in this lab assignment are (1) the course textbook, (2) the
	* materials  posted at the course website and (3) any study notes handwritten by myself.
	import java.util.Scanner;

public class Comp132Lab0 {
	// Don't forget to include the Pledge og Honor
	/* *********** Pledge of Honor ************************************************
	*
	* I hereby certify that I have completed this lab assignment on my own
	* without any help from anyone else. I understand that the only sources of authorized
	* information in this lab assignment are (1) the course textbook, (2) the
	* materials  posted at the course website and (3) any study notes handwritten by myself.
	*
	* I have not used, accessed or received any information from any other unauthorized
	* source in taking this lab assignment. The effort in the assignment thus belongs
	* completely to me.
	*
	*  READ AND SIGN BY WRITING YOUR NAME SURNAME AND STUDENT ID
	*  SIGNATURE:   <Gülten Ede,    Student id>83785
	* 
	********************************************************************************/

	public static void main(String[] args) {
		

		// TODO:  1.  Define Variables: Define three variables of type double, namely distance, fuelConsumptionRate, and fuelPrice.
		
		 double distance;
		 double fuelConsumptionRate;
		 double fuelPrice;
		
		// TODO:  2. User Input: Let the user input three values:
		

			// distance: The total distance of the road trip (in kilometers).	
			// fuelConsumptionRate: The fuel consumption rate of the vehicle (in liters per 100 kilometers).
			//fuelPrice: The price of fuel per liter (in your local currency).

		// Note: You can use the defined input object of type Scanner to get input from the user.
		Scanner input = new Scanner(System.in);
		
		System.out.println("The total distance of the road trip (in kilometers).");
		distance    =input.nextDouble();
		
		System.out.println("The fuel consumption rate of the vehicle (in liters per 100 kilometers)");
		fuelConsumptionRate= input.nextDouble();
		
		System.out.println("The price of fuel per liter (in your local currency).");
		fuelPrice=input.nextDouble();
		
		
		// TODO:  3. Calculation: Write code that calculates the Total Fuel Cost.
                // totalCost = (distance/100) × fuelConsumptionRate × fuelPrice.
		
		double totalCost = (distance/100) * fuelConsumptionRate * fuelPrice ;

		// TODO:  4. Display the Result: Use System.out.println to display the total cost of the trip to the user.
		System.out.println(totalCost);

		// TODO:  5. Personalize with Your Information:
		
			// Define an object of type String, and store the string values of your name and surname in this object.
			// Define a variable of type int, and store your KUSIS ID number in this variable.
			// Use System.out.println to display your name, surname, and KUSIS ID number.
		String name= "Gülten Ede" ;
		int id= 83785 ;
		System.out.println ("Name Surname: " +name +" ID: "+ id) ;
		

		// TODO:  6. Explore Unicode: Write the code for displaying the integer equivalents of the letters in your name and surname.
		
		for (char a : name.toCharArray()) {
            System.out.println(a + ": " + (int) a);
        }


	}

}
