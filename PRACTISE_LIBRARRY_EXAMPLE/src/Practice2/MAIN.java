package Practice2;

import java.util.Scanner;

interface ShapeRec {
	void CalculateAreaOfRectangle(double length, double breadth);
}

interface ShapeCircle {

	void CalulateAreaOfCircle(double radius);
}

interface ShapeSquare {
	void CalculateAreaOfSquare(double side);
}

public class MAIN {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			ShapeRec Rectangle = new ShapeRec() {
				@Override
				public void CalculateAreaOfRectangle(double length, double breadth) {
					System.out.println("\nThe Area of Rectangle = " + (length * breadth));
				}
			};

			ShapeCircle Circle = new ShapeCircle() {
				@Override
				public void CalulateAreaOfCircle(double radius) {
					System.out.println("\nThe Area of Circle = " + ((Math.PI) * (Math.pow(radius,2))));
				}
			};

			ShapeSquare Square = new ShapeSquare() {
				@Override
				public void CalculateAreaOfSquare(double side) {
					System.out.println("\nThe Area of Sqaure = " + (Math.pow(side,2)));
				}
			};

			System.out.println("\n==================Welcome to Calculator==================\n");
			System.out.println("Please Select an Valid Option\n");
			int selection = 0;
			while(selection != 4)
			{
				System.out.println("1 : Calculate Area of Rectangle ");
				System.out.println("2 : Calculate Area of Circle ");
				System.out.println("3 : Calculate Area of Sqauare ");
				System.out.println("4 : Exit ");
				System.out.println();
				selection = sc.nextInt();
				

				switch (selection) {

				case 1: {
					System.out.println("To Calculate Area of Rectangle :");
					System.out.print("Enter Length :");
					double length = sc.nextDouble();
					System.out.print("Enter Breadth :");
					double Breadth = sc.nextDouble();
					Rectangle.CalculateAreaOfRectangle(length, Breadth);
					System.out.println();
					break;
				}
				case 2: {
					System.out.println("To Calculate Area of Circle");
					System.out.print("Enter Radius of Square : ");
					double radius = sc.nextDouble();
					Circle.CalulateAreaOfCircle(radius);
					System.out.println();
					break;
				}
				case 3: {

					System.out.println("To Calculate Area of sqaure : ");
					System.out.print("Enter Side Length");
					double side = sc.nextDouble();
					Square.CalculateAreaOfSquare(side);
					System.out.println();
					break;
				}
				case 4: {
					System.out.println("Thanks for Using The Calculator...Have a Good Day\n");
					System.out.println();
					break;
				}
				default: 
				{
					System.out.println("Choose a Valid Input");
				}
				
			}
			}
		}
	}
}
		