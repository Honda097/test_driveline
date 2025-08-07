package Curriculum_B;

import java.util.Scanner;

public class Ques7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("生徒の人数を入力してください（2以上）:");
		int stu = scanner.nextInt();
		while (true) {
			if(stu >= 2) {
				break;
			}
		}
		String [] lists = {"英語","数学","理科","社会"};
		int [][]scores = new int[stu][lists.length];
		for(int i = 0; i < stu; i++){
			for(int j = 0; j < lists.length; j++) {	
				System.out.print((i + 1)+"人目の"+lists[j]+"の点数を入力してください:");
				int score = scanner.nextInt();
				scores[i][j] = score;
			}
			System.out.println();
		}
		for(int i = 0; i < stu; i++) {
			int total = 0;
			for(int j = 0; j < lists.length; j++ ) {
				total +=  scores[i][j];
			}
			double average = (double)total / lists.length;
			System.out.println((i + 1) + "人目の平均点は" + String.format("%.2f",average) + "点です。");
		}
			System.out.println();
		for(int j = 0; j < lists.length; j++) {
			int total = 0;
			for(int i = 0; i < stu; i++) {
				total += scores[i][j];
			}
			double average = (double)total / stu;
			System.out.println(j + lists.length + "の平均点は" + String.format("%.2f",average) + "点です。");	
		}
	}
}
