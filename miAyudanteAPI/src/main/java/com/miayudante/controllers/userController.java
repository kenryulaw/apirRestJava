package com.miayudante.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.miayudante.beans.User;

@RestController
@RequestMapping(value = "/user")
public class userController {

	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody List<User> obtenerUsuario(@RequestParam(value = "user_name") String userName,
            								 	   @RequestParam(value = "user_password") String userPassword){
		
		List<User> listaUsuarios = new ArrayList<User>();
		User user = new User();
		
		user.setName("Ruben");
		user.setLastName("Cedeño");
		
		listaUsuarios.add(user);
		
		return listaUsuarios;
	}
	
	/*@RequestMapping(method = RequestMethod.GET)
	public List<User> getusers() {
		
		List<User> listaUsuarios = new ArrayList<User>();
		User user = new User();
		
		user.setName("Ruben");
		user.setLastName("Cedeño");
		listaUsuarios.add(user);
		
		return listaUsuarios;
	}*/
}
