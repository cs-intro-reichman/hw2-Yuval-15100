// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	 
	   int N = Integer.parseInt(args[0]);
	   String mode = args[1];

		for(int i = 1; i <= N; i++){
		int currentNum = i;
		int steps = 0;
		if (mode.equals("v") && currentNum ==1) {
			System.out.print(i + " ");}

		if (currentNum == 1) {
			currentNum = (currentNum * 3) + 1;
			steps++;} 

	   while (currentNum != 1) {
		if (mode.equals("v")) {
			System.out.print(currentNum + " ");}
		
		if (currentNum % 2 == 0) {
			currentNum = currentNum / 2;
		} else {
			currentNum = (currentNum * 3) + 1; }

			steps++ ;}

			int currentSteps = steps + 1;

			if (mode.equals("v")) {
			System.out.println("1 " + "(" + currentSteps + ")");}
		}

		System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");


		}
	}

