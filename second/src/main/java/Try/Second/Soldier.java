package Try.Second;

public class Soldier extends Warrior {
	private String name = "Soldier";
	private int strength = 3;
	private int agility = 1;
	private int inteligence = 1;
	
	Soldier(){
		warriorStrength( );
	}

	@Override
	public int warriorStrength() {
		int warriorStrength = 1+(strength + agility + inteligence);
		return warriorStrength;
	}
}
