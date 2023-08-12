package kadai_014;

public class Car_Chapter14 {
	
	// フィールド
	private int gear = 1;
	private int speed = 10;
	
	//①車クラスは次のメソッドを持つ
	public void gearChange(int afterGear) {
		
		System.out.println("ギア" + gear + "から" + afterGear + "に切り替えました");
		
	}
	
	//②車クラスは次のメソッドを持つ
	public void run() {
		speed = 30;
		System.out.println("速度は時速" + this.speed + "kmです");
		
	}
}