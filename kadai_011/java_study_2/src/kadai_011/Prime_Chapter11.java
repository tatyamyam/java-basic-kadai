package kadai_011;

public class Prime_Chapter11 {

	public static void main(String[] args) {
		//変数　numとする
		//100までの整数が素数か判定するboolean型の配列
		boolean[] num = new boolean[101];
		//配列の要素を繰り返しtrueで初期化する
		for(int i = 1; i < num.length; i++) {
			num[i] = true;
		}
		
		//割る数の変数をdivisorとする
		//割る数の初期値を2とする
		int divisor = 2;
		while(divisor < num.length) {
			//その数で割り切れるか判定⇒素数を求める
			for(int i = divisor + 1; i < num.length; i++) {
				//その数以外で割り切れる⇒素数でない
				if(i % divisor == 0) {
					num[i] = false;
					continue;
				}
			}
			
			divisor += 1;
		}
		
		//素数を出力する
		for(int i = 2; i < num.length; i++) {
			if(num[i]) {
				System.out.println(i);
			}
		}
		
		

	}

}
