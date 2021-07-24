package com.mystudy.stringbuilder;

public class Ex02_StringBuilder {
	public static void main(String[] args) {
		//StringBuilder 클래스
		int num = 100;
		String str1 = "Hello"; //사용가능
		String str = new String("Hello!!");
		System.out.println(str);
		
		StringBuilder sb = new StringBuilder("Hello!! Java");
		
		
		
		System.out.println(sb);
		System.out.println(sb.toString());
		
		System.out.println("sb.capacity() <용량>: " + sb.capacity() );
		
		System.out.println("------ StringBuilder ------");
		
		sb.append(" 반갑습죠");
		System.out.println(sb);
		
		String as = sb.toString();
		as += "머냐니";
		System.out.println(as);
		sb.append(" 반갑습죠").append("@@@@@@@");
		System.out.println(sb);
		System.out.println("----------reverse--------");
		sb.reverse();
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
		
		System.out.println("---- delete(), insert(), replace() ----");
		//	Hello Java!!!반갑습니다!@@!@!@!@!@
		System.out.println(sb.delete(0, 6)); //맨앞부터 6글자 삭제
		System.out.println(sb);
		
		
		sb.insert(10,"Hello "); //10번부터  끼워 넣기
		System.out.println(sb);
		//replace int start, int end, String str)
		
		
		
		sb.replace(0, 5, "Hi,"); //수정
		System.out.println(sb);
		
		System.out.println("sb.length : " + sb.length());
		System.out.println("sb.capacity : " + sb.capacity());
		
		System.out.println("===========================");
		StringBuilder sb2 = new StringBuilder(100); // 저장공간 100개 확보
		System.out.println("sb2.length()" + sb2.length()); // 저장되어있는 Date의 크기
		
		sb2.append("안녕하세요").append("반갑습니다");
		System.out.println("sb2.length : " + sb2.length());
		System.out.println("sb2.capacity : " + sb2.capacity());
		System.out.println("--- trimToSize() 실행후 ---");
		
		
		System.out.println(">>> trimToSize() 실행 후 -----");
		sb2.trimToSize(); // 사이즈 남은 공간 삭제
		System.out.println("sb2.length : " + sb2.length());
		System.out.println("sb2.capacity : " + sb2.capacity());
		
		
		System.out.println(">>> append 실행 후 -----");
		sb2.append(" 자바공부중~");
		System.out.println("sb2 : " + sb2);
		System.out.println("sb2.toString : " + sb2.toString());
		System.out.println("sb2.length : " + sb2.length());
		System.out.println("sb2.capacity : " + sb2.capacity());
		
		
		System.out.println(">> setLength() 실행 후 ------");
		
		sb2.setLength(5); //데이터의 크기 설정(작게하면 delete 효과)

		System.out.println("sb2.toString : " + sb2.toString());
		System.out.println("sb2.length : " + sb2.length());
		System.out.println("sb2.capacity : " + sb2.capacity());
		
	}
}
