package in.ashokit.rest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping
public class GreetRestController {
	
String s = "hi";
	@Autowired 
	private Environment env;
	
	
	@GetMapping("/greet/")  
	public String getGreetMsg() {
		
		
	// to get the port number of the server
		String port = env.getProperty("server.port");
		
		// returning with port number (in which server greet api got executed, port num will give me)
		return "Good Evening ("+ port +")";
	}

}
