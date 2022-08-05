package com.hrms.testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.General;

public class tc001 {
@Test
public void TC001() {
	//tEST sTEPS
	DOMConfigurator.configure("log4j.xml");
	General obj = new General();
	obj.openApplication();
	obj.login();
	obj.logout();
	obj.closeApplication();
}
}
