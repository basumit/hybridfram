package com.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import com.base.BaseClass;

public class Utilproperties extends BaseClass {
	public static FileInputStream file=null;
	public static String readproperty(String key) throws Exception {
		
	
       String path=System.getProperty("user.dir")+"/src/main/resources/config.properties";
	 Properties pro =new Properties();
	 try {
		file=new FileInputStream(path);
	} catch (FileNotFoundException e) {
		log.error("currnt file is not available given location");
	}
	 pro.load(file);
	 return pro.getProperty(key);
}
}