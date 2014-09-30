package com.portal.helloworld;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import lombok.Getter;
import lombok.Setter;

@ManagedBean
@RequestScoped
public class SimpleSampleBean {

	@Setter
	@Getter
	private String hello = "I am working!";

}
