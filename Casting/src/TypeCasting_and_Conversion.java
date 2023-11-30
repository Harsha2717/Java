
public class TypeCasting_and_Conversion {
	public static void main(String[] args) {
	
		byte byte_val = 127;
		short short_val = 1227;
		int int_val = 12227;
		long long_val = 1222227;
		
		float float_val = 3.127f;
		double double_val = 3.127;
		
		//short_val = byte_val;	//Can be done Implicitly because size of Short is greater than byte
	//	byte_val = short_val;	//This cannot be done Implicitly because value of byte is smaller than Short

		//This is Explicit Conversion or TypeCasting and it should not exceed the size of byte.
		
		//byte_val = (byte)short_val;	 //This completes the Circle and provides negative values
		
		long_val = int_val;	//TypeConversion
		//int_val = long_val; //Error cannot assign long to int 
		int_val = (int)long_val;
		
		//similarly
		//float_val = double_val;	//Error
		float_val = (float)double_val;	//The Type need to be Entered in the Brackets
		
		System.out.println(byte_val+" , "+ short_val+" , "+ float_val);
		
	}

}
