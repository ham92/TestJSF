package com.beans;

import java.util.ArrayList;
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
	ArrayList<Users> userList = new ArrayList<Users>();
	String lang;

	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	public void changeLocale() {

		FacesContext context = FacesContext.getCurrentInstance();
		context.getViewRoot().setLocale(new Locale(lang));

		System.out.println("HELOEOEMOK KBKB : L G");

	}

	public void validateUserEmail(FacesContext context, UIComponent uiComponent, Object value) throws ValidationException {

		if (value == null) {
			return;
		}

		String emailtext = value.toString();

		if (emailtext.indexOf("@") < 0) {

			FacesMessage message = new FacesMessage("invalid email");

			throw new ValidatorException(message);

		}

	}

	private void createusers() {

		Users user1 = new Users("hamzah", "mubaslat", "h@gmail.com", "hamzah", "123");
		Users user2 = new Users("moh", "attallah", "m@gmail.com", "moh", "123");

		userList.add(user1);
		userList.add(user2);
	}

	private void login() {

	}

}
