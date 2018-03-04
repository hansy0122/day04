package day04;

public class Eat {
	static final int x=100;
	static String name="han";
	static void eat(){	
	}
	
	final String a;
														//final은 자동초기화 안됨 
	//Eat(String a){ //컴파일 에러
		/*this.a=a;*/
	}
	
	public void eat (final String m){
	//	m=""; //컴파일에러
	}
	
	public static void main(String ar[]){
		/*x=30;*/ // 파이널은 변경불가
	}
}
