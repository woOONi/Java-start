class Car2{
	String color;
	String gearType;
	int door;
	
	Car2(){
		this("white","auto",4);
	}
	
	Car2(Car2 c){
		color = c.color;
		gearType = c.gearType;
		door = c.door;
	}
	
	Car2(String color, String gearType, int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
}
public class CarTest3 {

	public static void main(String[] args) {
		Car2 c1 = new Car2();
		Car2 c2 = new Car2(c1);
		System.out.printf("c1은 %s, %s, %d 이고%n",c1.color,c1.gearType,c1.door);
		System.out.printf("c2은 %s, %s, %d 이다%n",c2.color,c2.gearType,c2.door); 
		
		c1.door = 100;
		System.out.println();
		System.out.printf("c1은 %s, %s, %d 이고%n",c1.color,c1.gearType,c1.door);
		System.out.printf("c2은 %s, %s, %d 이다",c2.color,c2.gearType,c2.door); 
	}
}
