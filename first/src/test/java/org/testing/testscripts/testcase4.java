package org.testing.testscripts;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testing.teststeps.httpmethod;
import org.testing.utilities.jsonhandle;
import org.testing.utilities.propertieshandle;
import org.testng.annotations.Test;

public class testcase4 
{
	@Test
	public void tc4() throws FileNotFoundException, IOException
	{
		Properties pr=propertieshandle.loadpropertiesfile("../first/uri.properties");
		String requestbody=jsonhandle.loadjsonhandle("../first/src/test/java/org/testing/resources/updaterequestpayload.json");
		httpmethod http=new httpmethod(pr);
		http.putmethod(requestbody, "uri1", testcase1.returnidvalue);
	}
}
