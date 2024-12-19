package JavaBasicProgram.com;

public class DiscountAmount {
	public static void main(String[] args) {
		int fee = 125000;
		int discountPercent = 10;

		double discountAmount = (fee * discountPercent) / 100;

		double discountfee = fee - discountAmount;

		System.out.println("The discounted fee is " + discountAmount);
	}

}
