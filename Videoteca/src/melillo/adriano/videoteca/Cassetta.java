package melillo.adriano.videoteca;

public class Cassetta extends Film {
	
	public Cassetta(String titolo, String regista, int annoProd, String attori, int giorni) {
		super(titolo, regista, annoProd, attori, giorni);
	}
	
	public Cassetta() {
		super();
	}
	
	public int getPreventivo() {
		int tot = 0;
		
		if(giorni > 1) {
			tot = ((giorni - 1) * 200) + 100;
			
		} else {
			tot = 100;
		}
		
		return tot;
	}
}
