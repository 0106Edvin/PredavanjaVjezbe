package ba.bitcamp.edvin.vjezbe;

public class Zadatak5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int today = 22;
		int thisMonth = 5;
		int day = 15;
		int month = 2;

		if (day < today && month < thisMonth || month == thisMonth) {
			System.out.println("Rodjendan je bio");
		} else if (day > today || day < today && month > thisMonth) {
			System.out.println("Rodjendan nije bio");

		}

	}

}
