package _assignment.asgm1;

public class ques_5 {

	public static void rat(int n) {
		int i;
		for (i = 1; i <= n; i++) {
			int j;
			for (j = 1; j <= i; j++) {

				System.out.print(" * ");

			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		int n = 4;
		rat(n);
	}

}
