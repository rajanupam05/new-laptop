package org.testing.testscripts;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testing.teststeps.httpmethod;
import org.testing.utilities.propertieshandle;
import org.testng.annotations.Test;

public class testcase5 
{
	@Test
	public void tc5() throws FileNotFoundException, IOException
	{
		Properties pr=propertieshandle.loadpropertiesfile("../first/uri.properties");
		httpmethod http=new httpmethod(pr);
		http.deletemethod("uri1", testcase1.returnidvalue);
	}
}
