import java.util.*;
import java.io.*;

public class SpecialFormat
{
	ArrayList<String> Conv;
	ArrayList<String[]> Pairs;
	String Text;
	public ArrayList<String[]> formatCornell(String file){
		Conv = new ArrayList<String>();
		Pairs = new ArrayList<String[]>();
		FileInputStream IS;
		Scanner IN;
		try{
			IS = new FileInputStream(file);
			IN = new Scanner(IS, "UTF-8");
			while(IN.hasNextLine())
			{
				String s = IN.nextLine();
				String[] a = s.split("\\+\\+\\+\\$\\+\\+\\+");
				Conv.add(a[4].trim());
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	
		for(int i = 0; i < Conv.size()-1; i+=2)
		{
			Pairs.add(new String[]{
				Conv.get(i),
				Conv.get(i+1)});
		}
		
		return Pairs;
	}
}