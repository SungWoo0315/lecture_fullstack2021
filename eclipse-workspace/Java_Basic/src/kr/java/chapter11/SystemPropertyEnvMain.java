package kr.java.chapter11;

public class SystemPropertyEnvMain {


	public static void main(String[] args) {
		// getProperty()
		String osName = System.getProperty("os.name");
		String userName = System.getProperty("user.name");
		
		System.out.println("OS" + osName);
		System.out.println("User: " + userName);
		System.out.println( System.getProperty("user.dir"));
		System.out.println( System.getProperty("java.class.path"));

		// 모든 Property
		System.getProperties().list(System.out);

		// getEnv()
		System.out.println( System.getenv("PATH") );
	}
}
