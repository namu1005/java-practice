public class ex13_1_77บฮลอ {
	public static void main(String[] args) {

		int[] arr = new int[78];
		
		int total = 0;
		
		
		for (int a = 1; a < arr.length; a++) {
			for (int i = a; i < arr.length; i++) {
				arr[i] = i;
			}
			total += arr[78-a]*arr[a];
		}
	
		System.out.println(total);
	
	}

}
