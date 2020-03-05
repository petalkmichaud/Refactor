
public class Ogre implements DungeonCharacter{
	
	private int hitPoints = 200;
	private int attackSpeed = 2;
	private double chanceToHit = 0.6;
	private double chanceToHeal = 0.1;
	private int minDamage = 25;
	private int maxDamage = 50;
	private double blockChance = 0;
	private final int MIN_ADD = 30;
	private final int MAX_ADD = 50;
	
	
	private SpecialMove heal = new Heal(this, MIN_ADD, MAX_ADD);
	@Override
	public void doSpecialMove() {
		heal.doSpecialMove();
	}
	@Override
	public String getName() {
		return "Orge";
		
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

		

	@Override
	public void addHitPoints(int hitPoints) {
		this.hitPoints += hitPoints;
		
	}
	

	@Override
	public void attack(DungeonCharacter opponent) {
		System.out.println(this.getName() + " slowly swings a club toward's " + opponent.getName() + ":");
		
		

		if (Math.random() <= chanceToHit){
			int damage = (int)(Math.random() * (maxDamage - minDamage + 1)) + minDamage;
			opponent.subtractHitPoints(damage);
			System.out.println();
		}
		else{

			System.out.println(this.getName() + "'s attack on " + opponent.getName() + " failed!");
			System.out.println();
		}
	}
	@Override
	public boolean isAlive() {
		if(this.hitPoints <= 0) {
			return false;
		}
		return true;
	}
	@Override
	public SpecialMove getSpecialMove() {
		return this.heal;
	}

	


}
