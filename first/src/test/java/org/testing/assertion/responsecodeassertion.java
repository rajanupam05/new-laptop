package org.testing.assertion;

import com.fasterxml.jackson.databind.util.ArrayBuilders.BooleanBuilder;

import io.restassured.response.Response;

public class responsecodeassertion 
{
	public static Boolean assert1(int responsecode, Response res)
	{
		if(res.statusCode()==responsecode)
		{
			System.out.println("code is matching");
			return true;
		}
		else
		{
			return false;
		}
	}
	public static Boolean assert1(String expectedvalue, String actualvalue)
	{
		if(expectedvalue.equals(actualvalue))
		{
			System.out.println("response data matched");
			return true;
		}
		else
		{
			return false;
		}
	}
}