package inc.arrow.appOne;

public class Calculate {
	public static void main(String[] arg) {
		System.out.println("Calculate...");
		Calculator calculator = new Calculator();
		int sum = calculator.add(Integer.parseInt(arg[0]), Integer.parseInt(arg[1]));
        System.out.println("Sum = " + sum);
		int subs = calculator.substract(Integer.parseInt(arg[0]), Integer.parseInt(arg[1]));
        System.out.println("Subs = " + subs);
	}
}