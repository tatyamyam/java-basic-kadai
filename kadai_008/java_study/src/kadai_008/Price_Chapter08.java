package kadai_008;

public class Price_Chapter08 {

	public static void main(String[] args) {
		// 年齢を0～40をランダムに生成する(今回の課題は30代に関する出力が必要なため生成するのは40までとする)
		int userAge = (int)(Math.random() * 40);
		//乱数userAgeの値を出力
		System.out.println(userAge);
		
		//料金の変数を宣言
		int serviceCost_1 = 1000; //10代
		int serviceCost_2 = 2000; //20代
		int serviceCost_3 = 3000; //30代、40代
		int serviceCost_4 = 4000; //50代、60代、70代
		int serviceCost_5 = 5000; //80代
		int serviceCost_6 = 500; //上記以外
		
		switch(userAge) {
		case 10,11,12,13,14,15,16,17,18,19 -> System.out.println("");
		case 20,21,22,23,24,25,26,27,28,29 -> System.out.println("");
		//今回はコンソールに出力するのは30代のみとする、30代以上はblank表示とする
		case 30,31,32,33,34,35,36,37,38,39 -> System.out.println("30代の料金は" + serviceCost_3 + "円");
		case 40,41,42,43,44,45,46,47,48,49 -> System.out.println("");
		case 50,51,52,53,54,55,56,57,58,59 -> System.out.println("");
		case 60,61,62,63,64,65,66,67,68,69 -> System.out.println("");
		case 70,71,72,73,74,75,76,77,78,79 -> System.out.println("");
		case 80,81,82,83,84,85,86,87,88,89 -> System.out.println("");
		default -> System.out.println("");
		}

	}

}
