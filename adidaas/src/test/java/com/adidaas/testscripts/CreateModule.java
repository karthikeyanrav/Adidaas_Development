package com.adidaas.testscripts;

import java.io.IOException;
import java.security.spec.MGF1ParameterSpec;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.adidaas.generic.BaseClass;
import com.adidaas.generic.FileLib;
import com.adidaas.pom.DOAUserAdminstration;
import com.adidaas.pom.DOAUserList;
import com.adidaas.pom.SignInPage;


public class CreateModule extends BaseClass {
	
	@Test
	public void testCreateCustomer() throws InterruptedException, IOException {
		
		FileLib f = new FileLib();
		String email1 = f.getProperty("email1");
		String password1 = f.getProperty("password1");
		SignInPage sip = new SignInPage(driver);
		sip.getemailtextbox().sendKeys(email1);
		sip.getpasswordtextbox().sendKeys(password1);
		sip.getloginbutton().click();
		
		
		
		DOAUserList doa = new DOAUserList(driver);
		SoftAssert sat = new SoftAssert();
		Thread.sleep(1000);
		doa.getadvancesearch().click();
		Thread.sleep(1000);
		String firstname = f.getProperty("firstname");
		Thread.sleep(1000);
		doa.getfirstname().sendKeys(firstname);
		Thread.sleep(1000);
		String lastname = f.getProperty("lastname");
		Thread.sleep(1000);
		doa.getlastname().sendKeys(lastname);
		Thread.sleep(1000);
		doa.getselectdesign().click();
		Thread.sleep(1000);
		doa.getfirstoption().click();
		Thread.sleep(1000);
		doa.getselectdesign2().click();
		Thread.sleep(1000);
		doa.getfirstoption2().click();
		Thread.sleep(1000);
		doa.getselectdesign3().click();
		Thread.sleep(1000);
		//doa.getfirstoption3().click();
		Thread.sleep(1000);
		doa.getselectdesign4().click();
		Thread.sleep(1000);
		doa.getfirstoption4().click();
		Thread.sleep(1000);
		doa.getselectdesign5().click();
		Thread.sleep(1000);
		doa.getfirstoption5().click();
		Thread.sleep(1000);
		doa.getradiobtn().click();
		Thread.sleep(1000);
		String startdate = f.getProperty("startdate");
		Thread.sleep(1000);
		doa.getdatepicker1().sendKeys(startdate);
		Thread.sleep(1000);
		String enddate = f.getProperty("enddate");
		Thread.sleep(1000);
		doa.getdatepicker2().sendKeys(enddate);
		Thread.sleep(1000);
		doa.getadvbtn().click();
		Thread.sleep(2000);
		doa.getreviwe().click();
		Thread.sleep(2000);
		doa.getedit().click();
		Thread.sleep(2000);
		//doa.getpanchayatlevel().click();
		//Thread.sleep(2000);
		doa.getemailverified().click();
		Thread.sleep(1000);
		String comments = f.getProperty("comments");
		doa.getcomments().sendKeys(comments);
		Thread.sleep(1000);
		doa.getsubmit().click();
		Thread.sleep(2000);
		doa.getconfirm3().click();
		Thread.sleep(2000);
		doa.getview().click();
		Thread.sleep(2000);
		doa.getbacktolist1().click();
		Thread.sleep(1000);
		doa.getreview1().click();
		doa.getview1().click();
		doa.getemailverified().click();
		doa.getcomments().sendKeys("comments");
		doa.getcancel2().click();
		
		doa.getview2().click();
		doa.getemailverified().click();
		doa.getcomments().sendKeys("comments");
		//doa.getapprove2().click();
		

		doa.getreviwed().click();
		Thread.sleep(4000);
		String searchfield3 = f.getProperty("searchfield3");
		doa.getsearchfield3().sendKeys(searchfield3);
		Thread.sleep(2000);
		doa.getaction1().click();
		Thread.sleep(4000);
		doa.getreviwed1().click();
		Thread.sleep(2000);
		doa.getstatusbtn().click();
		Thread.sleep(2000);
		doa.getselectall().click();
		Thread.sleep(2000);
		doa.getstatusbtn2().click();
		Thread.sleep(2000);
		doa.getapproved().click();
		Thread.sleep(2000);
		doa.getnexticon().click();
		Thread.sleep(2000);
		doa.getnexticon().click();
		Thread.sleep(2000);
		doa.getstatusbtn3().click();
		Thread.sleep(2000);
		doa.getrejected().click();
		doa.getaction().click();
		doa.getbacktolist().click();
		//doa.getexportdwn().click();
		Thread.sleep(2000);
		doa.getlogout().click();
		//driver.close();
		sat.assertAll();
				
	}

}
