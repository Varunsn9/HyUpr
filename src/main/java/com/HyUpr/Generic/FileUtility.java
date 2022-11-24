package com.HyUpr.Generic;

import java.io.FileInputStream;
import java.util.Properties;

public class FileUtility {
public String GetDataFromProperties(String key) throws Throwable {
	FileInputStream fis=new FileInputStream(IPathConstant.FilePath);
	Properties p=new Properties();
	p.load(fis);
	String value=p.getProperty(key);	
	return value;
}
}
