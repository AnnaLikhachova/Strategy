package Try.Second;

public class Soldier extends Warrior {
	String name = "Soldier";
	int strength = 3;
	int agility = 1;
	int inteligence = 1;
	Play scr;
	
	Soldier(){
		warriorStrength( );
	
	}

	@Override
	public int warriorStrength() {
		int s = 1+(strength + agility + inteligence);
		return s;
	}
}
