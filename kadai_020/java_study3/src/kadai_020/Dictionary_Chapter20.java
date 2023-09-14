package kadai_020;

import java.util.HashMap;

public class Dictionary_Chapter20 {
	private HashMap<String, String> dictionary;

	public Dictionary_Chapter20() {
		dictionary = new HashMap<>();
		
		//辞書に単語と意味を追加
		dictionary.put("apple", "りんご");
        dictionary.put("peach", "桃");
        dictionary.put("banana", "バナナ");
        dictionary.put("lemon", "レモン");
        dictionary.put("pear", "梨");
        dictionary.put("kiwi", "キウィ");
        dictionary.put("strawberry", "いちご");
        dictionary.put("grape", "ぶどう");
        dictionary.put("muscat", "マスカット");
        dictionary.put("cherry", "さくらんぼ");

	}
	
	public boolean containsWord(String word) {
		return dictionary.containsKey(word);
	}
	
	public String getMeaning(String word) {
        return dictionary.get(word);
    }


}
