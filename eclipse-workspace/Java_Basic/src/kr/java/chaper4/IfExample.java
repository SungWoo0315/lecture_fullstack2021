package kr.java.chaper4;

public class IfExample {

	public static void main(String[] args) {

		boolean isMarried = true;
		
		if(isMarried){
			System.out.println("��ȥ�Դϴ�");
		}
		
		boolean isEven;
		int num = 10;
		isEven = (num%2 == 0)?true:false;
		System.out.println(isEven);
		
		int sum;
		int num2;
		for(num2=1, sum = 0; ; num2++){
			sum += num2;
			if(sum > 500) break;
		}
		System.out.println(sum);
		System.out.println(num2);
	}
}