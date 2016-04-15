package gabrail;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class OutputTest {

	public static void main(String[] args) throws IOException{
		int c;
		try{
			InputStream in= new UpperCaseInputStream(new BufferedInputStream(new FileInputStream("test.txt")));
			while((c=in.read()) >= 0){
				System.out.println((char)c);
			}
			in.close();
		}catch (IOException e){
			e.printStackTrace();
		}

	}

}
