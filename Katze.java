public class Katze{

	private int anzLeben;
	private String name;
	
	public void setName(String pName) {
		name = pName;
	}
	
	public String getName() {
		return name;
	}
	
	// Noch ein Kommentar
	public void lebenVerlieren(){
		if (anzLeben > 0) anzLeben--;
	}
	
	public int getLeben(){
		return anzLeben;
	}

	// Nur ein Kommentar, weil mir die Ideen ausgehen
	public String toString() {
		return "Katze " + name + " hat noch " + anzLeben + " Leben.";
	}

}
