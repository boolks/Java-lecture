package ko.co.infopub.chapter.s026;

public class BioCalendar {
	public static final int PHYSICAL = 23;	// 상수(개발자 정의)
	
	public static void main(String[] args) {
		// 상수, 상수값은 변경할 수 없다
		System.out.println(PHYSICAL);
		int index = PHYSICAL;
		// Math.PI 3.14 에서 정의되어 있는 상수
		double vals = 2 * Math.PI / index;
		System.out.println(vals + "라디안");
		
	}

}
