class Car{
	String color;
	String gearType;
	int door;
	
	Car(){}
	
	Car(String c, String g, int d){
		color = c;
		gearType = g;
		door = d;
	}
}
public class CarTest {

	public static void main(String[] args) {
		Car c1 = new Car();
		c1.color = "white";
		c1.gearType = "auto";
		c1.door = 4;
		
		Car c2 = new Car("Black","auto", 4);
		System.out.printf("c1은 %s, %s, %d 이고%n",c1.color,c1.gearType,c1.door);
		System.out.printf("c2은 %s, %s, %d 이다",c2.color,c2.gearType,c2.door); 

	}

}
