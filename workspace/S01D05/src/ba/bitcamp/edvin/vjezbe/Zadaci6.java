package ba.bitcamp.edvin.vjezbe;

public class Zadaci6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 2015;

		if (a % 100 == 0 && a % 400 == 0) {
			System.out.println("Godina je prestupna");

		} else if (a % 100 != 0 && a % 4 == 0)
			System.out.println("Godina je prestupna");
		else System.out.println("Godina nije prestupna");

	}

}
