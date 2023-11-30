class Swap<T>
{
	private T first;
	private T Second;
	
	public T getFirst() {
		return first;
	}
	public void setFirst(T first) {
		this.first = first;
	}
	public T getSecond() {
		return Second;
	}
	public void setSecond(T second) {
		Second = second;
	}	
	
	public void swap() 
	{
		System.out.println("Before Swap \n" + this.first + " " + this.Second + "\n");
		T temp = this.first;
		this.first = this.Second;
		this.Second = temp;
		System.out.println("After Swap \n" + this.first + " " + this.Second + "\n");
	}
}

public class Practise {
	public static void main(String[] args) 
	{
		Swap<Integer> intnums = new Swap<>();
		intnums.setFirst(10);
		intnums.setSecond(20);
		intnums.swap();
		

		Swap<String> strings = new Swap<>();
		strings.setFirst("Harsha");
		strings.setSecond("Sirisha");
		strings.swap();
		
		
		
		
	}
}
