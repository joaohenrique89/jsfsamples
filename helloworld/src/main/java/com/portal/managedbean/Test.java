package com.portal.managedbean;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import lombok.Data;

@Named
@RequestScoped
@Data
public class Test implements Serializable {

	private String test = "CDI loaded.";
	
//	@Inject
//	private User user;
//	
//	@Inject
//	private UserDAO userD;
	
	public void save(){
//		userD.save(user);
	}
}
