package curriculum_A;

public class Qes1_13 {
	public static void main(String[] args) {
		// 問1
		byte b;
		short s;
		int x;
		long l;
		float f;
		double d;
		char c;
		String n;
		boolean t;

		// 問2
		b = 0;
		s = 0;
		x = 0;
		l = 0;
		f = 0.0f;
		d = 0.0;
		c = '\u0000';
		n = null;

		// 問3
		b = 10;
		s = 100;
		x = 1000;
		l = 10000;
		f = 9.5f;
		d = 10.5;
		c = 'a';
		n = "ハロー";
		t = true;

		// 問4
		System.out.println(b + s + x + l);
		System.out.println(b + b);
		System.out.println(c + n + t);
		System.out.println(b + s + x + l + f + d);
		System.out.println(b * s * x * l);
		System.out.println(d / x);
		System.out.println(b - s);

		// 問5
		int num = 20;
		int num1 = 23;
		System.out.println("ハローJAVA" + (num + num1));

		// 問6
		String name = "山田太郎";
		int age = 18;
		double hei = 170.5;
		double wei = 62.2;
		String food = "オムライス";
		double bmi = wei / ((hei / 100.0) * (hei / 100.0));
		bmi = ((double)Math.round(bmi * 10))/10;
		System.out.println("初めまして" + name + "です");
		System.out.println("年齢は" + age + "歳です");
		System.out.println("身長は" + hei + "cmです");
		System.out.println("体重は" + wei + "kgです");
		System.out.println("好きな食べ物は" + food + "です");

		// 問7
		System.out.println("初めまして" + name + "です");
		System.out.println("年齢は" + age + "歳です");
		System.out.println("身長は" + hei + "cmです");
		System.out.println("体重は" + wei + "kgです");
		System.out.println("好きな食べ物は" + food + "です");
		System.out.println("私のBMIは" + bmi + "です");

		// 問8
		name = "鈴木一郎";
		age = 24;
		hei = 168.5;
		wei = 64.2;
		food = "オムライス";
		bmi = wei / ((hei / 100.0) * (hei / 100.0));
		bmi = ((double)Math.round(bmi * 10))/10;
		System.out.println("初めまして" + name + "です");
		System.out.println("年齢は" + age + "歳です");
		System.out.println("身長は" + hei + "cmです");
		System.out.println("体重は" + wei + "kgです");
		System.out.println("好きな食べ物は" + food + "です");
		System.out.println("私のBMIは" + bmi + "です");

		// 問9
		name = "鈴木一郎";
		age = (age + age);
		hei = (hei + hei);
		wei = (wei + wei);
		food = "オムライス";
		bmi = wei / ((hei / 100.0) * (hei / 100.0));
		bmi = ((double)Math.round(bmi * 100))/100;
		System.out.println("初めまして" + name + "です");
		System.out.println("年齢は" + age + "歳です");
		System.out.println("身長は" + hei + "cmです");
		System.out.println("体重は" + wei + "kgです");
		System.out.println("好きな食べ物は" + food + "です");
		System.out.println("私のBMIは" + bmi + "です");

		// 問10
		age = 24;
		System.out.println(age <= 25);

		// 問11
		hei = 168.5;
		wei = 64.2;
		String stringA = Integer.toString(age);
		String stringB = Double.toString(hei);
		String stringC = Double.toString(wei);
		System.out.println(stringA + stringB + stringC);

		// 問12 
		int intA = Integer.parseInt(stringA);
		//float floatB = Float.parseFloat(stringB);
		Double doubleB = Double.parseDouble(stringB);
		int hei2 = doubleB.intValue();
		System.out.println(intA);
		System.out.println(hei2);

		// 問13
		System.out.println(age == 25 || hei >= 160);
	}
}
