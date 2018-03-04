package day04;

public class Singleton {
	public  static Singleton instance=new Singleton();
	
	private Singleton(){
		
	}
	
	
	public static Singleton getinstance(){
		return instance;
	}
	
	public static void main(String ar[]){
		Singleton o2=Singleton.getinstance();
		Singleton o1=Singleton.getinstance();
		
		if(o1==o2){
			System.out.println("same");
		}
	}

}
