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
		gear = 3;
		int[] speedArray = {10, 20, 30, 40, 50};
		switch(gear) {
		case 1:
			System.out.println("速度は時速" + speed + "です");
			break;
		case 2:
			System.out.println("速度は時速" + speedArray[1] + "kmです");
			break;
		case 3:
			System.out.println("速度は時速" + speedArray[2] + "kmです");
			break;
		case 4:
			System.out.println("速度は時速" + speedArray[3] + "kmです");
			break;
		case 5:
			System.out.println("速度は時速" + speedArray[4] + "kmです");
			break;
		default :
			System.out.println("速度は時速" + speedArray[0] + "kmです");
		}
		
	}
}