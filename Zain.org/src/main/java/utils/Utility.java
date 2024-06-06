package utils;

import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

public class Utility {
	public static String getValue(String value) throws IOException {
		Properties prop = new Properties();
		FileReader reader = new FileReader("testdata.properties");
		prop.load(reader);
		return prop.getProperty(value);
	}

	public static String getTimeStamp() {
		return new SimpleDateFormat("dd-M-yyyy hh:mm:ss").format(new Date()).replaceAll("[-: ]", "_");
	}
	public static int getRandomNumber(int min, int max) {
		return (int) ((Math.random() * (max - min)) + min);
	}


}