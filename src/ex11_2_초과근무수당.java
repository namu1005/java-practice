import java.util.Scanner;
public class ex11_2_�ʰ��ٹ����� {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("���� �ð��� �Է��ϼ��� : ");
		int time = sc.nextInt();
		
		int basic = 8*5000;
		int plus = basic+((time-8)*7500);
		int total = 0;
		
		if(time <= 8) {
			total = basic;
		}else if(time > 8) {
			total = plus;
		}
		
		System.out.println("�� �ӱ��� " + total + "�� �Դϴ�.");
	}

}
