import java.util.Scanner;

public class Nestedloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	int rows;
		int columns;
		String symbol ="";
		
		Scanner scanner= new Scanner(System.in);
	    System.out.println("Number of rows");
	    rows=scanner.nextInt();
	    
	    System.out.println("Number of columns");
	   columns =scanner.nextInt();
	   
	   System.out.println("Enter the symbol");
	   symbol =scanner.next();
	    for (int i=1;i<=rows;i++) {
	    System.out.println();
	    	 for (int j=1;j<=columns;j++)
	    	 {
	    		 System.out.print(symbol); 
	    	 }
	    }*/

	    String[][] cars= { {"Genesis","Lexus"},{"Acura","Jeep"},{"Accord","Lincon"}};
	 for (int i=0;i<cars.length;i++) {
		 System.out.println();
		 for (int j=0;j<cars[i].length;j++) {
			 System.out.println(cars[i][j]);
			 
		 }
		 
	 }
	}

}
