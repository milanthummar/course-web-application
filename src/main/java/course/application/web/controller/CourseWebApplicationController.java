package course.application.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CourseWebApplicationController {

	@RequestMapping("/addcourse")
    public String addcourse() {
        return "addcourse";
    }
	
	@RequestMapping("/addstudent")
    public String addstudent() {
        return "addstudent";
    }
	
	@RequestMapping("/courseregister")
    public String courseregister() {
        return "courseregister";
    }
	
	@RequestMapping("/index")
    public String index() {
        return "index";
    }
	
}
