package my;

public class ex21_1_90도회전한배열 {

	public static void main(String[] args) {

		int[][] arr = new int[5][5];
		int cnt = 1;
		
		for (int a = 0; a < arr.length; a++) {
			for (int i = 0; i < arr.length; i++) {
				arr[a][i] = cnt++;
			}
		}
		

		for (int i = 4; i >= 0; i--) {
			for (int a = 0; a < arr.length; a++) {
				System.out.print(arr[a][i] + " ");
			}
			System.out.println(" ");
		}
		
		
		
	}

}
