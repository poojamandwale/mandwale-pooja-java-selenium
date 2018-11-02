interface music1
{
	void play();
}

class mp3player1 implements music1
{
	public void play()
	{
		System.out.println("Music will run as mp3");
	}
}

class mp4player1 implements music1
{
	public void play()
	{
		System.out.println("Music will run as mp4");
	}
	
}

public class ques7 {

	public static void main(String[] args) 
	{
		mp3player m3=new mp3player();
		mp4player m4=new mp4player();
		
		m3.play();
		m4.play();

	}

}
