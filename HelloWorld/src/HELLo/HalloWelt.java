package HELLo;

public class HalloWelt {
	
	
	public static String text = "Ich liebe dich!";

	public static void main(String[] args) {
		// Gebe Mir einen Sinnlosen Text aus!
		einenSinnlosenTextAusgeben();
	}
	
	public static void einenSinnlosenTextAusgeben()
	{
		System.out.println(text);
	}

	public void findeDame(int d,int k)
	{
		if(k==64)
		{
			return null;
		}else
		{
			findeDame(d,k++);
		}
	}
}
