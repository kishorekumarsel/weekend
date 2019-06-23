package packone;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Notepad_Write {
	
	public static void main(String[] args) throws Exception{
		
		FileWriter fw=new FileWriter("C:\\Users\\DELL\\Desktop\\WDWeekend\\0518new.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		
		bw.write("Helloooooo.");
		bw.append(" How are You");
		
		
		
		
		/*bw.write("Hi How are You");
		bw.newLine();
		bw.write("Hope You Are Doing Well");*/
		bw.close();
	}

}
