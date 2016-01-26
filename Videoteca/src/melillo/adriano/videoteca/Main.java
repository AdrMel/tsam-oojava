package melillo.adriano.videoteca;

public class Main {

	public static void main(String[] args) {
		
		Videoteca v = new Videoteca();
		Cassetta cassetta = new Cassetta("Cosevecchie", "Uuuuh", 1975, "Tizio1 e Tizio2", 4);
		DVD dvd = new DVD("Polirto", "Mobat", 2010, "Altri e Tizi", 2);
		BluRay br = new BluRay("BeeSF", "Heyhey", 2015, "Quelli di prima", 3);
		
		Film[] f = new Film[] {cassetta, dvd , br};
		
		v.setFilms(f);
		
		System.out.println(v.getPreventivo());

	}

}
