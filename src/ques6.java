abstract class music
{
	void play()
	{
		
	}
}

class mp3player extends music
{
	void play()
	{
		System.out.println("Music will run as mp3");
	}
}

class mp4player extends music
{
	void play()
	{
		System.out.println("Music will run as mp4");
	}
	
}

public class ques6 {

	public static void main(String[] args) 
	{
		mp3player m3=new mp3player();
		mp4player m4=new mp4player();
		
		m3.play();
		m4.play();

	}

}
