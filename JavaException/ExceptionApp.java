
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
			// Exception > ArithmeticException �̹Ƿ�
			// ArithmeticException�� ���� catch ���� Exception ���� ���� ���;� �ڵ������ ��������
			
			System.out.println("�߸��� ����̳׿�. " + e.getMessage());
			e.printStackTrace();
		
		} catch(Exception e) {
			
			System.out.println("������ �߻��߽��ϴ�");
		
		} 
/**		catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println("index ���� ����");
	
		}
*/		
		System.out.println(5);

	}

}
