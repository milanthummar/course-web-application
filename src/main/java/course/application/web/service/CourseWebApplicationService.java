package course.application.web.service;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import course.application.web.pojo.University;

@Service
public class CourseWebApplicationService {

	@Autowired
	RestTemplate restTemplate;
	
	public List<University> getUniversity() throws MalformedURLException, RestClientException, URISyntaxException{
		
		URL restURL = new URL("https://course-application-service.cfapps.io/courseapplication/getUniversity");
		
		University[] university = restTemplate.getForObject(restURL.toURI(), University[].class);
		
		return Arrays.asList(university);
		
	}
	
	
}
