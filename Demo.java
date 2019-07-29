# AJP-Networking-
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class inet {
    
    public static void main(String args[]) throws IOException{
            
     //accept name of website from keyboard
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter a website name: ");
		
		String site = br.readLine();
		try{
            	//getByName() method accepts site name and returns its IP
           		//Address
			InetAddress ip = InetAddress.getByName(site);
			System.out.println("The IP Address is: "+ ip);
			
		}catch(UnknownHostException ue)
		{
			System.out.println("Website not found");
		}
	}
    }
