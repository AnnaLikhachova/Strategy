package Try.Second;

public class Archer extends Warrior {
	String name = "Archer";
	int strength=2;
	int agility=2;
	int inteligence=2;
	Archer(){
		warriorStrength();
		
	}

@Override
	public int warriorStrength() {
		int s = 1+(strength + agility + inteligence);
		return s;
	}
}
