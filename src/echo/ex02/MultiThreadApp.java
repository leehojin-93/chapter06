package echo.ex02;

public class MultiThreadApp {
	public static void main(String[] args) throws Exception {

		Thread thread = new DigitThread();
		//		thread.run();
		thread.start(); // start() 내부에서 준비 --> run() 을 호출

		for ( char ch = 'A'; ch <= 'Z'; ch++ ) {
			System.out.println(ch);
			Thread.sleep(1000);
		}
		
	}

}
