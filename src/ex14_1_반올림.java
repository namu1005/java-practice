import java.util.Scanner;
public class ex14_1_반올림 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt(); 
		int result = num%10;
		
		if(result >= 5) {
			System.out.print("반올림 수 : " + (((num/10)+1)*10));
		}else if(result < 5) {
			System.out.print("반올림 수 : " + ((num/10)*10));
		}
	}

}
