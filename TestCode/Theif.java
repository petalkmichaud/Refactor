
public class Theif implements DungeonCharacter
{
	private int hitPoints = 75;
	private int attackSpeed = 5;
	private double chanceToHit = 0.7;
	private int minDamage = 25;
	private int maxDamage = 50;
	private double blockChance = 0.3;
	private String cName;
	
	SpecialMove SurpriseAttack = new SurpriseAttack(this);
	
	public void doSpecialMove()
	{
		SurpriseAttack.doSpecialMove();
		
	}
	
	public Theif(String cName)
	{
		this.cName = cName;
		
	}
	
	public String getName()
	{
		return this.cName;
		
	}
	
	public int getHitPoints()
	{
		return this.hitPoints;
		
	}
	
	public int getAttackSpeed()
	{
		return this.attackSpeed;
		
	}
	
	public void subtractHitPoints(int hitPoints)
	{
		if(Math.random() <= blockChance)
		{
			System.out.println(this.getName() + " BLOCKED the attack!");
		}
		else
		{
			this.hitPoints = this.hitPoints - hitPoints;
		}
		
	}
	
	public void addHitPoints(int hitPoints)
	{
		this.hitPoints += hitPoints;
	}
	
	public void attack(DungeonCharacter opponent)
	{
		System.out.println(this.getName() + " slashes with a swift dagger at" + opponent.getName() + ":");

		if (Math.random() <= chanceToHit)
		{
			int damage = (int)(Math.random() * (minDamage - maxDamage + 1))+ minDamage;
			opponent.subtractHitPoints(damage);
			System.out.println();
		}//end if can attack
		
		else
		{
			System.out.println(getName() + "'s attack on " + opponent.getName() + " failed!");
			System.out.println();
		}
		
	}

}
