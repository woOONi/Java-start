class Car1{
	String color;
	String gearType;
	int door;
	
	Car1(){
		this("white","auto",4);
	}
	
	Car1(String color){
		this(color,"auto",4);
	}
	Car1(String color, String gearType, int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
}
public class CarTest2 {

	public static void main(String[] args) {
		Car1 c1 = new Car1();
		Car1 c2 = new Car1("blue");
		
		System.out.printf("c1은 %s, %s, %d 이고%n",c1.color,c1.gearType,c1.door);
		System.out.printf("c2은 %s, %s, %d 이다",c2.color,c2.gearType,c2.door); 
	}
}
