package org.testing.responsevalidation;

import static org.testng.Assert.assertEquals;

import org.testing.assertion.responsecodeassertion;
import org.testing.utilities.jsonparsingusingjsonpath;
import org.testng.Assert;
import org.testng.asserts.Assertion;

import io.restassured.response.Response;

public class validateresponse 
{
	public static void responsestatusdata(int expectedcode, Response res)
	{
		Assert.assertEquals(res.statusCode(), expectedcode,"code not matched");
		System.out.println("code matched");
	}
	public static void responsecodevalidate(String expectedvalue, Response res, String jsonpath)
	{
		String actualvalue=jsonparsingusingjsonpath.jsonparse(res, jsonpath);
		Boolean response=responsecodeassertion.assert1(expectedvalue, actualvalue);
		Assert.assertTrue(response);
	}
} 
