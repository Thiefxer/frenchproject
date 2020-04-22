import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		int choice = 0;
		System.out.println("---------------------------------------------------------------------------------");
		System.out.println("Welcome to  Surviving the French Revolution");			// text for the player to read
		System.out.println("Please enter the number coresponding with the choice");
		System.out.println("1:Male");
		System.out.println("2:Female");
		System.out.println("---------------------------------------------------------------------------------");
		while (choice != 1 && choice != 2) { // Forces the player to make a choice of 1 or 2
			choice = in.nextInt();
			switch (choice) {

			case 1:
				Male();		//new class to separate the game into sections
				break;

			case 2:
				Female();
				break;

			default:
				System.out.println("That wasn't a choice"); // if the player makes an incorrect input
				break;
			}
		}
	}

	private static void Male() {
		Scanner in = new Scanner(System.in);
		int choice=0;
		String gender = "male";
		// TODO Auto-generated method stub
		System.out.println("---------------------------------------------------------------------------------");
		System.out.println("Welcome to the French Revolution random man");
		System.out.println("Choose how you want to live in this fake world");
		System.out.println("1:Commoner");
		System.out.println("2:Lawyer");
		System.out.println("3:Noble");
		System.out.println("---------------------------------------------------------------------------------");
		
		while (choice != 1 && choice != 2 && choice !=3) {
			choice = in.nextInt();
			switch (choice) {

			case 1:
				Commoner(gender);
				break;

			case 2:
				Lawyer();
				break;

			case 3:
				Nobel(gender);
				break;
			default:
				System.out.println("That wasn't a choice");
				break;
			}
		}
	}

	private static void Female() {
		Scanner in = new Scanner(System.in);
		int choice=0;
		String gender = "female";
		// TODO Auto-generated method stub
		System.out.println("---------------------------------------------------------------------------------");
		System.out.println("Welcome to the French Revolution random woman");
		System.out.println("Choose how you want to live in this fake world");
		System.out.println("1:Commoner");
		System.out.println("2:Noble");
		System.out.println("---------------------------------------------------------------------------------");
		while (choice != 1 && choice != 2) {
			choice = in.nextInt();
			switch (choice) {

			case 1:
				Commoner(gender);
				break;
				
			case 2:
				Nobel(gender);
				break;
			default:
				System.out.println("That wasn't a choice");
				break;
			}
		}
	}
	private static void Commoner(String gender) {
		Scanner in = new Scanner(System.in);
		int choice=0;
		if(gender=="male") {
		System.out.println("---------------------------------------------------------------------------------");	
		System.out.println("Welcome to the world common " + gender );
		System.out.println("You have read in the paper about the meeting of the Estates general");
		System.out.println("---------------------------------------------------------------------------------");
		}
		else
		System.out.println("---------------------------------------------------------------------------------");	
		System.out.println("Welcome to the world common " + gender );
		System.out.println("You have been told about the meeting of the Estates general");
		System.out.println("---------------------------------------------------------------------------------");
	}

	private static void Lawyer() {
		Scanner in = new Scanner(System.in);
		int choice=0;
		System.out.println("---------------------------------------------------------------------------------");
		System.out.println("Welcome to the world respected man");
		System.out.println("You have been asked to meet with the Estates general, a meeting with all 3 Estates to vote");
		System.out.println("1:Vote and do nothing about the 2:1 Estate majority");
		System.out.println("2:Become outraged and demand a redistribution of the vote");
		System.out.println("3:See what everyone else is doing and follow along");
		System.out.println("---------------------------------------------------------------------------------");
		while (choice != 1 && choice != 2 && choice !=3) {
			choice = in.nextInt();
			switch (choice) {
			case 1:		
			case 2:	
			case 3:
				break;
			default:
				System.out.println("That wasn't a choice");
				break;
			}	
		}
		choice=0;
		System.out.println("---------------------------------------------------------------------------------");
		System.out.println("The rest of the Third Estate is up in arms. They are protesting the unfair 2:1 majority of the upper Estates");
		System.out.println("You follow along and end up being locked out of the Estates room. Thinking quickly you all head to the indoor tennis court");
		System.out.println("The leader stands up and declares no one leaves until a new constitution is written");
		System.out.println("1:Help write the constitution and sign your name");
		System.out.println("2:Try and get people to return to the main room and stop France from changing");
		System.out.println("3:See what everyone else is doing and follow along");
		System.out.println("---------------------------------------------------------------------------------");
		while (choice != 1 && choice != 2 && choice !=3) {
			choice = in.nextInt();
			switch (choice) {
			case 1:		
			case 2:
			case 3:
				break;
			default:
				System.out.println("That wasn't a choice");
				break;
			}	
		}
		choice=0;
		System.out.println("---------------------------------------------------------------------------------");
		System.out.println("Rallying together you manage to scrape together a new constitution and demand reentry to the Estates General");
		System.out.println("Reluctantly the King reopens the doors and hears what you have to say");
		System.out.println("France is changing and with it comes a new National Constituent Assembly");
		System.out.println("1:Try and get elected being fueld by the revolutionary spirits of your brethren");
		System.out.println("2:Return home believing you did a good job as a representative of the people");
		System.out.println("3:Try and join the assembly but as a spy to bring back the monarchy");
		System.out.println("---------------------------------------------------------------------------------");
		while (choice != 1 && choice != 2 && choice !=3) {
			choice = in.nextInt();
			switch (choice) {
			case 1:	choice =0;
					System.out.println("---------------------------------------------------------------------------------");
					System.out.println("You get elected and get to join the National Constituent Assembly ");
					System.out.println("You hear that the commoners are scared of the other 2 Estates trying to gain power");
					System.out.println("They rebel against their land owners and the goverment, News of the Bastille falling");
					System.out.println("Reaches the assembly, the population is out of control");
					System.out.println("1:Use the army to control the population and return to normal");
					System.out.println("2:Abolish the Feudal system and hope that pleases the people");
					System.out.println("3:Focus on a broad news based campaign to deliver truth and placate the people");
					System.out.println("---------------------------------------------------------------------------------");
					while (choice != 1 && choice != 2 && choice !=3) {
						choice = in.nextInt();
						switch (choice) {
						case 1:		
						case 2:
						case 3:
							System.out.println("---------------------------------------------------------------------------------");
							System.out.println("The Assembly abolishs the Feudal system and redistributes noble and church lands");
							System.out.println("---------------------------------------------------------------------------------");
							Terror();
							break;
						default:
							System.out.println("That wasn't a choice");
							break;
						}	
					}
				break;
			case 2:
				System.out.println("---------------------------------------------------------------------------------");
				System.out.println("Return home with pride and watch from the chaos from the commoners ");
				System.out.println("---------------------------------------------------------------------------------");
				Terror();
				break;
			case 3:
				System.out.println("---------------------------------------------------------------------------------");
				System.out.println("You fail to get elected to the National Constituent Assembly ");
				System.out.println("Return home in shame and watch from the sidelines ");
				System.out.println("---------------------------------------------------------------------------------");
				Terror();
				break;
			default:
				System.out.println("That wasn't a choice");
				break;
			}	
		}
	}

	

	private static void Nobel(String gender) {
		Scanner in = new Scanner(System.in);
		int choice=0;
		if(gender=="male") {
			gender = "Lord";// changes the male and female to lord or lady for the noble players
			System.out.println("---------------------------------------------------------------------------------");
			System.out.println("Welcome to the world Noble " + gender );
			System.out.println("You have been asked to meet with the Estates general");
			System.out.println("1:Vote and use your 2:1 majority to silence the Third Estate");
			System.out.println("2:Refuse to vote to support the Third Estate");
			System.out.println("3:See what everyone else is doing and follow along");
			System.out.println("---------------------------------------------------------------------------------");
			while (choice != 1 && choice != 2 && choice !=3) {
				choice = in.nextInt();
				switch (choice) {

				case 1:
					
					break;
					
				case 2:
					
					break;
					
				case 3:
					
					break;
				default:
					System.out.println("That wasn't a choice");
					break;
				}
			}
			
			
		}						
		else gender = "Lady";
		System.out.println("---------------------------------------------------------------------------------");
		System.out.println("Welcome to the world Noble " + gender );
		System.out.println("You have been told about the meeting of the Estates general");
		System.out.println("---------------------------------------------------------------------------------");
		
	}
	private static void Terror() {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the terror");
		
	}

}
