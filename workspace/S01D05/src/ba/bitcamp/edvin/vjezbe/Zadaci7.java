package ba.bitcamp.edvin.vjezbe;

public class Zadaci7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int day = 30;
		int month =2;
		int year = 2016;

		if (day == 30 && month == 4 || month == 6 || month == 9 || month == 11) {
			System.out.println("Tomorrow is " + (1) + "." + (month + 1) + "."+ year);
		} else if (day == 31 && month == 1 || month == 3 || month == 5
				|| month == 7 || month == 8 || month == 10) {
			System.out.println("Tomorrow " + (1) + "." + (month + 1) + "."+ year);

		} else if (day == 28 && month == 2) {
			System.out.println("Tomorrow is " + (1) + "." + (month + 1) + "."	+ year);
		} else if (day == 31 && month == 12) {
			System.out.println("Tomorrow is " + (1) + "." + (1) + "."	+ (year + 1));
		}else if (day == 30 && month == 2){
			System.out.println("Date is incorrect");
		}
	}
}
