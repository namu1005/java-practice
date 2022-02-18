public class ex12_1_100까지플마 {
	public static void main(String[] args) {

		int[] arr = new int[101];
		int total = 0;
		for (int i = 1; i < arr.length; i++) {
			if(i%2==0) {
				arr[i] = -i;
				total += -i;
				System.out.print(arr[i] + " ");
			}else if(i%2==1) {
				arr[i] = i;
				total += i;
				System.out.print(arr[i]);
			}
			
		}
		System.out.println(" ");
		System.out.println("합계 : " + total);
		
		
	}

}
