import java.util.Scanner;

public class DungeonTester {
	public static void main(String args[]) {
		
		boolean playAgain = true;
		
		
		while(playAgain == true) {
		
		
		
		DungeonCharacter hero = chooseDungeonCharacter();
		
		DungeonCharacter monster = chooseRandomMonster();
		
		
		

		battle(hero, monster);
		
		
		
		
		
		}
	}
	public static DungeonCharacter chooseDungeonCharacter() {
		DungeonCharacterFactory heroFactory = new DungeonCharacterFactory();
		
		DungeonCharacter hero;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Pick a hero:");
		System.out.println("1: Theif");
		System.out.println("2: Sorceress");
		System.out.println("3: Warrior");
		
		int choice = input.nextInt();
		
		if(choice == 1) {
			//heroFactory.createThief(name);
		}
		else if (choice == 2) {
			System.out.println("Enter a name for your hero: ");
			String name = input.next();
			return heroFactory.createSorceress(name);
		}
		else if (choice == 3) {
		//	heroFactory.createWarrior(name);
		}
		
		return null;
		
	}
	
	public static DungeonCharacter chooseRandomMonster() {
		int choice;

		choice = (int)(Math.random() * 3) + 1;

		switch(choice)
		{
			case 1: return new Ogre();

			case 2: return new Gremlin();

			case 3: return new Skeleton();

			default: System.out.println("invalid choice, returning Skeleton");
				     return new Skeleton();
		}
	
	}
	
	public static void battle(DungeonCharacter theHero, DungeonCharacter theMonster)
	{
		
		
		
		
		Scanner input = new Scanner(System.in);
		String pause = "p";
		System.out.println(theHero.getName() + " battles " +
							theMonster.getName());
		System.out.println("---------------------------------------------");

		//do battle
		
		while (theHero.isAlive() && theMonster.isAlive() && !pause.equals("q"))
		
		{
			int turns = battleOptions(theHero,theMonster);
		    while(turns > 0) {
		    	System.out.println("Option 1: Attack");
		    	System.out.println("Option 2: " + theHero.getSpecialMove().getName());
		    	int option = input.nextInt();
		    	if(option == 1) {
		    		theHero.attack(theMonster);
		    	}
		    	else if(option == 2) {
		    		theHero.doSpecialMove();
		    	}
		    	else {
		    		System.out.println("default to option 1");
		    		
		    	}
		    	turns = turns-1;
		    }

			//monster's turn (provided it's still alive!)
			if (theMonster.isAlive())
			    theMonster.attack(theHero);

			//let the player bail out if desired
			System.out.print("\n-->q to quit, anything else to continue: ");
			pause = input.next();

		}//end battle loop

		if (!theMonster.isAlive())
		    System.out.println(theHero.getName() + " was victorious!");
		else if (!theHero.isAlive())
			System.out.println(theHero.getName() + " was defeated :-(");
		else//both are alive so user quit the game
			System.out.println("Quitters never win ;-)");

	}//end battle method
	
	public static int battleOptions(DungeonCharacter hero, DungeonCharacter monster) {
		int numberOfTurns = hero.getAttackSpeed()/monster.getAttackSpeed();
		
			if (numberOfTurns == 0)
				numberOfTurns++;

			System.out.println("Number of turns this round is: " + numberOfTurns);
			return numberOfTurns;
	}
}
		

