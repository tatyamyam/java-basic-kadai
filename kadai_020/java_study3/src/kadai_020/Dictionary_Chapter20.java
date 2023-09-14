package kadai_020;

import java.util.HashMap;

public class Dictionary_Chapter20 {
	private HashMap<String, String> dictionary;

	public Dictionary_Chapter20() {
		dictionary = new HashMap<>();
		
		//�����ɒP��ƈӖ���ǉ�
		dictionary.put("apple", "���");
        dictionary.put("peach", "��");
        dictionary.put("banana", "�o�i�i");
        dictionary.put("lemon", "������");
        dictionary.put("pear", "��");
        dictionary.put("kiwi", "�L�E�B");
        dictionary.put("strawberry", "������");
        dictionary.put("grape", "�Ԃǂ�");
        dictionary.put("muscat", "�}�X�J�b�g");
        dictionary.put("cherry", "��������");

	}
	
	public boolean containsWord(String word) {
		return dictionary.containsKey(word);
	}
	
	public String getMeaning(String word) {
        return dictionary.get(word);
    }


}
