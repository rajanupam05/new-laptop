package org.testing.testscripts;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testing.responsevalidation.validateresponse;
import org.testing.teststeps.httpmethod;
import org.testing.utilities.jsonparsingusingorgjson;
import org.testing.utilities.propertieshandle;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class testcase2 
{
	@Test
	public void tc2() throws FileNotFoundException, IOException
	{
		Properties pr=propertieshandle.loadpropertiesfile("../first/uri.properties");
		httpmethod http=new httpmethod(pr);
		Response res=http.getmethod("uri1");
		validateresponse.responsestatusdata(200, res);
		jsonparsingusingorgjson.jsonparse(res.asString(), "id");
	}
}
