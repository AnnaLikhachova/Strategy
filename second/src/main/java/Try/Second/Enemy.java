package Try.Second;

public class Enemy {
	private int gold = 500;
	private int culture = 100;
	private int science = 100;
	private int religion = 100;
	private int goldK = 3;
	private int cultureK = 2;
	private int scienceK = 2;
	private int religionK = 2;

	Enemy(Play scr) {
		this.sc = scr;		
	}

	public int enemyStrength() {
		int strengh = gold*goldK+culture*cultureK+science*scienceK+religion*religionK;
		return strengh;
	}
}
