package com.beans;


import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class SelectOneView {
     
    private String option;
     
    public String getOption() {
        return option;
    }
 
    public void setOption(String option) {
        this.option = option;
    }
}