import java.util.Scanner;
public class ex11_1_������ {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("��������� : ");
		int now = sc.nextInt();
		System.out.print("��ǥ������ : ");
		int goal = sc.nextInt();
		
		int week = 0;
		
		do {
			week++;
			System.out.print(week+"���� ���� ������ : ");
			int kg = sc.nextInt();
			now = now - kg;
		}while(now>goal); {
			System.out.println(now + "kg" + "�޼�! �����մϴ�!");
		}
		
		
		
	}

}
