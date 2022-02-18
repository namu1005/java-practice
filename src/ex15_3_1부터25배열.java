public class ex15_3_1부터25배열 {
	public static void main(String[] args) {
		
		int[][] arr = new int [5][5];
		
		int cnt = 1;
		
		for (int a = 0; a < arr.length; a++) {
			for (int i = 0; i < arr[a].length; i++) {
				arr[a][i] = cnt++;
				System.out.print(arr[a][i]+" ");
			}
			System.out.println(" ");
		}
		System.out.println(" ");
		
		int cnt2 = 1;
		
		for (int a = 0; a < arr.length; a++) {
			for (int i = 0; i < arr[a].length; i++) {
				arr[a][i] = cnt2++;
				System.out.print(arr[i][a]+" ");
			}
			System.out.println(" ");
		}
		
		
	}

}
