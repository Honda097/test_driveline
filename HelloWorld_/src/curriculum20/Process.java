package curriculum20;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Process {
	//挨拶が入る
	String greet;
	//国が入る
	String country;
	//食べ物が入る
	String food;
	//ご飯の種類が入る
	String category;
	
	public Process() {
		this.greet = "こんにちは！";
		this.country = "日本";
		this.food = "寿司";
		this.category = "和食";
	}
	public void Greet() {
		System.out.println(greet + "ここは" + country + "です！");
		System.out.println(food + "はうまい" );
		System.out.println(food + "は" + category + "です！");
		LocalDateTime nowDate = LocalDateTime.now();
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyy/MM/dd H:m:s");
		String formatNowDate = dtf1.format(nowDate);
		System.out.println("今の現在日時は" + formatNowDate + "です");
	}
}