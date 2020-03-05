
public class Theif implements DungeonCharacter{

	
	private int hitPoints = 75;
	private int attackSpeed = 5;
	private double chanceToHit = 0.7;
	private int minDamage = 25;
	private int maxDamage = 50;
	private double blockChance = 0.3;
	private String cName;
	
	
	@Override
	public void doSpecialMove() {
		//
		
	}
	
	public Theif(String cName) {
		this.cName = cName;
	}
	@Override
	public String getName() {
		return this.cName;
	}

	@Override
	public int getHitPoints() {
		return this.hitPoints;
	}

	@Override
	public int getAttackSpeed() {
		return this.attackSpeed;
	}

	
	@Override
	public void subtractHitPoints(int hitPoints) {
		if(Math.random() <= blockChance) {
			System.out.println(this.getName() + " BLOCKED the attack!");
		}
		else {
			if (hitPoints <0)
				System.out.println("Hitpoint amount must be positive.");
			else if (hitPoints >0)
			{
				this.hitPoints -= hitPoints;
				if (this.hitPoints < 0)
					this.hitPoints = 0;
				System.out.println(getName() + " hit " +
									" for <" + hitPoints + "> points damage.");
				System.out.println(getName() + " now has " +
									getHitPoints() + " hit points remaining.");
				System.out.println();
			}//end else if

			if (this.hitPoints == 0)
				System.out.println(this.getName() + " has been killed :-(");

		}

		}
	@Override
	public void addHitPoints(int hitPoints) {
		this.hitPoints += hitPoints;
		
	}

	@Override
	public void attack(DungeonCharacter opponent) {
		// TODO Auto-generated method stub
		
	}
	public boolean isAlive() {
		if(this.hitPoints <= 0) {
			return false;
		}
		return true;
	}

	@Override
	public SpecialMove getSpecialMove() {
		// TODO Auto-generated method stub
		return null;
	}

}
