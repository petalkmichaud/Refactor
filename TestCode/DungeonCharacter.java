
public interface DungeonCharacter {
		public String getName();
		public int getHitPoints();
		public int getAttackSpeed();
		public void attack(DungeonCharacter opponent);
		public void subtractHitPoints(int hitPoints);
		public void addHitPoints(int hitPoints);
		
		//characters can have a special move such as heal or some crazy attack
		public void doSpecialMove();
		public boolean isAlive();
		public SpecialMove getSpecialMove();
		
		

}
