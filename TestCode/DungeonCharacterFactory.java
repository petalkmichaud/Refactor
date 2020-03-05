
public class DungeonCharacterFactory
{
	public DungeonCharacter createSorceress(String name)
	{
		return (DungeonCharacter) new Sorceress(name);
		
	}
	
	public DungeonCharacter createWarrior(String name)
	{
		return (DungeonCharacter) new Warrior(name);
		
	}
	
	public DungeonCharacter createThief(String name)
	{
		return (DungeonCharacter) new Theif(name);
		
	}
	
	public DungeonCharacter createOrgre()
	{
		return new Ogre();
		
	}
	
	public DungeonCharacter createSkeleton()
	{
		return new Skeleton();
		
	}
	
	public DungeonCharacter createGremlin()
	{
		return new Gremlin();
		
	}
	
}
