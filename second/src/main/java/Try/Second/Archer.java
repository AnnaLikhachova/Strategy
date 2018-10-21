package Try.Second;

public class Archer extends Warrior {
	private String name = "Archer";
	private int strength=2;
	private int agility=2;
	private int inteligence=2;
	Archer(){
		warriorStrength();
		
	}

@Override
	public int warriorStrength() {
		int warriorStrength = 1+(strength + agility + inteligence);
		return warriorStrength;
	}
}
