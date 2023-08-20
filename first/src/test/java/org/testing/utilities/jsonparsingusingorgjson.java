package org.testing.utilities;

import org.json.JSONArray;
import org.json.JSONObject;

public class jsonparsingusingorgjson 
{
	public static void jsonparse(String responsedata, String keyname)
	{
		JSONArray ja=new JSONArray(responsedata);
		int l=ja.length();
		for(int i=0; i<l; i++)
		{
			JSONObject j=ja.getJSONObject(i);
			System.out.println(j.get(keyname));
		}
	}
}
