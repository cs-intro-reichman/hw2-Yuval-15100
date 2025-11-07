// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	
	  int numberOfTerms = Integer.parseInt(args[0]);

	  System.out.println("pi according to Java: " + Math.PI);

	  double sum = 0.0;

	  for (int i = 0; i < numberOfTerms; i++) {
		double denominator = 2.0 * i + 1.0;
		double result = (1.0 / denominator);
		
		if (i % 2 != 0) {
		result = -result;}

		sum += result;
		}

	System.out.println("pi, approximated:     " + (4 * sum));

	}
}
