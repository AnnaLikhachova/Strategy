package Try.Second;

public class Warrior {
	Play sc;
	String name;
	int strength;
	int agility;
	int inteligence;
	Play scr;	
	Warrior() {
		warriorStrength();
	}

	public int warriorStrength() {
		int s = strength + agility + inteligence;
		return s;
	}

	public String fight(int playerScore, int enemyScore) {

		int result = playerScore / enemyScore;
		if (result >= 1) {
			return "VICTORY";
		} else
			return "YOU LOST";
	}


}