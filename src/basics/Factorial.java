package basics;

public class Factorial {

	public static void main(String[] args) {
		
		System.out.println(calcFactorial(15));

	}
	
	static int calcFactorial(int num) {
		
		int factorial = 1;
		
		for(int i = 1; i <= num; i++) {
			factorial = factorial * i;
			System.out.println("factorial : " + factorial);
		}
		
		
		return factorial;
		
	}
}
