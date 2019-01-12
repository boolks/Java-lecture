package ko.co.infopub.chapter.s018;

public class JavaTypeConversion {

	public static void main(String[] args) {
		String slat = "37.52127220511242    ";
		// String slat = "hello";
		// 공백 제거 후 double로 타입 변환
		double latitude = Double.parseDouble(slat.trim());
		double latitude2 = Double.parseDouble(slat);
		System.out.println(latitude);
		System.out.println(latitude2);
	}

}
