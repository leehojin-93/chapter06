package echo.ex02;

public class LowerThread extends Thread {
	
	// field
	
	// constructors
	
	// method getter/setter
	
	// method
	@Override
	public void run() {
		for ( char ch = 'a'; ch <= 'z'; ch++ ) {
			System.out.println(ch);
			try {
				Thread.sleep(350);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}