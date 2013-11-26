
import javax.swing.JOptionPane;

public class Opdracht_1 
{
	public static void main(String[] args)
	{
		String bottles = JOptionPane.showInputDialog("How many beers on the wall?");
		for(int i = Integer.parseInt(bottles); i >= 0; i--)
		{
			if(i > 1)
			{
				System.out.println(i + " bottles of beer on the wall");
			}
			
			if(i == 1)
			{
				System.out.println(i + " bottle of beer on the wall");
			}
			
			if(i == 0)
			{
				System.out.println(i + " bottles are left you drank them all");
			}
		}
	}
}
