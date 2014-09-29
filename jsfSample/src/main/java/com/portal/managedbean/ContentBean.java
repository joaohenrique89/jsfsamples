package com.portal.managedbean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import lombok.Getter;
import lombok.Setter;

@ManagedBean
@RequestScoped
public class ContentBean implements Serializable {

	private static final long serialVersionUID = 2887839753461911631L;

	@Setter
	@Getter
	private String hello = "I am working!";

}
