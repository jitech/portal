package br.com.uoldiveo.portal;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

public interface StatusResource {

	@GET
	@Path("/status")
	@Produces(MediaType.APPLICATION_JSON)
    public StatusResponse status();
}