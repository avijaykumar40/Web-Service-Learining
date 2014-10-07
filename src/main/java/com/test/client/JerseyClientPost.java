package com.test.client;


import com.google.gson.Gson;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.test.to.Track;

public class JerseyClientPost {

	public static void main(String[] args) {

		try {

			Client client = Client.create();
			Track tk = new Track();
			tk.setTitle("Fade To Black");
			tk.setSinger("Metallica");
			
			
			WebResource webResource = client
					.resource("http://localhost:8080/serviceTest/rest/helloworld/post/");

//			String input = "{\"singer\":\"Metallica\",\"title\":\"Fade To Black\"}";
			System.out.println("sssssssssssss"+new Gson().toJson(tk));
			ClientResponse response = webResource.type("application/json")
					.post(ClientResponse.class, new Gson().toJson(tk));

			if (response.getStatus() != 201) {
				throw new RuntimeException("Failed : HTTP error code : "
						+ response.getStatus());
			}

			System.out.println("Output from Server .... \n");
			String output = response.getEntity(String.class);
			System.out.println(output);

		} catch (Exception e) {

			e.printStackTrace();

		}

	}

}
