package curriculum25;

public class Hero extends Person {

	// フィールド変数を宣言
	private int attack;
	private int speed;
	private int guard;

	// getterを用意
	public int getAttack() {
		return attack;
	}

	public int getSpeed() {
		return speed;
	}

	public int getGuard() {
		return guard;
	}

	// setterを用意
	public void setAttack(int attack) {
		this.attack = attack;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public void setGuard(int guard) {
		this.guard = guard;
	}
	public Hero() {
		super.setHp(1000);
	}
	public void greet() {
		// それぞれの値を呼び出して出力
		super.greet();
		System.out.println("ステータス");
		System.out.println("HP:" + getHp());
		System.out.println("MP:" + getMp());
	}
}
