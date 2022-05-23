public class Katze{

	private int anzLeben;
	private String name;
	
	public void setName(String pName) {
		name = pName;
	}
	
	public String getName() {
		return name;
	}
	
	public void lebenVerlieren(){
		if (anzLeben > 0) anzLeben--;
	}
	
	public int getLeben(){
		return anzLeben;
	}
}
