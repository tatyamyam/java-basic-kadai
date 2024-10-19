package kadai_015;

public class CarExec_Chapter15 {

	public static void main(String[] args) {
		// 車クラスのインスタンスを作成
        Car_Chapter15 myCar = new Car_Chapter15();

        // ギアを3にチェンジ
        myCar.gearChange(3);

        // ギアチェンジ後の速度を表示
        myCar.run();

	}

}
