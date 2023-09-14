package kadai_020;

public class DictionaryExec_Chapter20 {

	public static void main(String[] args) {
		// 辞書クラスのインスタンス作成
		Dictionary_Chapter20 dictionary = new Dictionary_Chapter20();
		
		//調べる英単語を配列にセットする
		String[] wordsToLookup = {"apple", "banana", "grape", "orange"};
		
		//辞書を調べる
		for(String word : wordsToLookup) {
			if(dictionary.containsWord(word)) {
				System.out.println(word + "の意味は" + dictionary.getMeaning(word)+ "です。");
			} else {
				System.out.println(word + "は辞書にありません。");
			}
		}

	}

}
