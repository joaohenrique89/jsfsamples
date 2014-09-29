package com.portal.managedbean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class PrimefacesBean implements Serializable {
	
	private static final long serialVersionUID = -2208232584360585844L;


	private final static String[] models;
	
	
	static {
		models = new String[4];
		models[0] = "HP Laserjet Enterprise CM4540 MFP";
		models[1] = "HP Officejet Pro X476 & X576";
		models[2] = "HP Laserjet Enterprise 500 MFP M525 & M575";
		models[3] = "HP Laserjet 400 M401 & M425";

	}

	public PrimefacesBean() {

	}
	/*
	 * mock for add-printers screens
	 */
	public String[] getModels() {
		return models;
	}
}
