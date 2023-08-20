package org.testing.utilities;

import org.json.JSONObject;

public class jsonparsingforpost 
{
	public static String jsonparse(String responsedata, String keyname)
	{
		JSONObject jo=new JSONObject(responsedata);
		String responseid=jo.getString(keyname);
		return responseid;
	}
}
