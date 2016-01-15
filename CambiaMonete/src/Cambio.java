public class Cambio {

	public static void main(String[] args) {
	
		int numero = 989;
		cambio(numero);
		
	}
	
	public static void cambio(int n) {
		
	 do	 {
		if(n >= 500) {
				n -= 500;
				System.out.println("500");
			} else {
				if(n <= 500 && n >= 200){
					n -= 200;
					System.out.println("200");
				} else {
					if(n <= 200 && n >= 100){
						n -= 100;
						System.out.println("100");
					} else {
						if(n <= 100 && n >= 50){
							n -= 50;
							System.out.println("50");
						}  else {
							if(n <= 50 && n >= 20){
								n -= 20;
								System.out.println("20");
							} else {
								if(n <= 20 && n >= 10){
									n -= 10;
									System.out.println("10");
								} else {
									if(n <= 10 && n >= 5){
										n -= 5;
										System.out.println("5");
									} else {
										if(n <= 5 && n >= 2){
											n -= 2;
											System.out.println("2");
										} else {
												n -= 1;
												System.out.println("1");
											}
										}
									}
								}
							}
						}
					}
				}
		
			 
			
		
			
		} while(n > 0);
		
		
	}

}
