package org.testing.utilities;

import java.util.regex.Pattern;

public class jsonreplacement 
{
	public static String assignvariable(String requestbody, String variablename, String variablevalue)
	{
		requestbody=requestbody.replaceAll(Pattern.quote("{{"+variablename+"}}"), variablevalue);
		return requestbody;
	}
}
