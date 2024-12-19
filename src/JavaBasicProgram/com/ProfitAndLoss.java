package JavaBasicProgram.com;

public class ProfitAndLoss {
	public static void main(String[] args) {
		int cp = 129;
		int sp = 191;

		int p = sp - cp;

		int pp = (p / cp) * 100;

		System.out.println("The Cost Price is INR " + cp + " and selling price is INR " + sp + "\n"
				+ " The profit is INR " + p + " and the profit percentage is " + pp);

	}
}

