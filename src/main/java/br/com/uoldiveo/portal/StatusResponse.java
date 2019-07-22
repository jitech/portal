package br.com.uoldiveo.portal;

public class StatusResponse {

	private String message;

	public StatusResponse(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "HealthResponse [message=" + message + "]";
	}
}