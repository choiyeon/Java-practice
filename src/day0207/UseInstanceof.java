package day0207;

import java.io.NotSerializableException;
import java.io.Serializable;

public class UseInstanceof {

	public void useInstanceof(UserData ud) throws NotSerializableException{
		if(!(ud instanceof Serializable)) {
			//입력된 ud객체가 직렬화가 가능한 인터페이스를 구현한 클래스인가?
			//return;
			throw new NotSerializableException("직렬화하고 오세요.");
		}//end if
		System.out.println(ud.toString());
	}//useInstanceof
	
	public static void main(String[] args) {
		UserData ud = new UserData();
		UseInstanceof ui = new UseInstanceof();
		try {
			ui.useInstanceof(ud);
		} catch (NotSerializableException e) {
			e.printStackTrace();
		}
	}

}
