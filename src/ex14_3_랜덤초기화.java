import java.util.Random;
public class ex14_3_�����ʱ�ȭ {
	public static void main(String[] args) {
		Random ran = new Random();
		int[] arr = new int[8];
		
		int max = arr[0];
		int min = arr[0];
		
		System.out.print("�迭�� �ִ� ��� �� : ");
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = ran.nextInt(100);
			System.out.print(arr[i] + " ");
			
			if(arr[i]>=arr[0]) {
				max = arr[i];
			}else {
				min = arr[i];
			}
		}
		System.out.println(" ");
		System.out.println("���� ū �� : " + max);
		System.out.println("���� ���� �� : " + min);
		
	}
}
