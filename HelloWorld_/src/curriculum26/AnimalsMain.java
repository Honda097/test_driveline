package curriculum26;

import java.util.Scanner;

public class AnimalsMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("コンソールに文字を入力してください");
		String animalOrder = scanner.nextLine();
		Animals animal = new Animals();
		// 各動物の情報で区切る
		String[] animals = animalOrder.split(",");
		// 各動物の項目で区切る
		for (int i = 0; i < animals.length; i++) {
			String[] items = animals[i].split(":");
			// 各動物の名前をセットする
			animal.setName(items[0]);
			// 各動物の体長をセットする
			animal.setHigh(Double.parseDouble(items[1]));
			// 各動物の速度をセットする
			animal.setSpeed(Integer.parseInt(items[2]));

			// 各動物の名前から学名をセットする
			switch (items[0]) {
			case "ライオン":
				animal.setScientificName("パンテラ レオ");
				break;
			case "ゾウ":
				animal.setScientificName("ロキソドンタ・サイクロティス");
				break;
			case "パンダ":
				animal.setScientificName("アイルロポダ・メラノレウカ");
				break;
			case "チンパンジー":
				animal.setScientificName("パン・トゥログロディテス");
				break;
			case "シマウマ":
				animal.setScientificName("チャップマンシマウマ");
				break;
			case "インコ":
				animal.setScientificName("不明");
				break;
			}

			// セットした各項目を受け取る
			System.out.println("動物名：" + animal.getName());
			System.out.println("体長：" + animal.getHigh() + "m");
			System.out.println("速度：" + animal.getSpeed() + "km/h");
			System.out.println("学名：" + animal.getScientificName() + "\n");
		}
		scanner.close();
	}
}