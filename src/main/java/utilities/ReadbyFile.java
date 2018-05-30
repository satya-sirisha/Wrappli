package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import generiLib.Constants;

public class ReadbyFile {
	static Properties pro;
	public static Properties loadfiles() {
		try {
			if(pro==null) {
			  pro=new Properties();
				File f=new File(System.getProperty("user.dir")+"/configurations/");
			
				File[] allfiles= f.listFiles();
				int a = allfiles.length;
				System.out.println(a);
				for( int i=0;i<a;i++) {
					 pro.load(new FileInputStream(allfiles[i]));
					 System.out.println(allfiles[i].getName());
				}
				
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return pro;
		
	}
	public static String getdesiredproperty(String keyvalue) {
		pro=loadfiles();
		String data = pro.getProperty(keyvalue);
		return data;
	}
	
public static void main(String[] args) {
System.out.println(" ---------------------        ");
System.out.println(getdesiredproperty("BROWSER"));

}


}
