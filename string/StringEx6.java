package string;

public class StringEx6 {

	public static void main(String[] args) {
		int iVal = 100;
		String strVal = String.valueOf(iVal);	// int를 String으로 변환
		
		double dVal = 200.0;
		String strVal2 = dVal +"";	// int를 String으로 변환하는 다른 방법
		
		double sum = Integer.parseInt("+"+strVal.trim()) + Double.parseDouble(strVal2.trim());	// 문자열 -> 기본형
		double sum2 = Integer.valueOf(strVal) + Double.valueOf(strVal2);
		
		System.out.println(String.join("", strVal,"+",strVal2,"=")+sum);
		System.out.println(strVal+"+"+strVal2+"="+sum2);

	}

}
