import java.util.Scanner;
public class ex12_2_�Ž��������󰳼� {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�� �ݾ� �Է� : ");
		int total = sc.nextInt();
		System.out.println(" ");
		
		int a = total%10000;
		
		System.out.println("�ܵ� : " + total);
		System.out.println("10000�� : " + total/10000 + "��");
		System.out.println("5000�� : " + a/5000 + "��");
		System.out.println("1000�� : " + a%5000/1000 + "��");
		System.out.println("500�� : " + a%5000%1000/500 + "��");
		System.out.println("100�� : " + a%5000%1000%500/100 + "��");
	}

}
