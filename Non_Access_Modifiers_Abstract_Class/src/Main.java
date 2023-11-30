
//Abstract Class or Parent Class
//Abstract class is a Class which is Default and the Methods must me implemented in its concrete class
abstract class Animal
{
	 abstract void Bark();
	 abstract void Eat();
}
//Concrete class or Sub Class or Child Class
//The Abstract methods must be implemented in its sub classes 
 class Dog extends Animal
 {
	 void Bark() //implementation
	 {
		 System.out.println("BOW BOW");
	 }
	 void Eat() //implementation
	 {
		 System.out.println("Food Over");
	 }
 }
 
 public class Main {
	 public static void main(String [] args) {
		 Dog tiger = new Dog();
		 tiger.Bark();
		 tiger.Eat();
		 
	 }
 }