package curriculum23;

public class AnimalBeen {
	// フィールド変数を宣言
	private String name;
	private double  high;
	private int speed; 
	
	// getterを用意
	public String getName() {
		return name;
	}
	public double getHigh() {
		return high;
	}
	public int getSpeed() {
		return speed;
	}
	// setterを用意
	public void setName(String name) {
		this.name = name;
	}
	public void setHigh(double high) {
		this.high = high;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
}
