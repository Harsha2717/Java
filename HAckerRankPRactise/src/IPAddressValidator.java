import java.util.Scanner;

class IPAddressValidator {
    public static void main(String[] args){
        try (Scanner in = new Scanner(System.in)) {
			System.out.println("Enter : ");
			String pattern = "^(0|25[0-5]|2[0-4][0-9]|[01]?[0-9]{1,2})\\.(0|25[0-5]|2[0-4][0-9]|[01]?[0-9]{1,2})\\.(0|25[0-5]|2[0-4][0-9]|[01]?[0-9]{1,2})\\.(0|25[0-5]|2[0-4][0-9]|[01]?[0-9]{1,2})";

			while(in.hasNext()){
			    String IP = in.next();
			    System.out.println(IP.matches(pattern));
			}
		}
    }
}

