package course.application.web.controller;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestClientException;

import course.application.web.pojo.Course;
import course.application.web.pojo.University;
import course.application.web.service.CourseWebApplicationService;

@Controller
public class CourseWebApplicationController {

	@Autowired
	CourseWebApplicationService courseWebApplicationService;
	
	private static final Logger LOGGER = Logger.getLogger(CourseWebApplicationController.class);
	
	@RequestMapping("/addcourse")
    public String addcourse(Model model) {
		try {
			List<University> universities = courseWebApplicationService.getUniversity();
			Course course = new Course();
			model.addAttribute("university", universities);
			model.addAttribute("course", course);
		} catch (RestClientException e) {
			LOGGER.error(e.getStackTrace());
			model.addAttribute("error", e.getStackTrace());
			return "error";
		} catch (MalformedURLException e) {
			LOGGER.error(e.getStackTrace());
			model.addAttribute("error", e.getStackTrace());
			return "error";
		} catch (URISyntaxException e) {
			LOGGER.error(e.getStackTrace());
			model.addAttribute("error", e.getStackTrace());
			return "error";
		}
        return "addcourse";
    }
	
	@RequestMapping("/addstude	nt")
    public String addstudent() {
        return "addstudent";
    }
	
	@RequestMapping(value="/courseregister",method=RequestMethod.POST)
    public String courseregister(@ModelAttribute University university) {
        return "courseregister";
    }
	
	@RequestMapping("/index")
    public String index() {
        return "index";
    }
	
}
