package melillo.adriano.videoteca;

public class Videoteca {

	private Film[] films;
		
		public Film[] getFilms() {
			return films;
		}
	
		public void setFilms(Film[] films) {
			this.films = films;
		}
	
		public int getPreventivo() {
			int tot = 0;
	
			for(Film f : films) {
				tot += f.getPreventivo();
			}
	
			return tot;
		}
	
}
