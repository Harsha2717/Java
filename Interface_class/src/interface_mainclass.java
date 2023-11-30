/*Interface And Abstract classes are same but some Different Features
 * The Interfaces can be Multiple Interfaces i.e One subclass can interface multiple interface class
 * Interface acts as Blueprint that contains methods that should be implemented in the subclass
 * Interface class methods must be 

*/
import java.util.Scanner;

interface Playable	
{
	 public abstract void Play();
}

interface Displayable
{
	public  void Display();
}

class Audio implements Playable
{ 
	String Artist;
	String Title;
	double Duration;
	
	Audio(String artist,String title,double duration)
	{
		this.Artist = artist;
		this.Title = title;
		this.Duration = duration;
	}
	
	public void Play() 
	{
		System.out.println("Playing Audio \nTitle : " + Title + "\nArtist : "+Artist + "\nDuration : "+Duration);
	}
}

class Video implements Displayable
{
	String Title;
	double Duration;
	String Resolution;
	
	Video (String title,String resolution,double duration)
	{
		this.Title = title;
		this.Duration = duration;
		this.Resolution = resolution;
	}
	
	public void Display() 
	{
		System.out.println("Displaying Video \nTitle : " + Title + "\nDuration : " + Duration + "\nResolution : " + Resolution);
		
	}
}

class Image implements Displayable
{
	String Title; 
	double Width; 
	double Height;
	
	Image(String title,double width,double height)
	{
		this.Title = title;
		this.Width = width;
		this.Height = height;
	}
	public void Display() 
	{
		System.out.println("Displaying image \nTitle : "+ Title + "\nHeight : " + Height + "\nWidth : " + Width);
	}
}

class MultimediaPlayer
{
	public void playmedia(Playable audio) //Playable creates an object directly refers to playable interface.
	{
		audio.Play();	//the audio object directly can directly access the Play() method in interface
	}
	public void Displaymedia(Displayable video) 
	{
		video.Display();
	}
	public void DisplayImage(Displayable image) 
	{
		image.Display();
	}
}

public class interface_mainclass 
{
	public static void main(String [] args) 
	{
		String Audio_name;
		String Singer_name;
		double duration;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Audio_Name : ");
		Audio_name = sc.nextLine();
		System.out.println("Artist_Name : ");
		Singer_name = sc.nextLine();
		System.out.println("Duration : ");
		duration = sc.nextDouble();
		
		Audio Hukum = new Audio(Singer_name,Audio_name,duration);
		
		Video Alone = new Video("Alone","1080P",03.82);
	
		Image Harsha = new Image("Harsha",8,12);
		
		MultimediaPlayer play = new MultimediaPlayer();
		play.playmedia(Hukum);
		System.out.println("\n");
		play.Displaymedia(Alone);
		System.out.println("\n");
		play.DisplayImage(Harsha);
		sc.close();
	}
}



