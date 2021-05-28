package kr.java.chapter11;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringFormatTest {

	public static void main(String[] args) {
		// %[argument_index$][flags][width]conversion

		/*
		 * 필수 값 : conversion
			%d : 10진수(정수)
			%x : 16진수
			%o : 8진수
			%f : 실수
			%s : 문자열
		 */
		System.out.printf("%s [%d] %s [%d]", "홍길동", 100, "고길동", 200);
		System.out.println();
		
		String str = String.format("%s [%d] %s [%d]", "홍길동", 100, "고길동", 200);
		System.out.println(str);
		
		System.out.printf("%2$s %1$s", "홍길동", "고길동");
		System.out.println();
		
		System.out.println(String.format("%10d%10d", 12345, 67890));
		
		
		/*
		 * 날짜 포맷팅.
		 */
		String form = "yyyy년 MM월 dd일 hh 시 mm분 ss초";
		SimpleDateFormat sdf = new SimpleDateFormat(form);
		
		// 날짜
		Date dt = new Date();
		String now = dt.toString();
		System.out.println(now);
		System.out.println(sdf.format(dt));
		
		
		/*
		 * 숫자 포매팅
		 */
		DecimalFormat df = new DecimalFormat("#,###0.0");
		String result = df.format(1234459.99);
		System.out.println(result);
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
