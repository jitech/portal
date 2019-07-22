package br.com.uoldiveo.portal;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.Path;

@Path("/secured")
@RequestScoped
public class TokenResource implements StatusResource{

	public StatusResponse status() {
		return new StatusResponse("I'm working!");
	}
	
	public static void main(String[] args) {
		System.out.println("Hello!!!");
	}
}