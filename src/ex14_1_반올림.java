import java.util.Scanner;
public class ex14_1_�ݿø� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int num = sc.nextInt(); 
		int result = num%10;
		
		if(result >= 5) {
			System.out.print("�ݿø� �� : " + (((num/10)+1)*10));
		}else if(result < 5) {
			System.out.print("�ݿø� �� : " + ((num/10)*10));
		}
	}

}
