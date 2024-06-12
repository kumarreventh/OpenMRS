package com.openmrs.stepdefination;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.openmrs.base.OpenmrsBase;
import com.openmrs.runner.OpenMrsTestRunner;
import com.pom.SingleTonDesignPattern;
import com.properties.ConfigurationHelper;
import com.properties.ConfigurationReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OpenMrsStepdefination extends OpenmrsBase{
	
	public static WebDriver driver = OpenMrsTestRunner.driver;
	
	SingleTonDesignPattern s = new SingleTonDesignPattern(driver);
	
	static String Patientid;
	
    //login
	
	@Given("I am on the OpenMRS login page")
	public void i_am_on_the_open_mrs_login_page() throws IOException {

		launch(ConfigurationHelper.getInstance().getUrl());
	}
	@When("I enter username and password")
	public void i_enter_username_and_password() throws IOException {
		
		Input(s.login().getUname(), ConfigurationHelper.getInstance().getUserName());
		Input(s.login().getPassword(), ConfigurationHelper.getInstance().getPassword());

	}
	@When("I pick a location and click on Login")
	public void i_pick_a_location_and_click_on_login() {
	 clickElment(s.login().getOutpatientClinic());
	 clickElment(s.login().getLogginButton());
	}
	
	//registerpatient
	
	@Then("I should be redirected to the dashboard page")
	public void i_should_be_redirected_to_the_dashboard_page() {
	   System.out.println();
	}
	@When("I click on Register a patient menu")
	public void i_click_on_register_a_patient_menu() throws IOException {
		screenShot("Dashboard");
		implicit(3000);
	  clickElment(s.regPatient().getRegisterPatient());
	}
	@When("I enter the patient demographics with name, genderand birthdate")
	public void i_enter_the_patient_demographics_with_name_genderand_birthdate() throws IOException {
		Input(s.regPatient().getGivenName(),ConfigurationHelper.getInstance().getGivenName());
		Input(s.regPatient().getFamname(),ConfigurationHelper.getInstance().getFamName());
		clickElment(s.regPatient().getNextButton());
		clickElment(s.regPatient().getMale());
		clickElment(s.regPatient().getNextButton());
		Input(s.regPatient().getBday(),ConfigurationHelper.getInstance().getBday());
		Dropdown(s.regPatient().getSelMonth(),"value","2");
		Input(s.regPatient().getYear(),ConfigurationHelper.getInstance().getYear());
		clickElment(s.regPatient().getNextButton());
	}
	@When("I enter the contact information with address and phone number")
	public void i_enter_the_contact_information_with_address_and_phone_number() throws IOException {
	  Input(s.regPatient().getAdd(), ConfigurationHelper.getInstance().getAdd());
	  Input(s.regPatient().getCity(), ConfigurationHelper.getInstance().getCity());
	  Input(s.regPatient().getState(), ConfigurationHelper.getInstance().getState());
	  Input(s.regPatient().getCountry(), ConfigurationHelper.getInstance().getCountry());
	  Input(s.regPatient().getPostalcode(), ConfigurationHelper.getInstance().getPostalcode());
	  clickElment(s.regPatient().getNextButton());
	  Input(s.regPatient().getPhno(), ConfigurationHelper.getInstance().getPhno());
	  clickElment(s.regPatient().getNextButton());
	  clickElment(s.regPatient().getNextButton());
	}
	@When("I proceed to the confirm page")
	public void i_proceed_to_the_confirm_page() {
		System.out.println();
	 }
	
	
	@Then("the demographics and contact information should be populated correctly")
	public void the_demographics_and_contact_information_should_be_populated_correctly() throws IOException {
	  System.out.println();
	}
	@When("I click on Confirm")
	public void i_click_on_confirm() throws IOException {
		screenShot("Patientdetials");
		clickElment(s.regPatient().getSubmitButton());
	}
	@Then("I should be redirected to the Patient Details page")
	public void i_should_be_redirected_to_the_patient_details_page() {
	  System.out.println();
	}
	@Then("the patient age should be calculated correctly based on the birthdate provided")
	public void the_patient_age_should_be_calculated_correctly_based_on_the_birthdate_provided() {
    System.out.println();
	}
	@When("I click on Start Visit and confirm the visit")
	public void i_click_on_start_visit_and_confirm_the_visit() {
		implicit(3000);
	    clickElment(s.startvisit().getStartVisit());
	    implicit(3000);
	    clickElment(s.startvisit().getConfirmVisitagain());
	}
	@When("I click on Attachment and complete the upload process")
	public void i_click_on_attachment_and_complete_the_upload_process() throws IOException, InterruptedException {
		Thread.sleep(5000);
	   clickElment(s.startvisit().getAttachement());
	 //  clickOnElment(s.startvisit().getDropFile());
	   clickElment(s.startvisit().getCaption());
	   Input(s.startvisit().getCaption(), ConfigurationHelper.getInstance().getCaption());
	   clickElment(s.startvisit().getUploadFile());
	   implicit(3000);
	   clickElment(s.startvisit().getPatientDetails());
	   
	   
	}
	@Then("a success toaster message should appear for the successful attachment")
	public void a_success_toaster_message_should_appear_for_the_successful_attachment() {
	   System.out.println();
	}
	@Then("I should be redirected to the Patient Details screen")
	public void i_should_be_redirected_to_the_patient_details_screen() {
	   System.out.println();
	}
	@Then("the Attachment section should have the uploaded attachment")
	public void the_attachment_section_should_have_the_uploaded_attachment() {
	   System.out.println();
	}
	@Then("the Recent Visit should have one entry for the current date with the Attachment Upload tag")
	public void the_recent_visit_should_have_one_entry_for_the_current_date_with_the_attachment_upload_tag() {
	    System.out.println();
	}
	@When("I click on the End Visit action at the RHS")
	public void i_click_on_the_end_visit_action_at_the_rhs() throws InterruptedException {
		implicit(4000);
		javaScript(s.startvisit().getEndVisit());
		clickElment(s.startvisit().getConfirmEndVisit());
	  
	}
	@When("I start a visit again and click on Capture Vitals menu")
	public void i_start_a_visit_again_and_click_on_capture_vitals_menu() throws InterruptedException {
		Thread.sleep(5000);
	clickElment(s.startvisit().getStartVisitagain());
	clickElment(s.startvisit().getConfirmVisitagain());
	
	//capturevitals
	
	clickElment(s.captrurevitals().getCaptureVitals());
	   
	}
	@When("I enter height and weight")
	public void i_enter_height_and_weight() throws IOException {
		implicit(3000);
		Input(s.captrurevitals().getHeight(), ConfigurationHelper.getInstance().getHeight());
		   clickElment(s.captrurevitals().getNextButton());
		   implicit(3000);
		   Input(s.captrurevitals().getWeight(), ConfigurationHelper.getInstance().getWeight());
		   clickElment(s.captrurevitals().getNextButton());
		   clickElment(s.captrurevitals().getNextButton());
	}
	@Then("the displayed BMI should be calculated correctly using the BMI formula")
	public void the_displayed_bmi_should_be_calculated_correctly_using_the_bmi_formula() {
	    System.out.println();
	}
	@When("I click on Save Form and Save button")
	public void i_click_on_save_form_and_save_button() throws IOException {
		screenShot("Vitalspatientdetials");
		clickElment(s.captrurevitals().getSaveform());
		clickElment(s.captrurevitals().getSubmit()); 
	}
	@When("I click on End Visit and redirect to the Patient Details page")
	public void i_click_on_end_visit_and_redirect_to_the_patient_details_page() throws InterruptedException {
		Thread.sleep(5000);
		javaScript(s.captrurevitals().getEndvisit());
		//clickOnElment(s.captrurevitals().getEndvisit());
		clickElment(s.captrurevitals().getConfrimendvisit());
	   
	}
	@Then("the given height and weight should be displayed correctly along with the calculated BMI")
	public void the_given_height_and_weight_should_be_displayed_correctly_along_with_the_calculated_bmi() {
	   System.out.println();
	}
	@Then("the Recent Visit should have one more new entry for the current date with the Vitals tag")
	public void the_recent_visit_should_have_one_more_new_entry_for_the_current_date_with_the_vitals_tag() {
	    System.out.println();
	}
	@When("I click on Merge Visits, select the two visits and click on Merge Selected Visits button")
	public void i_click_on_merge_visits_select_the_two_visits_and_click_on_merge_selected_visits_button() throws InterruptedException {
		Thread.sleep(5000);
	   clickElment(s.mergevisit().getSelname());
	   clickElment(s.mergevisit().getMergevisit());
	   implicit(3000);
	   javaScript(s.mergevisit().getSelmerge1());
	   javaScript(s.mergevisit().getSelmerge2());
	   clickElment(s.mergevisit().getMergevisits());
	}
	@When("I redirect to the patient details page by clicking on the Return button")
	public void i_redirect_to_the_patient_details_page_by_clicking_on_the_return_button() {
		clickElment(s.mergevisit().getClkreturn());
	  
	}
	@Then("the Recent Visit should have one entry for the current date with the Vitals and Attachment Upload tags")
	public void the_recent_visit_should_have_one_entry_for_the_current_date_with_the_vitals_and_attachment_upload_tags() {
	    System.out.println();
	}
	@When("I click on Add Past Visit and verify the future date is not clickable in the date picker")
	public void i_click_on_add_past_visit_and_verify_the_future_date_is_not_clickable_in_the_date_picker() throws InterruptedException {
		Thread.sleep(5000);
		clickElment(s.mergevisit().getPastvisit());
		Thread.sleep(5000);
		javaScript(s.mergevisit().getSelectdate());
		
		clickElment(s.mergevisit().getCancelpastvisit());
	  
	}
	@When("I redirect to the patient details page")
	public void i_redirect_to_the_patient_details_page() throws IOException {
		screenShot("Patientdetials");
		Patientid = getText(s.deletepatient().getPatientId());
	  
	}
	@When("I click on Delete Patient and provide the reason")
	public void i_click_on_delete_patient_and_provide_the_reason() throws IOException {
		implicit(3000);
		clickElment(s.deletepatient().getDeletePatient());
		Input(s.deletepatient().getDeleteReason(),ConfigurationHelper.getInstance().getDeleteReason());
	}
	@When("I click on confirm button")
	public void i_click_on_confirm_button() {
		clickElment(s.deletepatient().getConfirmDeletePatient());
	    
	}
	@Then("a success toaster message should appear")
	public void a_success_toaster_message_should_appear() {
	  System.out.println();
	}
	@Then("I should be redirected to the Find Patient Record menu")
	public void i_should_be_redirected_to_the_find_patient_record_menu() {
		implicit(5000);
		Input(s.deletepatient().getSearchpatientID(),Patientid);
		
	  
	}
	@Then("the deleted patient should not be listed in the table using search options")
	public void the_deleted_patient_should_not_be_listed_in_the_table_using_search_options() {
	System.out.println();    
	}




}
