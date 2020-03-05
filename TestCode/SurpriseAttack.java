
public class SurpriseAttack implements SpecialMove
{
	DungeonCharacter character;
	DungeonCharacter opponent;
	
	public SurpriseAttack(DungeonCharacter thisCharacter)
	{
		this.character = thisCharacter;
		this.opponent = opponent;
	}
	
	public void doSpecialMove()
	{
		double surprise = Math.random();
		//int turns = super.getNumTurns();
		if (surprise <= .4)
		{
			System.out.println("Surprise attack was successful!\n" +
								character.getName() + " gets an additional turn.");
			//turns++;
			this.character.attack(opponent);
			doSpecialMove();
		}//end surprise
		else if (surprise >= .9)
		{
			System.out.println("Uh oh! " + opponent.getName() + " saw you and" +
								" blocked your attack!");
		}
		else
		    this.character.attack(opponent);
		
	}

}
