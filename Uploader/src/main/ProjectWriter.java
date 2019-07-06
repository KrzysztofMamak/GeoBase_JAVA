package main;

import java.util.List;

import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;

import com.google.gson.Gson;

public abstract class ProjectWriter {
	public static void sendProjects(List<Project> projects) {
		Gson gson = new Gson();
		String jsonString = gson.toJson(projects.toArray());
		
		CloseableHttpClient httpClient = HttpClientBuilder.create().build();
		HttpPost request = new HttpPost(".../projects/load/projects");
		try {
			StringEntity params = new StringEntity(jsonString);
			request.addHeader("Content-type", "application/json");
			request.setEntity(params);
			httpClient.execute(request);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
