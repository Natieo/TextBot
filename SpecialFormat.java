import java.io.*;

public class SpecialFormat
{
	String Text;
	String[][] DataPairs;
	public boolean formatCornell(String file){
		try(FileReader filereader = new FileReader(file))
		{
			System.out.println("Reading");
			int c = filereader.read();
			int i = 100000;
			int j = 0;
			while(c != -1)
			{
				j++;
				if(j > i)
				{
					System.out.println("Marker");
					j = 0;
				}
				Text = Text + (char)c;
				c = filereader.read();
			}
		}
		catch(IOException e){
			System.out.println("File Exception Found!!");
			e.printStackTrace();
			return false;
		}
		System.out.println(Text);
		return true;
	}
	
	public static void main(String args[])
	{
		SpecialFormat s = new SpecialFormat();
		s.formatCornell("./cornellCorp/movie_lines.txt");
	}
}