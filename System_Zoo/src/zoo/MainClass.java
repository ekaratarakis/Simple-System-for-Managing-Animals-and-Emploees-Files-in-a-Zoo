package zoo;

import java.text.ParseException;
import java.util.Scanner;


public class MainClass {

	public static void main(String[] args) throws ParseException
	{
		Scanner scan = new Scanner(System.in);
		int choice = 0, ZooNum = 0;
		String name = null, town, sentence;
		Zoo Zoos[] = new Zoo[1];
		
		do
		{
			printMenu();
			do
			{
				choice = scan.nextInt();
				sentence = scan.nextLine();  // clean \n from buffer of the scanner
				if(choice<1 || choice >9) 
				{
					System.out.println("Wrong input. Please try again.");
				}
			}while(choice<1 || choice >9);
			
			if(choice==1)
			{
				if(ZooNum==1) 
				{
					System.out.println("Hospitals list is full. You can't insert more than one Zoo. Thank you.");
				}
				else
				{
					System.out.println("Give zoo name: ");
					name = scan.nextLine();	
					System.out.print("Give the city where the zoo is located.:");
					town = scan.nextLine(); 
					Zoos[ZooNum] = new Zoo(name,town);
					ZooNum++; 
				}
				
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}while(choice!=9);

	}
	
	
	//METHOD FOR PRINTING THE MENU FOR THE USER/USERS
		public static void printMenu()
		{
			//ekthetei tis epiloges kai zhtaei apo to xrhsth na epileksei
			System.out.println("MENU");
			System.out.println("Please give your choice.");
			System.out.println("1. Insert Zoo - There is only one Zoo.");
			System.out.println("2. Print all features of the Zoo.");
			System.out.println("3. Insert Employee.");
			System.out.println("4. Insert Animal.");
			System.out.println("5. Delete Animal.");
			System.out.println("6. Find Employee.");
			System.out.println("7. Find Animal.");
			System.out.println("8. Print data");
			System.out.println("9. Exit");
		}	

}
