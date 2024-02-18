import java.util.Scanner;

public class gameapp {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		game_character Knight = new game_character(new knight());
		game_character Wizard = new game_character(new wizard());
		game_character Archer = new game_character(new archer());
		
		
		 System.out.print("Choose a character to use: \n [1] Knight\n [2] Archer\n [3] Wizard\nEnter Selection : ");
	     int choice = input.nextInt();
	     
	     switch (choice) {
	       case 1:
	    	   System.out.println("You've chosen Knight!");
	    	   System.out.print("\nChoose what to do? \n [1] Attack\n [2] Defend\nEnter Selection : ");
	    	   int skill = input.nextInt();
	    	   switch(skill) {
	    	   		case 1:
	    	   			Knight.attack();
	    	   			break;
	    	   		case 2: 
	    	   			Knight.defend();
	    	   			break;
	    	   		default:
	    	   			System.out.println("Please enter valid input");
	    	   			break;
	    	   }
	    	   
	    	   break;
	    	   
	       case 2:
	    	   System.out.println("You've chosen Archer!\n");
	    	   System.out.print("Choose what to do? \n [1] Attack\n [2] Defend\nEnter Selection: ");
	    	   int attri = input.nextInt();
	    	   switch(attri) {
	    	   		case 1:
	    	   			Archer.attack();
	    	   			break;
	    	   		case 2: 
	    	   			Archer.defend();
	    	   			break;
	    	   		default:
	    	   			System.out.println("Please enter valid input");
	    	   			break;
	    	   }
	    	   
	    	   break;
	    	   
	       case 3: 
	    	   System.out.println("You've chosen Wizard!\n");
	    	   System.out.print("Choose what to do? \n [1] Attack\n [2] Defend\nEnter Selection: ");
	    	   int power = input.nextInt();
	    	   switch(power) {
	    	   		case 1:
	    	   			Wizard.attack();
	    	   			break;
	    	   		case 2: 
	    	   			Wizard.defend();
	    	   			break;
	    	   		default:
	    	   			System.out.println("Please enter valid input");
	    	   			break;
	    	   }
	    	   
	    	   break;
	    	   
	       default:
	    	   System.out.println("Please enter valid input.");
	    	   break;
	     }
        

	}

}