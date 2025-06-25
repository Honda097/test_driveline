package Curriculum_B;

import java.util.Scanner;

public class Qes1_3 {

	public static void main(String[] args) {
		String name = "";
		Scanner scanner = new Scanner(System.in);
		name = scanner.nextLine();
		int length = name.length();
		if (name.length() > 10) {
			System.out.println("名前を10文字以内にしてください");
		} else if(name.length() == 0 || name.isEmpty()) {
			System.out.println("名前を入力してくだい");
		}else if(!name.matches("^[0-9a-zA-Z]+$")) {
			System.out.println("半角英数字のみで名前を入力してくだい");
		}else {
			System.out.println(" ユーザー名「" +  name + "」を登録しました");
		}
	}
}
