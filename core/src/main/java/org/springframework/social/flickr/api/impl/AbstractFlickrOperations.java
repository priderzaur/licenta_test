package org.springframework.social.flickr.api.impl;

import java.net.URI;
import org.springframework.social.MissingAuthorizationException;
import org.springframework.social.support.URIBuilder;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

/**
 * @author HemantS
 *
 */
public class AbstractFlickrOperations {

	private final boolean isAuthorized;
	private final String consumerKey;
	
	public AbstractFlickrOperations(boolean isAuthorized){
		this.isAuthorized = isAuthorized;
		this.consumerKey =null;
	}
	public AbstractFlickrOperations(boolean isAuthorized,String consumerKey){
		this.isAuthorized = isAuthorized;
		this.consumerKey = consumerKey;
	}
	
	protected void requireAuthorization() {
		if (!isAuthorized) {
			throw new MissingAuthorizationException();
		}
	}
	
	protected URI buildUri(String methodName) {
		return buildUri(methodName, EMPTY_PARAMETERS);
	}
	
	protected URI buildUri(String methodName, String parameterName, String parameterValue) {
		MultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
		parameters.set(parameterName, parameterValue);
		return buildUri(methodName, parameters);
	}
	
	protected URI buildUri(String methodName, MultiValueMap<String, String> parameters) {
		parameters.set("method", methodName);
		parameters.set("format", "json");
		parameters.set("nojsoncallback", "1");
		if(!isAuthorized){
			parameters.set("api_key", consumerKey);
		}
		
				URI uri 	=	URIBuilder.fromUri(API_URL_BASE).queryParams(parameters).build();
				return uri;
	}
	
	private static final String API_URL_BASE = "https://api.flickr.com/services/rest/";

	private static final LinkedMultiValueMap<String, String> EMPTY_PARAMETERS = new LinkedMultiValueMap<String, String>();
	
}
