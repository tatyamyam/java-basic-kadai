package kadai_017;

abstract class Kato_Chapter17 {
	
	//親クラス
	
	//フィールド
	public String familyName;	//姓
	public String givenName;	//名
	public String address;		//住所
	
	public Kato_Chapter17(String familyName, String address) {
        this.familyName = familyName;
        this.address = address;
    }
	
	
	public void commonIntroduce() {	//共通の紹介
		System.out.println("名前は" + familyName + givenName + "です");
		System.out.println("住所は" + address+ "です");
	}
	
	abstract public void eachIntroduce();	//個別の紹介 抽象メソッド
	
	public void execIntroduce() {	//紹介を実行する
		commonIntroduce();
		eachIntroduce();
		
	}

}
