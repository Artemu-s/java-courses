public class Calculates {

	public static void main(String[] args) {
	System.out.println("Calculates...");
	Double a = Double.valueOf(args[0]);
	Double b = Double.valueOf(args[1]);
	System.out.println("Sum " + (a + b));
	System.out.println("Raznisa " + (a - b));
	System.out.println("Prozvedenie " + (a * b));
	System.out.println("Delenie " + (a / b));
	System.out.println("Stepen " + (Math.pow(a, b)));
	}

}