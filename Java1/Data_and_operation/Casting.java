
public class Casting {

	public static void main(String[] args) {
		
		double a = 1.1;
		double b = 1; // not error, automatically convert to double
		double b2 = (double) 1; // same to up line
		System.out.println(b); // 1.0
		
//		int c = 1.1; // error
		int d = (int) 1.1;
		System.out.println(d); // 1
		
		// 1 to string
		String e = Integer.toString(1); // Original -> String str = Integer.toString(i);
		System.out.println(e.getClass()); // class java.lang.String

	}

}
