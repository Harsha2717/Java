
public class StringRotate {
	public static void main(String[] args) {
		String one = "ABCDEF";
		String split1 = "";//CDAB
		String split2 = "";
		int d = 5;
	
		split1 = one.substring(0,d);
		split2 = one.substring(d,one.length());
		System.out.println(split2 + split1);
	}
}
