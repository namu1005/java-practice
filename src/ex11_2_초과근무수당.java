import java.util.Scanner;
public class ex11_2_초과근무수당 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("일한 시간을 입력하세요 : ");
		int time = sc.nextInt();
		
		int basic = 8*5000;
		int plus = basic+((time-8)*7500);
		int total = 0;
		
		if(time <= 8) {
			total = basic;
		}else if(time > 8) {
			total = plus;
		}
		
		System.out.println("총 임금은 " + total + "원 입니다.");
	}

}
