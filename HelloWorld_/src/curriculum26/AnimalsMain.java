package curriculum26;

import java.util.Scanner;

public class AnimalsMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("コンソールに文字を入力してください");
		String animalOrder  = scanner.nextLine();
		Animals animal = new Animals();
		// 各動物の情報で区切る
		String [] animals = animalOrder.split(",");
		// 各動物の項目で区切る
		String [] items = new String[animals.length];
		for(int i = 0; i < animals.length; i++) {
			items = animals[i].split(":");
		}
		for(int j = 0; j < items.length; j++) {
			animal.setName(items[0]);
			System.out.println(animal.getName());
		}
	}
} //ライオン:2.1:80,ゾウ:3.2:40,パンダ:1.9:30,チンパンジー:0.94:25,シマウマ:2.4:65,インコ:0.1:50
//ライオン:
//2.1
//:80,
//ゾウ:3.2:40,
//パンダ:1.9:30,
//チンパンジー:0.94:25,
//シマウマ:2.4:65,
//インコ:0.1:50
//ライオン:
//2.1:
//80,ゾウ:
//3.2:
//40,パンダ:
//1.9:
//30,チンパンジー:
//0.94:
//25,シマウマ:
//2.4:
//65,インコ:
//0.1:50
