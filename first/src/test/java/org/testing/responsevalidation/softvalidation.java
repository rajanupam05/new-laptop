package org.testing.responsevalidation;

import static org.testng.Assert.assertTrue;

import org.testing.assertion.responsecodeassertion;
import org.testng.Assert;

import io.restassured.response.Response;

public class softvalidation 
{
	public static void validate(int responsecode, Response res)
	{
		boolean Response=responsecodeassertion.assert1(responsecode, res);
		Assert.assertTrue(Response);
	}
}
