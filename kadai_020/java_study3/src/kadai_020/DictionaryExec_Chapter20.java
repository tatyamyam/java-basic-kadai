package kadai_020;

public class DictionaryExec_Chapter20 {

	public static void main(String[] args) {
		// �����N���X�̃C���X�^���X�쐬
		Dictionary_Chapter20 dictionary = new Dictionary_Chapter20();
		
		//���ׂ�p�P���z��ɃZ�b�g����
		String[] wordsToLookup = {"apple", "banana", "grape", "orange"};
		
		//�����𒲂ׂ�
		for(String word : wordsToLookup) {
			if(dictionary.containsWord(word)) {
				System.out.println(word + "�̈Ӗ���" + dictionary.getMeaning(word)+ "�ł��B");
			} else {
				System.out.println(word + "�͎����ɂ���܂���B");
			}
		}

	}

}
