
public class DungeonCharacterFactory {
	public DungeonCharacter createSorceress(String name) {
		return (DungeonCharacter) new Sorceress(name);
	}
}
