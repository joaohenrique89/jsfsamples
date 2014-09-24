package com.portal.managedbean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import lombok.Getter;
import lombok.Setter;

@ManagedBean 
@SessionScoped
public class Content implements Serializable {

	@Setter
	@Getter
	private String hello = "I am working!";
	 
}
