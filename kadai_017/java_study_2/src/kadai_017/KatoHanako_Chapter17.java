package kadai_017;

public class KatoHanako_Chapter17 extends Kato_Chapter17 {
	
	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}
	
	public KatoHanako_Chapter17(String familyName, String address) {
		super(familyName, address);
		setGivenName("花子");
	}
	
	@Override
	public void eachIntroduce() {
		System.out.println("趣味は読書です");
	}

}
