import java.util.ArrayList;
import java.util.Scanner;

public class ex22_2_채점하기__________________ {

	public static void main(String[] args) {
		System.out.println("=== 채점하기 ===");
//		ArrayList<String> ans = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("채점 입력 >> ");
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
