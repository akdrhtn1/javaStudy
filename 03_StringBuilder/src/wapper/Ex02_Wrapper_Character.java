package wapper;

public class Ex02_Wrapper_Character {

	public static void main(String[] args) {
		//Wrapper class : Character
		char chr = 'a';
		System.out.println(Character.isAlphabetic(chr));
		System.out.println("Character.isAlphabetic('한') : " + Character.isAlphabetic('한'));
		
		
		System.out.println("Character.isisLetter('0') : " + Character.isLetter('0'));
		
		System.out.println("Character.isDigit('0') : " + Character.isDigit('0')); //숫자냐?
		
		System.out.println("Character.isLetter('A')) : " + Character.isLetter('A')); // 문자냐?
		
		System.out.println("Character.isUpperCase('A')) : " + Character.isUpperCase('A')); //대문자냐?
		
		System.out.println("Character.isLowerCase('A') : " + Character.isLowerCase('A'));
		
		System.out.println("Character.isWhitespace('\t') : " + Character.isWhitespace('\t')); //빈칸
		
		System.out.println("Character.isWhitespace('A') : " + Character.isWhitespace('A')); //빈칸

		
		//--------------------------
		char[] chs = {'한', 'a', ' ', 'A', '+', '0'};
		for(int i = 0; i<chs.length; i++) {
			System.out.print(chs[i] + ":");
			if(Character.isDigit(chs[i])) {
				System.out.print("숫자");
			}
			if(Character.isWhitespace(chs[i])) {
				System.out.print(" 공백");
			}
			if(Character.isUpperCase(chs[i])) {
				System.out.print("대문자");
			}
			if(Character.isLowerCase(chs[i])) {
				System.out.print("소문자");
			}
			if(Character.isLetter(chs[i])) {
				System.out.print("문자");
			}
			
			if(Character.isDefined(chs[i])) {
				System.out.print("유니코드입니다.");
			}
			
			 
			System.out.println();
		}
	}

}
