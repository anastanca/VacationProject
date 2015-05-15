package com.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import com.pages.LoginPage;

public class EndUserSteps extends ScenarioSteps {

    LoginPage loginPage;

    @Step
    public void enters_u(String word) {
        loginPage.enter_user(word);
    }
    public void enters_p(String word) {
        loginPage.enter_pass(word);
    }
    @Step
    public void starts_login() {
        loginPage.lookup_terms();
    }
    @Step	
    public void selectVacation(){
    	loginPage.selectVacation();
    }
   
    @Step
    public void is_the_home_page() {
        loginPage.open();
    }
    public void login(String user, String password){
    	enters_u(user);
		enters_p(password);
		starts_login();
    }
   
}