package com.beans;


import java.util.Locale;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;


@RequestScoped
@ManagedBean  
public class ResourseController {

	
	
	public void changeLocale(String msg) {
		
		FacesContext context = FacesContext.getCurrentInstance();
		context.getViewRoot().setLocale(new Locale(msg));
	
		System.out.println("HELOEOEMOK KBKB : L G");
		
	}
	
}
