package org.testing.testscripts;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.json.JSONException;
import org.testing.teststeps.httpmethod;
import org.testing.utilities.jsonhandle;
import org.testing.utilities.propertieshandle;
import org.testng.annotations.Test;

public class testcase3 
{
	@Test
	public void tc3() throws JSONException, IOException
	{
		Properties pr=propertieshandle.loadpropertiesfile("../first/uri.properties");
		httpmethod http=new httpmethod(pr);
		http.getparticularmethod("uri1", testcase1.returnidvalue);
	}
}
