package com.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class configReader {
	
	private Properties prop;
	
	public Properties init_prop() throws IOException
	{
		prop=new Properties();
		FileInputStream ip=new FileInputStream("E:\\Java Programs\\CucumberPOMSeries\\srs\\test\\resources\\Config\\config.properties");
		prop.load(ip);
		return prop;
	}
	
	

}
