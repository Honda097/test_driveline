package Curriculum_B;
import java.util.Random;
import java.util.Scanner;

public class Qes1_3 {

	public static void main(String[] args) {
		String name = "";
		Scanner scanner = new Scanner(System.in);
		// 入力した名前が１０文字より大きい場合
	    boolean trueFlag = true;
	    while(trueFlag) {
			name = scanner.nextLine();
			if (name.length() > 10) { 
				System.out.println("名前を10文字以内にしてください");
			// 入力した名前が０文字もしくはnullの場合
			} else if(name.length() == 0 || name.isEmpty()) {
				System.out.println("名前を入力してくだい");
			// 入力した名前が半角英数字以外の場合
			}else if(!name.matches("^[0-9a-zA-Z]+$")) {
				System.out.println("半角英数字のみで名前を入力してくだい");
			// 入力した名前が正常だった場合
			}else {
				System.out.println(" ユーザー名「" +  name + "」を登録しました");
				trueFlag = false;
			}
			trueFlag = true;
			String[] hands = {"グー","チョキ","パー"};
			Random rand = new Random();
			int com;
			int myhand;
			int total = 0;
			while(trueFlag) {
				System.out.println("0がグー、1がチョキ、2がパー");
				total++;
				com = rand.nextInt(3);
				myhand =scanner.nextInt();
				System.out.println("");
				System.out.println("");
				// あいこの時
				if(com == myhand) {
					System.out.println("DRAW あいこ　もう一回しましょう");
				// グーで負けた時
				}else if(myhand == 0 && com == 2) {
					System.out.println("俺の勝ち！");
			    	System.out.println("負けは次につながるチャンスです！");
			    	System.out.println("ネバーギブアップ！");
			    // チョキで負けた時 
				}else if(com == 0 && myhand == 1)  {
					System.out.println("俺の勝ち！");
					System.out.println("たかがじゃんけん、そう思ってないですか？");
					System.out.println("それやったら次も、俺が勝ちますよ");
				// パーで負ける時
				}else if(com == 1 && myhand == 2) {
					System.out.println("俺の勝ち！");
					System.out.println("なんで負けたか、明日までに考えといてください。");
					System.out.println("そしたら何かが見えてくるはずです");
				// じゃんけんに勝った時
				}else {
					System.out.println("やるやん。");
					System.out.println("次は俺にリベンジさせて");
					System.out.println("勝つまでにかかった包茎回数はtotalです");
					trueFlag = false;
				}
			}
	    }scanner.close();
    }
}