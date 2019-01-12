package ko.co.infopub.chapter.s029;

public class BioCalendar {
	public static final int PHYSICAL = 23;
	public static double getBioRythm(long days, int index, int max) {
		return max * Math.sin( (days%index) * 2 * Math.PI / index );
	}
	
	public static void main(String[] args) {
		int days = 1200;
		double phyval = getBioRythm(days, PHYSICAL, 100);
		System.out.printf("나의 신체 지수 %1$.2f입니다.\n", phyval);

	}

}
