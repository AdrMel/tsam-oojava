package melillo.adriano.commercialista;

public class Imprenditore extends Cliente {
	
	private String pivaSocieta;
	private String ragioneSociale;
	private int numFatture;
	
	public Imprenditore(String nome, String cognome, String cf, String piva, String ragioneSociale, int numFatture) {
		super(nome, cognome, cf);
		this.pivaSocieta = piva;
		this.ragioneSociale = ragioneSociale;
		this.numFatture = numFatture;
	}

	public Imprenditore(){
		super();
		pivaSocieta = null;
		ragioneSociale = null;
		numFatture = -1;
	}
	
	public int calcolaParcella() {
		int tot = 50000;
		
		if(numFatture < 100) {
			return tot;
		} else {
			tot += numFatture - 100;
			return tot;
		}
	}
	
	public String getPiva() {
		return pivaSocieta;
	}

	public void setPiva(String piva) {
		this.pivaSocieta = piva;
	}

	public String getRagioneSociale() {
		return ragioneSociale;
	}

	public void setRagioneSociale(String ragioneSociale) {
		this.ragioneSociale = ragioneSociale;
	}

	public int getNumFatture() {
		return numFatture;
	}

	public void setNumFatture(int numFatture) {
		this.numFatture = numFatture;
	}

}
