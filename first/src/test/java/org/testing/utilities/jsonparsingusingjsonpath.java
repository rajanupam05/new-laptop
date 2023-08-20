package org.testing.utilities;

import io.restassured.response.Response;

public class jsonparsingusingjsonpath 
{
	public static String jsonparse(Response res, String jsonpath)
	{
		return res.jsonPath().get(jsonpath);
	}
}
