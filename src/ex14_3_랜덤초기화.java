import java.util.Random;
public class ex14_3_랜덤초기화 {
	public static void main(String[] args) {
		Random ran = new Random();
		int[] arr = new int[8];
		
		int max = arr[0];
		int min = arr[0];
		
		System.out.print("배열에 있는 모든 값 : ");
		
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
		System.out.println("가장 큰 값 : " + max);
		System.out.println("가장 작은 값 : " + min);
		
	}
}
