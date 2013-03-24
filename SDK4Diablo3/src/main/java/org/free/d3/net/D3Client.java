package org.free.d3.net;

import java.io.IOException;

import org.free.d3.model.Career;

import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestFactory;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.JsonObjectParser;
import com.google.api.client.json.gson.GsonFactory;
import com.google.gson.Gson;

public class D3Client {

	static final HttpTransport HTTP_TRANSPORT = new NetHttpTransport();
	static final JsonFactory JSON_FACTORY = new GsonFactory();

	public HttpRequest getRequest(GenericUrl url) throws IOException {

		HttpRequestFactory factory = HTTP_TRANSPORT
				.createRequestFactory(new HttpRequestInitializer() {

					public void initialize(HttpRequest request)
							throws IOException {
						request.setParser(new JsonObjectParser(JSON_FACTORY));
					}
				});
		return factory.buildGetRequest(url);
	}

	public Career getCareer(final String tag) throws IOException {
		HttpRequest request = getRequest(new CareerUrl(tag));
		HttpResponse response = request.execute();
		return response.parseAs(Career.class);
	}

	public static final String D3_HOST = "us.battle.net";
	public static final String D3_BASE_URI = "/api/d3/profile";

	public static String getD3URI(String tag) {
		return String.format("http://%s%s/%s/", D3_HOST, D3_BASE_URI,
				tag.replace('#', '-'));
	}

	public class CareerUrl extends GenericUrl {
		// url ::= <host> "/api/d3/profile/" <battletag-name> "-"
		// <battletag-code>
		// "/"
		// Host: us.battle.net
		public CareerUrl(String tag) {
			super(getD3URI(tag));
			System.out.println(getD3URI(tag));
		}
	}

	public class HeroUrl extends GenericUrl {
		public HeroUrl(String tag, int id) {
			super(getD3URI(tag) + "hero/" + id);
		}
	}
	
	public static void main(String[] args) throws IOException {
		System.out.println(new Gson().toJson(new D3Client()
				.getCareer("bellcliff#3663")));
	}
}
