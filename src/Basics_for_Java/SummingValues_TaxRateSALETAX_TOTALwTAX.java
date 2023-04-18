package Basics_for_Java;

import ConsoleColors.consoleColors;

public class SummingValues_TaxRateSALETAX_TOTALwTAX {
//Week3 Methods
	public static void main(String[] args) {
		///Text ; System.out.println(consoleColors.ERASE + consoleColors.BLACK_BACKGROUND+ "////" + " //");  
		// specific text  ; System.out.println(consoleColors.ERASE);
//						    System.out.println(consoleColors.CYAN+"//");
		
		System.out.println(consoleColors.ERASE);
	    System.out.println(consoleColors.CYAN+"The method will sum the values of product1, product2, and product3. Then it will figure out the applicable sales tax using the \nvariable taxRate. Finally, the method should return a double that is the total order price with tax");
	    System.out.println(consoleColors.ERASE + consoleColors.BLACK_BACKGROUND+ "The method will sum the values of product1, product2, and product3. //can be writen as: \ndouble subTotal = product1 + product2 + product3;//");  

	    System.out.println(consoleColors.ERASE);
	    System.out.println(consoleColors.CYAN+"Then it will figure out the applicable sales tax using the variable taxRate.");
	    System.out.println(consoleColors.ERASE + consoleColors.BLACK_BACKGROUND+ "double taxAmount = subTotal * taxRate;" + " //");  
	
	    System.out.println(consoleColors.ERASE);
    System.out.println(consoleColors.CYAN+" Finally, the method should return a double that is the total order price with tax.");

    System.out.println(consoleColors.ERASE + consoleColors.BLACK_BACKGROUND+ "return subTotal + taxAmount;" + " //");  
	
	
    System.out.println(consoleColors.ERASE);
    System.out.println(consoleColors.CYAN+"In solution FOR QUESTION : orderTotal Method: Create a method called orderTotal that takes in \n4 doubles stored in product1, product2, product3, and taxRate. The method will sum the values \nof product1, product2, and product3. Then it will figure out the applicable sales tax using \nthe variable taxRate. Finally, the method should return a double that is the total order price with tax.\n"
    		+ "");
    System.out.println(consoleColors.ERASE);
  System.out.println(consoleColors.CYAN+"\n"
  + "	\n"
  + "		static double oderTotal( double product1, double product2, double product3, double taxRate) {\n"
  + "			\n"
  		+ "			\n"
  + "			\n"
  + "			subTotal is sum of the products\n"
  + "			\n"
  + "			double subTotal = product1 + product2+ product3;\n"
  + "			\n"
  		+ "			\n"
  + "			tax rate = tax amount\n"
  + "			double taxAmount = subTotal *taxRate;\n"+ "			\n"
 + "			 total of order with tax\n"
 + "			return subTotal + taxAmount;\n"
 + "			");
	
	
	}

}
