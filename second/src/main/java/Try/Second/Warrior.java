package Try.Second;

public class Warrior {

	private int strength;
	private int agility;
	private int inteligence;
	
	Warrior() {
		warriorStrength();
	}

	public int warriorStrength() {
		int warriorStrength = strength + agility + inteligence;
		return warriorStrength;
	}

	public String fight(int playerScore, int enemyScore) {

		int result = playerScore / enemyScore;
		if (result >= 1) {
			return "VICTORY";
		} else
			return "YOU LOST";
	}
}
