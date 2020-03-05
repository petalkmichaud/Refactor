
public class Gremlin implements DungeonCharacter,Attack{

	private int hitPoints = 70;
	private int attackSpeed = 5;
	private double chanceToHit = 0.8;
	private double chanceToHeal = 0.4;
	private int minDamage = 15;
	private int maxDamage = 30;
	private double blockChance = 0;
	private final int MIN_ADD = 20;
	private final int MAX_ADD = 40;
	
	
	private SpecialMove heal = new Heal(this, MIN_ADD, MAX_ADD);
	@Override
	public void doSpecialMove() {
		heal.doSpecialMove();
	}
	@Override
	public String getName() {
		return "Gremlin";
		
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
		this.hitPoints = this.hitPoints - hitPoints;
		
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
