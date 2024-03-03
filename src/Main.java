import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println("Hello World"+ " " + "It's time to change");
    // This is a single line comment
    /* This is a double line comment*/
    System.out.println();
    Scanner scanner= new Scanner(System.in);
    System.out.println("What is your name");
    String name= scanner.nextLine();

    
    System.out.println("What is your age");
    int age= scanner.nextInt();
   
    
    System.out.println("What is your fav food");
    String food= scanner.next();
 
    
    
    System.out.println("Hello"+ "   " +name);
    System.out.println("I am "+age+"  years old");
    System.out.println("fav food "+ food);
    
	}

}
