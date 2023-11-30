package AbstractClass;

public class Practise_implementation 
{
	public static void main(String[] args) 
	{
		//Machine mac = new Machine(); //  As machine a Abstract Class We cannot implement it
		Car car = new Car();
		car.set_id(6);
		System.out.println("Car id  : " + car.get_id());
		Bike bike = new Bike();
		bike.set_id(9);
		System.out.println("Bike id : " + bike.get_id()+ "\n");
		car.run();
		System.out.println();
		bike.run();
	
	}
}
