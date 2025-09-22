package curriculum30;

public class Person {
	// インスタンスフィールドを定義
	String name;
	int age;
	double height;
	double weight;
	int count = 0;

	// コンストラクタを定義しインスタンスフィールドに値をセット
	public Person(String name, int age, double height, double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.count += 1;
	}

	// インスタンスメソッド「bmi」を定義してください
	public double bmi() {
		double BMI = weight / (height * height);
		BMI = Math.floor(BMI);
		return BMI;
	}

	// インスタンスメソッド「print」を定義してください
	public void print() {
		System.out.println("名前は" + this.name + "です");
		System.out.println("年は" + this.age + "です");
		System.out.println("BMI" + this.bmi() + "です");
		System.out.println("合計" + this.count + "人です");
	}
}
