package com.github.jbduriez;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.github.jbduriez.entities.Personne;


@Path("/test")
public class TestResources {
	
	@PersistenceContext(unitName = "PersonneService") 
	EntityManager em;
	
	@GET
	@Path("/getJSONPerson")
	@Produces("application/json")
	public Personne getJSONPerson() {
		return new Personne();
	}
	
	@GET
	@Path("/getXMLPerson")
	@Produces("application/xml")
	public Personne getXMLPerson() {
		return new Personne();
	}
	
	@GET
	@Path("/getJSONOrXMLPerson")
	@Produces({"application/json", "application/xml"})
	public Personne getJSONOrXMLPerson() {
		return new Personne();
	}
	
	@POST
	@Path("/addPerson")
	@Produces("application/json")
	@Transactional
	public Personne addPerson() {
		Personne p = new Personne();
		em.persist(p);	
		return p;
	}
}