import java.util.Scanner;
public class ex12_2_거스름돈지폐개수 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("총 금액 입력 : ");
		int total = sc.nextInt();
		System.out.println(" ");
		
		int a = total%10000;
		
		System.out.println("잔돈 : " + total);
		System.out.println("10000원 : " + total/10000 + "개");
		System.out.println("5000원 : " + a/5000 + "개");
		System.out.println("1000원 : " + a%5000/1000 + "개");
		System.out.println("500원 : " + a%5000%1000/500 + "개");
		System.out.println("100원 : " + a%5000%1000%500/100 + "개");
	}

}
