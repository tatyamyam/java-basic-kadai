package kadai_017;

public class KatoIchiro_Chapter17 extends Kato_Chapter17 {
	
	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}
	
	public KatoIchiro_Chapter17(String familyName, String address) {
		super(familyName, address);
		setGivenName("一郎");
	}

	@Override
	public void eachIntroduce() {
		System.out.println("好きな食べ物はリンゴです");
	}
}
