package Try.Second;

public class Wizard extends Warrior {
	String name = "Wizard";
	int strength=1;
	int agility=3;
	int inteligence=3;

	Wizard(){
		warriorStrength();
	
	}
	@Override
	public int warriorStrength() {
		int s = 1+(strength + agility + inteligence);
		return s;
	}
}
