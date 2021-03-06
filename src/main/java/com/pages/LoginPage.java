package com.pages;

import static ch.lambdaj.Lambda.convert;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import ch.lambdaj.function.convert.Converter;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://172.22.4.88:9090/login")
public class LoginPage extends PageObject {

    @FindBy(id="_58_login")
    private WebElementFacade user_id;

    @FindBy(id="_58_password")
    private WebElementFacade password;
   
    @FindBy(css="[type='submit']")
    private WebElementFacade signInButtom;
    
    @FindBy(css="a[href='http://172.22.4.88:9090/vacation']")
    private WebElementFacade Vacations;

  
  public void signIn() {
	  signInButtom.click();
    }
    
    public void enter_user(String user) {
        user_id.type(user);
    }
    public void enter_password(String user) {
        password.type(user);
    }
    
    public void selectVacation(){
        Vacations.click();
    	
    }
    
    
     }
    
