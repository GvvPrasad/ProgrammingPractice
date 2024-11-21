package pattern;

public class Rectangle {

	public static void main(String[] args) {
	
		int n=5;
		//rectangle(n);
	//	rightAngaleTriangle(n);
	//	decreasingTriangle(n);
		rightTriangle(n);
		
	}
	
	public static void rectangle(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void rightAngaleTriangle(int n) {
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void decreasingTriangle(int n) {
		for (int i = 0; i <=n; i++)  {
			for (int j = i; j <=n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void rightTriangle(int n) {
		for (int i = 1; i <=n; i++) {
			for (int j = i; j <= n; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <=i; j++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
	}
}
