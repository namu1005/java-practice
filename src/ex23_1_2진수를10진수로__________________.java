
public class ex23_1_2진수를10진수로__________________ {

	public static void main(String[] args) {
		String str = "01001101";
		String[] data = str.split("");

		int total = 0;

		System.out.println(data[2]);
		System.out.println(" ");
		
		for (int i = 0; i < data.length; i++) {
			if(data[i] == "0") {
				System.out.println(data[i]);
			}
		}


	}

}
