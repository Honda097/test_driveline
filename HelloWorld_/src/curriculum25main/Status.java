package curriculum25main;

import java.util.Random;
import java.util.Scanner;

import curriculum25.Hero;

public class Status {

	public static void main(String[] args) {
		// インスタンス化
		Scanner scanner = new Scanner(System.in);
		Random rnd = new Random();
		Hero hero = new Hero();
		
		// 各ステータスに値を設定
		hero.setName(scanner.nextLine());
		hero.setHp(hero.getHp() + rnd.nextInt(1001));
		hero.setMp(rnd.nextInt(1001));
		hero.setAttack(rnd.nextInt(1001));
		hero.setSpeed(rnd.nextInt(501));
		hero.setGuard(rnd.nextInt(1001));
		
		// それぞれの値を呼び出して出力
		hero.greet();
		System.out.println("攻撃力" + hero.getAttack());
		System.out.println("素早さ" + hero.getSpeed());
		System.out.println("防御力" + hero.getGuard());
		System.out.println("さあ冒険に出かけよう！");
	}
}