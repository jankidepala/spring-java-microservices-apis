package io.javabrains.springbeans.hello;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	 @RequestMapping("/")
	    String home() {
	        return "Greetings from XX Spring Boot!";
	    }
	    @RequestMapping("/rix")
	    String trix() {
	        return "YOYO from Spring Boot!";
	    }
	    @RequestMapping("/topics")
	    public List<Hello>getAll() {
	        return Arrays.asList(
	        		new Hello("asdsd", "java", "123"),
	        		new Hello("asdsd", "java", "123")
	        		);
	    }	    	    
	    
}
