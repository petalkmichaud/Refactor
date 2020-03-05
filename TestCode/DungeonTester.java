
public class DungeonTester {
	public static void main(String args[]) {
		DungeonCharacterFactory factory = new DungeonCharacterFactory();
		DungeonCharacter hero = factory.createWarrior("Angel");
		hero.doSpecialMove();
		
		DungeonCharacter monster = factory.createOrgre();
		monster.doSpecialMove();
		
		monster.attack(hero);
		
		hero.attack(monster);
		
			
	}
	
	
}
