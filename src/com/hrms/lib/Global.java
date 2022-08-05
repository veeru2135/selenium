package com.hrms.lib;
import org.openqa.selenium.WebDriver;
public class Global {
//To provide TestData&Objects related to whole application
	public   WebDriver driver;
//******TestData
//   DT           VAR    VV
	public String url = "http://183.82.103.245/nareshit";
	public String un  = "nareshit";
	public String pw  = "nareshit";
	public String FN  = "selenium";
	public String LN  = "hephzibah";
//******Objects
	public String txt_loginname = "txtUserName";
	public String txt_password  = "txtPassword";
	public String btn_login     = "Submit";
	public String link_Logout   = "Logout";
	public String frm_empinfo   = "rightMenu";
	public String btn_Add       = "//input[@value='Add']";
	public String txt_EFN       = "txtEmpFirstName";
	public String txt_ELN       ="txtEmpLastName";
	public String btn_Save      ="btnEdit";
}
