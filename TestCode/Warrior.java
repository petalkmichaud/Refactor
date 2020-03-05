
public class Warrior implements DungeonCharacter,Attack{

	private final int MIN_ADD = 25;
	private final int MAX_ADD = 50;
	
	private int hitPoints = 125;
	private int attackSpeed = 4;
	private double chanceToHit = 0.8;
	private int minDamage = 35;
	private int maxDamage = 60;
	private double blockChance = 0.2;
	private String cName;
	
	
	SpecialMove heal = new Heal(this, MIN_ADD, MAX_ADD);

	public double getMinADD(){
		return this.MIN_ADD;
	}
	
	public double getMaxADD(){
		return this.MAX_ADD;
	}
	@Override
	public void doSpecialMove() {
		heal.doSpecialMove();
		
	}
	
	public Warrior(String cName) {
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
	public void attack(DungeonCharacter opponent) {
			System.out.println(this.getName() + " swings a mighty sword at" + opponent.getName() + ":");

			if (Math.random() <= chanceToHit){
				
				int damage = (int)(Math.random() * (minDamage - maxDamage + 1))+ minDamage;
				opponent.subtractHitPoints(damage);
				System.out.println();
			}//end if can attack
			else
			{

				System.out.println(getName() + "'s attack on " + opponent.getName() + " failed!");
				System.out.println();
		
		
	}}
	@Override
	public void subtractHitPoints(int hitPoints) {
		if(Math.random() <= blockChance) {
			System.out.println(this.getName() + " BLOCKED the attack!");
		}
		else {
			this.hitPoints = this.hitPoints - hitPoints;
		}
	}
	@Override
	public void addHitPoints(int hitPoints) {
		this.hitPoints += hitPoints;
		
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
