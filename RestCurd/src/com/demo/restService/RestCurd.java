package com.demo.restService;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.demo.jaxws.beans.Person;
import com.demo.jaxws.beans.Response;
import com.demo.jaxws.service.PersonServiceImpl;

@Path("manageWebService")
public class RestCurd {
	PersonServiceImpl add = new PersonServiceImpl();
	Response resp = new Response();

	// Create Service
	@POST
	@Path("/create")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response createPersonDetails(Person p) {
		boolean result=	add.addPerson(p);
		if (result==true) 
		{
			resp.setResult("Success");
			resp.setMessage("Person Created Sucessfully");

		} else 
		{
			resp.setResult("Failure");
		}
		return resp;
	}

	

	/*
	 * 
	 */
	// Create Service
	@PUT
	@Path("/update")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_XML)
	public void updatePersonDetails(Person p) {
		add.update(p);
	}

	// Create Service
	@DELETE
	@Path("/delete")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response deletePersonDetails(Person p) {
		boolean is = add.deletePerson(p);
		if (is == true) 
		{
			resp.setResult("Success");
			resp.setMessage("Person Deleted Sucessfully");

		} else 
		{
			resp.setResult("Failure");
		}
		return resp;
	}

	@GET
	@Path("/get")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Person[] getAllPersons() {
		Person[] p = add.getAllPersons();
		return p;
	}
}
