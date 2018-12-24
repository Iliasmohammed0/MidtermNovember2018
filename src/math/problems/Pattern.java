package math.problems;

public class Pattern {

	public static void main(String[] args) {
		/* Read this numbers, find the pattern then implement the logic from this pattern.which will give you this output.
		 * 100,99,98,97,96,95,94,93,92,91,90,88,86,84,82,80,78,76,74,72,70,67,64,61,58,55,52,49,46,43,40,36,32............
		 *
		 *
		 */
		for (int a = 100; a >= 90; a--) {
			System.out.println(a);
		}
		for (int b = 90; b >= 70; b -= 2) {
			System.out.println(b);
		}
		for (int b = 70; b >= 40; b -= 3) {
			System.out.println(b);
		}
	}
}