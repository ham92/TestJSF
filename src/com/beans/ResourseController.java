package com.beans;


import java.util.Locale;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;
import javax.xml.bind.ValidationException;


@RequestScoped
@ManagedBean  
public class ResourseController {

	
	
	public void changeLocale(String msg) {
		
		FacesContext context = FacesContext.getCurrentInstance();
		context.getViewRoot().setLocale(new Locale(msg));
	
		System.out.println("HELOEOEMOK KBKB : L G");
		
	}

	
	public void validateUserEmail(FacesContext context , UIComponent uiComponent, Object value) throws ValidationException {
		
		
		
		
		if  (value==null) {
			return ;
			}
		
		
		String emailtext= value.toString();
		
		if (emailtext.indexOf("@")<0){
			
			FacesMessage message = new FacesMessage("invalid email");
			
			throw new ValidatorException(message);
			
		}
		
		
	}
	
	
}
