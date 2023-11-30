package Writing_to_file_using_Scanner_UserInput;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WritingUsingScanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		File file = new File(
				"D:/JAVA UDEMY/Writing To Files/src/Writing_to_file_using_Scanner_UserInput/testUsingScanner.txt");
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
			System.out.println("Enter Number of lines :");
			int lines = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter " + lines + " lines: ");
			for (int i = 0; i < lines; i++) {
				bw.write(sc.nextLine());
				bw.newLine();
			}
			System.out.println("Thanks For Entering Lines");
		} catch (IOException e) {
			System.out.println("Unable to Write to file : " + file.toString());
		}
		sc.close();
	}
}