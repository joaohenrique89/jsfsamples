package com.portal.navigation;

import javax.faces.bean.ManagedBean;

import lombok.Getter;
import lombok.Setter;

@ManagedBean
public class NavigationBean  {

	@Setter
	@Getter
	private String param;

	public String navForward() {
		return "nextPage";
	}

	public String navRedirect() {
		return "nextPage?faces-redirect=true";
	}

	public void checkParam() {
		System.out.println("param value is:" + param);
	}
}
