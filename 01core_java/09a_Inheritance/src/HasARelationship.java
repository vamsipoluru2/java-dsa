class Engine{
	int engineNo;
	
	int getEngineNo(int eNo) {
		engineNo=eNo;
		return engineNo;
	}
	
}

class Car{
	int NoWheels;
	String color;
	Engine e;//car has an engine
	void showCarDetails(Engine en,int eNo) {
		e=en;
		System.out.println("engine no: "+e.getEngineNo(eNo));
		System.out.println("No of wheels: "+NoWheels);
		System.out.println("color: "+color);
	}
	
}
public class HasARelationship {

	public static void main(String[] args) {
		Car c=new Car();
		c.NoWheels=4;
		c.color="blue";
		c.showCarDetails(new Engine(), 100);

	}

}
