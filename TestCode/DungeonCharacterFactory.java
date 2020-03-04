
public class DungeonCharacterFactory {
	public DungeonCharacter createSorceress(String name) {
		return (DungeonCharacter) new Sorceress(name);
	}
	
	public DungeonCharacter createOrgre() {
		return new Ogre();
	}
}
