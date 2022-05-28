package co.edu.uco.grades.api.controller.response;

import java.util.List;

public class Response<D> {
	
	private List<D> data;
	private List<String> messages;
	
	
	public Response() {
		super();
		setData(data);
		setMessages(messages);
	}
	
	
	
	public Response(List<D> data, List<String> messages) {
		super();
		this.data = data;
		this.messages = messages;
	}



	public List<D> getData() {
		return data;
	}
	public void setData(List<D> data) {
		this.data = data;
	}
	public List<String> getMessages() {
		return messages;
	}
	public void setMessages(List<String> messages) {
		this.messages = messages;
	}

	

}
