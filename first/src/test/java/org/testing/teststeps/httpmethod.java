package org.testing.teststeps;

import java.util.Properties;

import javax.sound.midi.Synthesizer;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class httpmethod 
{
	Properties pr;
	public httpmethod(Properties pr) {
		this.pr=pr;
	}
	public Response postmethod(String requestbody, String urikeyname)
	{
		String urivalue=pr.getProperty(urikeyname);
		
		Response res=
				given()
				.contentType(ContentType.JSON)
				.body(requestbody)
				.when()
				.post(urivalue);
		System.out.println(res.asString());
		/////System.out.println(res.statusCode());
		return res;
	}
	public Response getmethod(String urikeyname)
	{
		String urivalue=pr.getProperty(urikeyname);
		
		Response res=
				given()
				.contentType(ContentType.JSON)
				.when()
				.get(urivalue);
		
		System.out.println(res.asString());
		return res;
	}
	public void getparticularmethod(String urikeyname, String endpoint)
	{
		String urivalue=pr.getProperty(urikeyname)+"/"+endpoint;
		
		Response res=
				given()
				.contentType(ContentType.JSON)
				.when()
				.get(urivalue);
		
		System.out.println(res.statusCode());
		System.out.println(res.asString());
	}
	public void putmethod(String requestbody, String urikeyname, String endpoint)
	{
		String urivalue=pr.getProperty(urikeyname)+"/"+endpoint;
		
		Response res=
				given()
				.contentType(ContentType.JSON)
				.body(requestbody)
				.when()
				.put(urivalue);
		
		System.out.println(res.statusCode());
		System.out.println(res.asString());
	}
	public void deletemethod(String urikeyname, String endpoint)
	{
		String urivalue=pr.getProperty(urikeyname)+"/"+endpoint;
		
		Response res=
				given()
				.contentType(ContentType.JSON)
				.when()
				.delete(urivalue);
		
		System.out.println(res.statusCode());
		System.out.println();
	}
}
