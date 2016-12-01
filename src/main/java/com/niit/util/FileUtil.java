package com.niit.util;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

import org.springframework.web.multipart.MultipartFile;


public class FileUtil {
	
	public static void Upload(String path,MultipartFile file,String filename)
	{
		if(!file.isEmpty()){
			
			try{
				byte[] bytes = file.getBytes();
				File dir = new File(path);
				if(!dir.exists())
				{
					dir.mkdirs();
				}
				File ServerFile = new File(dir.getAbsolutePath()+File.separator +filename);

				BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(ServerFile));
			stream.write(bytes);
			stream.close();
			}
catch(Exception e)
			{
	e.printStackTrace();
	System.out.println(e);
			}
		}
		
	}
	
	}
