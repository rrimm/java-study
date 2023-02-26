package string;

public class StringEx7 {

	public static void main(String[] args) {
		String fullName = "Hello.java";
		
		int index = fullName.indexOf('.');	// fullName에서 '.'의 위치를 찾는다.
		
		String fileName = fullName.substring(0, index);	// fullName의 첫번째 글자부터 '.'이 있는 곳까지 문자열을 추출
		
		String ext = fullName.substring(index+1);	// '.'의 다음 문자부터 시작해서 문자열의 끝까지 추출
//		fullName.substring(index+1, fullName.length());
		
		System.out.println(fullName + "의 확장자를 제외한 이름은 " + fileName);
		System.out.println(fullName + "의 확장자는 " + ext);

	}

}
