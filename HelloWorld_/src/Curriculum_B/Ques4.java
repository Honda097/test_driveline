package Curriculum_B;

public class Ques4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		for(int i = 1; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				System.out.print(String.format("%02d", i) + " * " + String.format("%02d", j) + " = " + String.format("%02d", j * i));
				if(j == 9) {
					System.out.print("");
				}else{
				System.out.print(" || ");
				}
			}
    		System.out.println();
		}

	}

}
