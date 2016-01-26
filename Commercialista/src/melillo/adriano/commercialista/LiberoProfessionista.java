package melillo.adriano.commercialista;

public class LiberoProfessionista extends Cliente{
	
	private String piva;
	private int numFatture;
	
	public LiberoProfessionista(String nome, String cognome, String cf, String piva, int numFatture) {
		super(nome, cognome, cf);
		this.piva = piva;
		this.numFatture = numFatture;
	}
	public LiberoProfessionista(){
		super();
		piva = null;
		numFatture = -1;
	}
	
	public int calcolaParcella() {
		int tot = 5000 + (50 * numFatture);
		return tot;	  
	}
	
	public String getPiva() {
		return piva;
	}
	public void setPiva(String piva) {
		this.piva = piva;
	}
	public int getNumFatture() {
		return numFatture;
	}
	public void setNumFatture(int numFatture) {
		this.numFatture = numFatture;
	}
	
	
}
