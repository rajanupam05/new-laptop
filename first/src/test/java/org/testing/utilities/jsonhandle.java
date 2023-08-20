package org.testing.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

public class jsonhandle 
{
	public static String loadjsonhandle(String filepath) throws JSONException, FileNotFoundException
	{
		File f=new File(filepath);
		JSONObject jo=new JSONObject(new JSONTokener(new FileInputStream(f)));
		return jo.toString();
	}
}
