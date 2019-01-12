package ko.co.infopub.chapter.s016;

import java.util.Calendar;
import java.util.Date;

public class JavaObjectType {

	public static void main(String[] args) {
		// 기본 타입의 배열은 참조 타입
		int[] m = {1, 2, 3};
		int[] n = new int[] {1, 2, 3};
		
		// 참조 타입 - 객체 타입
		String card = "H8";
		Date d = new Date();
		Calendar cal = Calendar.getInstance();
		
		// 자동으로 toString이 붙음
		System.out.println(card);
		System.out.println(d);
		System.out.println(cal);

	}

}
 
