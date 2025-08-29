package curriculum23;

public class OutAnimal {

	public static void main(String[] args) {
		// AnimalBeenクラスをインスタンス化
		AnimalBeen ab = new AnimalBeen();
		
		// 動物の情報をセット
		ab.setName("ライオン");
		ab.setHigh(2.1);
		ab.setSpeed(80);
		// 動物の情報を出力
		System.out.println("動物名：" + ab.getName());
		System.out.println("体長：" + ab.getHigh() + "m");
		System.out.println("速度：" + ab.getSpeed() + "km/h");
	}
}
