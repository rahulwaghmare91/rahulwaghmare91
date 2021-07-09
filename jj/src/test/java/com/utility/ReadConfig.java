package com.utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
 public Properties pro;
public ReadConfig()
{
	File src=new File("./Configuration/config.properties");
	try
	{
		FileInputStream f=new FileInputStream(src);
		pro=new Properties();
		pro.load(f);
	}
	catch(Exception e)
	{
		System.out.println("file not find");
	}}
	public String m1()
	{
	String urle=pro.getProperty("url");
	return urle;
	}
	public String getpath()
	{
		String path=pro.getProperty("chromepath");
		return path;
}
	
	
}
