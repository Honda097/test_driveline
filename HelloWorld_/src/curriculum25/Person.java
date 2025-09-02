package curriculum25;

public class Person {
	
	// フィールド変数を宣言
	private String name;
	private int hp;
	private int mp;
	
	// getterを用意
	public String getName() {
		return name;
	}
	public int getHp() {
		return hp;
	}
	public int getMp() {
		return mp;
	}
	
	// setterを用意
	public void setName(String name) {
		this.name = name;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public void setMp(int mp) {
		this.mp = mp;
	}
	public void greet() {
		System.out.println("こんにちは「" + getName() + "」さん");
	}
}
