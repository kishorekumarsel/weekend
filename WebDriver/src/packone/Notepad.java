package packone;

import java.io.BufferedReader;
import java.io.FileReader;

public class Notepad {

	public static void main(String[] args) throws Exception{
		
		FileReader f=new FileReader("C:\\Users\\DELL\\Desktop\\WDWeekend\\0518.txt");
		BufferedReader b=new BufferedReader(f);
		
		String  s;
		
		while((s=b.readLine())!=null){
			if(s.contains("Webdriver")==true){
				String[] c=s.split(" ");
		System.out.println(c[2]);}
	}
	}
}
