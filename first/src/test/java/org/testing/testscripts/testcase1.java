package org.testing.testscripts;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Pattern;

import org.testing.responsevalidation.softvalidation;
import org.testing.responsevalidation.validateresponse;
import org.testing.teststeps.httpmethod;
import org.testing.utilities.jsonhandle;
import org.testing.utilities.jsonparsingforpost;
import org.testing.utilities.jsonreplacement;
import org.testing.utilities.propertieshandle;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class testcase1 
{
	static String returnidvalue;
	@Test 
	public void tc1() throws FileNotFoundException, IOException
	{
		Properties pr=propertieshandle.loadpropertiesfile("../first/uri.properties");
		String requestbody=jsonhandle.loadjsonhandle("../first/src/test/java/org/testing/resources/requestpayload.json");
		Random r=new Random();
		Integer idvalue=r.nextInt();
		requestbody=jsonreplacement.assignvariable(requestbody, "id", idvalue.toString());
		httpmethod http=new httpmethod(pr);
		Response res=http.postmethod(requestbody, "uri1");
		softvalidation.validate(201, res);
		validateresponse.responsecodevalidate("hardik pandya", res, "name");
		returnidvalue=jsonparsingforpost.jsonparse(res.asString(), "id");
	}
}
