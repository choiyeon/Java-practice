package day0213;

/**
 * 
 */
//1. Runnable interface를 구현
public class ImplementsRunnable implements Runnable{

	
	
	//2. run method override
	@Override
	public void run() {
		//3. 동시에 실행되어야 할 코드
		for(int i = 0; i < 500; i++) {
			System.out.println("run i ------> "+i);
		}
	}//run
	
	public void test() {
		for(int i = 0; i < 500; i++) {
			System.out.println("test i ++++++++++++> "+i);
		}
	}//test
	
	
	public static void main(String[] args) {
		//4. 자식 클래스를 객체화.
		ImplementsRunnable ir = new ImplementsRunnable();
		
		//5. Thread 클래스와 has a 관계로 객체화
		Thread t = new Thread(ir);
		
		//6. Thread의 start()를 호출하여 동시에 실행되어야 할 코드를 정의
		t.start();
		ir.test();
		
	}//main


}//class
