package melillo.adriano.videoteca;

public class BluRay extends Film {

	public BluRay(String titolo, String regista, int annoProd, String attori, int giorni) {
		super(titolo, regista, annoProd, attori, giorni);
	}
	
	public BluRay() {
		super();
	}
	
	public int getPreventivo() {
		int tot = 100;
		
		if(giorni > 1) {
			for(int i = 0; i < giorni - 1; i++) {
				tot += 100 + 10;
			}
		}
		
		return tot;
		
		
	}
	
}
