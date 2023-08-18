package kadai_017;

public class KatoExec_Chapter17 {

	public static void main(String[] args) {
		// 加藤太郎さんの自己紹介実行
		KatoTaro_Chapter17 taro = new KatoTaro_Chapter17("加藤", "東京都中野区〇×");
		taro.execIntroduce();
		System.out.println();
		
		//加藤一郎さんの自己紹介実行
		KatoIchiro_Chapter17 ichiro = new KatoIchiro_Chapter17("加藤", "東京都中野区〇×");
		ichiro.execIntroduce();
		System.out.println();
		
		//加藤花子さんの自己紹介実行
		KatoHanako_Chapter17 hanako = new KatoHanako_Chapter17("加藤", "東京都中野区〇×");
		hanako.execIntroduce();
		System.out.println();
		
	}

}
