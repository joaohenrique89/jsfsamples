package com.portal.ajax;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.event.AjaxBehaviorEvent;

import lombok.Getter;

@ManagedBean
@ViewScoped
public class AjaxSumBean implements Serializable {

	private static final long serialVersionUID = 176371914056247867L;
	
	@Getter
	private int value;
	
	public void add(){
		value++;
	}

}
