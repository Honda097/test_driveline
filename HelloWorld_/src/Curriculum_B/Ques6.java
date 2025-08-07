package Curriculum_B;

import java.util.Random;
import java.util.Scanner;
public class Ques6 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		String user = scanner.nextLine();
		String [] shoplist = user.split("、");
		Random rnd = new Random();
		int total = rnd.nextInt(12);
		for (String value:shoplist) {
			int stok = rnd.nextInt(12);
			switch (value){
			case "パソコン":
				System.out.println("パソコンの残り台数は "+stok+"台です");
				break;
			case "冷蔵庫":
				System.out.println("冷蔵庫の残り台数は "+stok+"台です");
				break;
			case "扇風機":
				System.out.println("扇風機の残り台数は "+stok+"台です");
				break;
			case "洗濯機":
				System.out.println("洗濯機の残り台数は "+stok+"台です");
			case "加湿器":
				System.out.println("加湿器の残り台数は "+stok+"台です");
				break;
			case "テレビ":
			case "ディスプレイ":
				System.out.println(value.equals("テレビ")?"テレビの残り台数は"+total+ "台です"
						:"ディスプレイの残り台数は"+(11-total)+ "台です");
				break;
			default:
				System.out.println(value+"は指定の商品ではありません");
		    }
		}
	}

}
//パソコン、冷蔵庫、扇風機、洗濯機、加湿器、テレビ、ディスプレイ