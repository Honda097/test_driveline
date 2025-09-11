package Process;

import java.util.Arrays;
import java.util.Scanner;

public class Process {
	String[] prefectures = { "北海道:札幌市:83424", "青森県:青森市:9646", "岩手県:盛岡市:15275", "宮城県:仙台市:7282", "秋田県:秋田市:11638",
			"山形県:山形市:9323", "福島県:福島市:13784", "茨城県:水戸市:6097", "栃木県:宇都宮市:6408", "群馬県:前橋市:6362", "埼玉県:さいたま市:3798" };

	// コンソールに書かれた数字を受け取る
	Scanner scanner = new Scanner(System.in);
	String num = scanner.nextLine();
	String upDown = scanner.nextLine();
	String[] nums = num.split(",");

	public void sort() {
		// コンソールに書かれた数字を"up"に並び替える
		Arrays.sort(nums);
		if ("up".equals(upDown)) {
			for (String value : nums) {
				String[] values = prefectures[Integer.parseInt(value)].split(":");
				System.out.println("都道府県名：" + values[0]);
				System.out.println("県庁所在地：" + values[1]);
				System.out.println("面積：" + Double.parseDouble(values[2]) + "km2 \n");
			}
		// コンソールに書かれた数字を"down"で出力する
		} else if ("down".equals(upDown)) {
			for (int i = nums.length - 1; i >= 0; i--) {
				String[] values = prefectures[Integer.parseInt(nums[i])].split(":");
				System.out.println("都道府県名：" + values[0]);
				System.out.println("県庁所在地：" + values[1]);
				System.out.println("面積：" + Double.parseDouble(values[2]) + "km2 \n");
			}
		}scanner.close();
	}
}