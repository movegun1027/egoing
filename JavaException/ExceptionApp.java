
public class ExceptionApp {

	public static void main(String[] args) {
		
		System.out.println(1);
		
		int[] scores = {10, 20, 30};
		
		try {
			
			System.out.println(2);
			// System.out.println(scores[3]); // ArrayIndexOutOfBoundsException error
			System.out.println(3);
			System.out.println(2/0); // divide by 0 ArithmeticException
			System.out.println(4);
			
		} catch(ArithmeticException e) {
			// Exception > ArithmeticException 이므로
			// ArithmeticException에 관한 catch 문이 Exception 보다 먼저 나와야 코드오류가 뜨지않음
			
			System.out.println("잘못된 계산이네요. " + e.getMessage());
			e.printStackTrace();
		
		} catch(Exception e) {
			
			System.out.println("오류가 발생했습니다");
		
		} 
/**		catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println("index 참조 오류");
	
		}
*/		
		System.out.println(5);

	}

}
