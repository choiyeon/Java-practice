package day0214;

public class UseSleep implements Runnable {

	//2. run method override
	@Override
	public void run() {
		// 3. thread로 처리할 코드 정의(동시에 실행할 코드)
		System.out.print("loading");
		try {
			for (int i = 0; i < 10; i++) {
				System.out.print(" . ");
				Thread.sleep(100);
			} // end for
		} catch (InterruptedException e) {
			e.printStackTrace();
		} // end catch
		System.out.print("finish");
	}// run

	public static void main(String[] args) {
		// 4. 자식클래스 객체화
		UseSleep us = new UseSleep();
		// 5. thread has a
		Thread t = new Thread(us);
		// 6. thread 호출
		t.start();
	}// main

}// class
