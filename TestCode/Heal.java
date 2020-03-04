
public class Heal implements SpecialMove {
	DungeonCharacter character;
	private int minADD, maxADD;
	
	public Heal(DungeonCharacter thisCharacter, int minADD, int maxADD) {
		this.character = thisCharacter;
		this.maxADD = maxADD;
		this.minADD = minADD;
	}
	
	@Override
	public void doSpecialMove() {
		int hPoints;
		hPoints = (int)(Math.random() * (maxADD - minADD + 1)) + minADD;
		character.addHitPoints(hPoints);
		System.out.println(character.getName() + " added [" + hPoints + "] points.\n" + "Total hit points remaining are: " + character.getHitPoints());
		System.out.println();
		
	}
}
