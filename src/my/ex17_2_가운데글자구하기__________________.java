package my;
public class ex17_2_가운데글자구하기__________________ {
	public static void main(String[] args) {
		
		System.out.println(getMiddle("test"));
	
	}

	public static String getMiddle(String str) {
		String result = "";
		
		if(str.length() % 2 == 0) {
			result = str.substring(str.length() /2 - 1, str.length() /2+1);
		}else {
			result = str.substring(str.length() /2, str.length() /2+1);
		}
		
		return result;
	}


}
