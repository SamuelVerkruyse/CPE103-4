import java.util.Scanner;

public class myBinaryHeap_Test {
	public static void main(String [ ] args)
    {
        myBinaryHeap<String> test = new myBinaryHeap<String>( );
        Scanner in = new Scanner(System.in);//Creates a scanner for user input
		//System.out.println("Type your table size");//Prompt for the table size
        System.out.println("Choose one of the following operations:");//Prompts user to choose an option
		System.out.println("-add/insert (enter the letter a)");
		System.out.println("-delete (enter the letter d)");
		System.out.println("-is empty (enter the letter e)");
		System.out.println("-size (enter the letter s)");
		System.out.println("-print (enter the letter p)");
		System.out.println("-Quit (enter the letter q)");
		char userInput = in.nextLine().charAt(0);//Notes the user's choice
		do{
			switch (userInput) {//Switch statement utilizing user input
				case 'a': System.out.println("Enter the string you want to add:");//Prompts user to push an int
						String pushee = in.nextLine();
						test.insert(pushee);//Pushes whatever they chose to push
						System.out.println(test.toString());
						System.out.println(pushee + " inserted");//Lets the user know that their data was pushed
						System.out.println("Make a choice from the menu");//Prompts another choice to be made
						userInput = in.nextLine().charAt(0);
						break;
				case 'd': if(test.size() == 0)
							System.out.println("Invalid operation on an empty heap");
						else{
						test.deleteMin();
						System.out.println("Minimum was removed");
						}
						System.out.println("Make a choice from the menu");//Prompts another choice to be made
						userInput = in.nextLine().charAt(0);
						break;
				case 'e': if(test.isEmpty()){//If the table is empty
							System.out.println("Empty");//Let them know the table is empty
						}
						else{//Otherwise
							System.out.println("Not Empty");//Let them know the table is not empty
						}
						System.out.println("Make a choice from the menu");//Prompts another choice to be made
						userInput = in.nextLine().charAt(0);
						break;
				case 'p': System.out.println(test.toString());
						System.out.println("Make a choice from the menu");//Prompts another choice to be made
						userInput = in.nextLine().charAt(0);
						break;
				case 's': System.out.println(test.size());
						System.out.println("Make a choice from the menu");//Prompts another choice to be made
						userInput = in.nextLine().charAt(0);
						break;
				case 'q': System.out.println("quitting"); //Quit if the user hits the quit key
						break;
				default: System.out.println("Invalid choice"); //If they choose a different character, let them know that's not allowed, strictly speaking
						System.out.println("Make a choice from the menu");//Prompts another choice to be made
						userInput = in.nextLine().charAt(0);
						break;
			}
		}while(userInput != 'q');
    }
}
