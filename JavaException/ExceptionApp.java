
public class ExceptionApp {

	public static void main(String[] args) {
		
		System.out.println(1);
		
		int[] scores = {10, 20, 30};
		
		try {
			
			System.out.println(2);
			System.out.println(scores[3]); // ArrayIndexOutOfBoundsException error
			System.out.println(2/0); // divide by 0 ArithmeticException
			System.out.println(4);
			
		} catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println("index ���� ����");
	
		} catch(ArithmeticException e) {
			
			System.out.println("�߸��� ����̳׿�.");
		
		}
		
		System.out.println(3);

	}

}
