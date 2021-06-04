package ch10;

public class SoundMain {

	public static void main(String[] args) {
//		Soundable cat = new Cat();
//		Soundable dog = new Dog();
//
//		cat.sound();
//		dog.sound();
		
		doSound(new Dog());
		doSound(new Cat());
	}
	
	static void doSound(Soundable s) {
		s.sound();
	}

}
