package kr.java.chapter11;

public class CloneTest {

	public static void main(String[] args) {

		Integer i1 = Integer.valueOf(100);
		Integer i2 = i1;


		// 동일한 주소의 두 인스턴스 비교
		if (i1 == i2)
			System.out.println("주소는 같습니다.");
		else
			System.out.println("주소는 다릅니다.");

		if (i1.equals(i2))
			System.out.println("객체는 같습니다.");
		else
			System.out.println("객체는 다릅니다.");

		System.out.println("i1 hashCode :" + i1.hashCode());
		System.out.println("i2 hashCode :" + i2.hashCode());

		System.out.println("i1 실제 주소값 :" + System.identityHashCode(i1));
		System.out.println("i2 실제 주소값 :" + System.identityHashCode(i2));

	}
}
