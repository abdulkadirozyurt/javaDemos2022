package recapDemo1;

public class Main {

	public static void main(String[] args) {

		int sayi1 = 95;
		int sayi2 = 85;
		int sayi3 = 75;

		int enBuyuk = sayi1;

		if (enBuyuk < sayi2) {
			enBuyuk = sayi2;

		} else if (enBuyuk < sayi3) {
			enBuyuk = sayi3;

		}
		else {
			
		}

		System.out.println("en buyuk " + enBuyuk);
	}

}
