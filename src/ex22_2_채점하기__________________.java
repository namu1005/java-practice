import java.util.ArrayList;
import java.util.Scanner;

public class ex22_2_ä���ϱ�__________________ {

	public static void main(String[] args) {
		System.out.println("=== ä���ϱ� ===");
//		ArrayList<String> ans = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("ä�� �Է� >> ");
		String ans = sc.next();

		int score = 0;
		int sum = 0;
		
		if(ans.equals("o") || ans.equals("O")) {
			score = 1;
			sum += score; 
		}
		System.out.println(sum);
	}

}
