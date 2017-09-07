package com.hlengi.cos731.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author hjita
 */
@RestController
public class UsersController 
{
        @Autowired
        UserRepository repository;
        
        @RequestMapping("/save")
	public String process(){
		repository.save(new User("Administrator2@bellisimo.co.za", "abcd"));
		repository.save(new User("Administrator1@bellisimo.co.za", "1234"));
		return "Done";
	}
        
        @RequestMapping("/findall")
	public String findAll(){
		String result = "<html>";
		
		for(User userobj : repository.findAll()){
			result += "<div>" + userobj.toString() + "</div>";
		}
		
		return result + "</html>";
	}
	
	@RequestMapping("/findbyid")
	public String findById(@RequestParam("id") long id){
		String result = "";
		result = repository.findOne(id).toString();
		return result;
	}
	
	@RequestMapping("/findbyemail")
	public String fetchDataByEmail(@RequestParam("email") String email){
		String result = "<html>";
		
		for(User userobj: repository.findByEmail(email))
                {
			result += "<div>" + userobj.toString() + "</div>"; 
		}
		
		return result + "</html>";
	}
}
