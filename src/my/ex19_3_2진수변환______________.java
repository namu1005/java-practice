package my;

import java.util.ArrayList;
import java.util.Scanner;

public class ex19_3_2������ȯ______________ {
	public static void main(String[] args) {
		
		ArrayList<Integer> arr = new ArrayList<>();
		Scanner sc = new Scanner (System.in);
		System.out.print("���� �Է� >>");
		int num = sc.nextInt();
		
		while(num>0) {
			arr.add(num%2);
			num/=2;
		}
		for (int i = arr.size()-1 ; i >=0; i--) {
			System.out.print(arr.get(i)+ " ");
		}
		
	}

}
