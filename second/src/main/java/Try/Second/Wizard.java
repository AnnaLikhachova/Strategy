package Try.Second;

public class Wizard extends Warrior {
	private String name = "Wizard";
	private int strength=1;
	private int agility=3;
	private int inteligence=3;

	Wizard(){
		warriorStrength();
	
	}
	@Override
	public int warriorStrength() {
		int warriorStrength = 1+(strength + agility + inteligence);
		return warriorStrength;
	}
}
