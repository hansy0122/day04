package day04;

public class Car {
	String model;
	int speed;
	
	Car(String model){
		this.model=model;
	}
	
	void setSpeed(int speed){
		this.speed=speed;
	}
	void run(){
		for (int i=0; i<50;i+=10){
			System.out.println(model+"run at"+i+"km");
		}
	}
	public static void main(String ar[]){ //스테틱 내에서 non static use X
		Car c=new Car("노노");
		c.run();
		
	}
	
	
	
}
