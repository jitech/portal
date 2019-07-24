package br.com.uoldiveo.portal;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.uoldiveo.portal.response.TokenResponse;

@Path("/secured")
@RequestScoped
public class TokenManagerResource {

	@GET
	@Path("/token")
	@Produces(MediaType.APPLICATION_JSON)
    public TokenResponse status() {
		return new TokenResponse("TOKEN!");
	}
}
