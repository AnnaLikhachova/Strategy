package Try.Second;

public class Player {
Play sc;

Player(Play scr){
	this.sc=scr;
	}
		
	public int CalculateScore(int a, int b, int c, int d, int e, int f, int g, int h) {
		int score = a*b+c*d+e*f+g*h;
		return score;
	}

}
