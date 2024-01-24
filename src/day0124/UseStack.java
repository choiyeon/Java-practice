package day0124;

import java.util.List;
import java.util.Stack;

public class UseStack {
	public UseStack() {
		//1.생성
//		List<String> list = new Stack<String>();
		Stack<String> stk = new Stack<String>();
		
		//2. 값 할당) - item(String)
//		stk.add("입니다."); //부모(Vector)의 method를 사용하지 않는다. 값 넣을 때 push만 사용.
		stk.push("입니다.");
		stk.push("수요일");
		stk.push("오늘은");
		
		//3. 값 얻기 - pop() -얻어낸 item은 사라진다.
		System.out.println(stk.empty());
		while(!stk.empty()) {//스택에 아이템이 없으면 반복하지 않음.
			System.out.println(stk.pop());
		}//while
		
//		for(int i = 0; i < stk.size(); i++) {//부모(Vector)의 method를 사용하지 않는다. 값 뺄 때 pop만 사용.
//			System.out.println(stk.get(i));
//		}
		System.out.println(stk.empty());
	}//UseStack
	

	public static void main(String[] args) {

		new UseStack();
	}//main

}//class
