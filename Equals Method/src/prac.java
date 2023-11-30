import java.util.Arrays;

public class prac {
	public static boolean equals(int[] arr1, int[] arr2) {
		boolean b = true;
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] == arr2[i]) {
				b = true;
			} else {
				b = false;
			}
		}
		return b;
	}
	public static void main(String[] args) {

		int[] arr1 = new int[] { 10, 20, 30, 40, 50 };
		int[] arr2 = new int[] { 10, 20, 30, 40, 50 };
		int[] arr3 = new int[] { 10, 30, 20, 50, 40 };

		// Default Array methods
		System.out.println("Using Default Array.equals Method :");
		System.out.println(Arrays.equals(arr1, arr2));
		
		System.out.println(Arrays.equals(arr1, arr3));

		System.out.println("Using overriden equals method from same class by Static: \n" + equals(arr1,arr2));
		
		 Compare comp = new Compare();
		 System.out.println("Using overriden equals method from another class: \n" +
		 comp.equals(arr1,arr2));

	}
}

class Compare {
	public  boolean equals(int[] arr1, int[] arr2) {
		boolean b = true;
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] == arr2[i]) {
				b = true;
			} else {
				b = false;
			}
		}
		return b;
	}
}
