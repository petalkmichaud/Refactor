
public class CrushingBlow implements SpecialMove
{
	DungeonCharacter character;
	DungeonCharacter opponent;
	
	public CrushingBlow(DungeonCharacter thisCharacter, DungeonCharacter opponent)
	{
		this.character = thisCharacter;
		this.opponent = opponent;
	}

	public void doSpecialMove() 
	{
		if (Math.random() <= .4)
		{
			int blowPoints = (int)(Math.random() * 76) + 100;
			System.out.println(character.getName() + " lands a CRUSHING BLOW for " + blowPoints
								+ " damage!");
			this.opponent.subtractHitPoints(blowPoints);
		}//end blow succeeded
		else
		{
			System.out.println(character.getName() + " failed to land a crushing blow");
			System.out.println();
		}//blow failed
		
	}
	
	public String getName()
	{
		return "Crushing Blow";
	}
	
}
