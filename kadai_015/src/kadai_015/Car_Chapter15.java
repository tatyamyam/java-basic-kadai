package kadai_015;

public class Car_Chapter15 {
	// フィールドの定義
	private int gear = 1; // 1速から5速のギアを表す
	private int speed = 10; // ギアチェンジ後の速度を表す

	// ギアに応じて速度を変更するメソッド
	public void gearChange(int afterGear) {
		System.out.println("ギア" + this.gear + "から" + afterGear + "に切り替えました");
		this.gear = afterGear;

		// ギアに応じた速度を設定
		switch (gear) {
		case 1:
			this.speed = 10;
			break;
		case 2:
			this.speed = 20;
			break;
		case 3:
			this.speed = 30;
			break;
		case 4:
			this.speed = 40;
			break;
		case 5:
			this.speed = 50;
			break;
		default:
			this.speed = 10; // その他のギアは時速10kmに設定
			break;
		}
	}

	// ギアチェンジ後の速度を表示するメソッド
	public void run() {
		System.out.println("速度は時速" + this.speed + "kmです");
	}

}
