package com.adidaas.testscripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.adidaas.generic.BaseClass;
import com.adidaas.generic.FileLib;
import com.adidaas.pom.DOAUserAdminstration;
import com.adidaas.pom.DOAUserList;
import com.adidaas.pom.SignInPage;

public class UserModule extends BaseClass {
@Test

	public void testUserModule() throws InterruptedException, IOException  {
		FileLib f = new FileLib();
		String email2 = f.getProperty("email2");
		String password2 = f.getProperty("password2");
		SignInPage sip = new SignInPage(driver);
		sip.getemailtextbox().sendKeys(email2);
		sip.getpasswordtextbox().sendKeys(password2);
		sip.getloginbutton().click();

		DOAUserAdminstration doaa = new DOAUserAdminstration(driver);
		SoftAssert sat1 = new SoftAssert();
		Thread.sleep(1000);
		String searchfield = f.getProperty("searchfield");
		doaa.getsearchfield().sendKeys(searchfield);
		Thread.sleep(1000);
		doaa.getusers().click();
		Thread.sleep(1000);
		doaa.getrolemodelclose().click();
		Thread.sleep(1000);
		doaa.getedit1().click();
		doaa.getnext1().click();
		doaa.getnext2().click();
		String searchbyName = f.getProperty("searchbyName");
		Thread.sleep(1000);
		doaa.getsearchbyName().sendKeys(searchbyName);
		Thread.sleep(1000);
		doaa.getfinishbtnn().click();
		Thread.sleep(2000);
		doaa.getconfirmm().click();
		Thread.sleep(2000);
		doaa.getcancelbtn().click();
		Thread.sleep(1000);
		doaa.getaddlink().click();
		Thread.sleep(1000);
		String rollname = f.getProperty("rollname");
		doaa.getrollname().sendKeys(rollname);
		Thread.sleep(1000);
		String roledescription = f.getProperty("roledescription");
		doaa.getroledescription().sendKeys(roledescription);
		Thread.sleep(1000);
		doaa.getnextbtn1().click();
		doaa.getinstructionvideo().click();
		doaa.getinstructiondocument().click();
		doaa.getmessage().click();
		doaa.getnextbtn().click();
		doaa.getdepartment().click();
		Thread.sleep(1000);
		doaa.getfirstoption().click();
		Thread.sleep(1000);
		doaa.getdesignation().click();
		Thread.sleep(1000);
		doaa.getfirstoption2().click();
		Thread.sleep(2000);
		doaa.getdistrict().click();
		Thread.sleep(1000);
		doaa.getfirstoption3().click();
		Thread.sleep(1000);
		doaa.getfinishbtn().click();
		Thread.sleep(1000);
		doaa.getconfirm().click();
		doaa.getgroupconfig().click();
		Thread.sleep(1000);
		String searchfield1 = f.getProperty("searchfield1");
		doaa.getsearchfield1().sendKeys(searchfield1);
		Thread.sleep(1000);
		doaa.getedit5().click();
		
		String searchbyName5 = f.getProperty("searchbyName5");
		Thread.sleep(1000);
		doaa.getsearchbyName5().sendKeys(searchbyName5);
		Thread.sleep(1000);
		doaa.getsearchbyName5().click();
		Thread.sleep(1000);
		doaa.getnextbtn5().click();
		doaa.getfinishbtn5().click();
		Thread.sleep(1000);
		doaa.getconfirm5().click();
		
		String searchfield2 = f.getProperty("searchfield2");
		doaa.getsearchfield1().sendKeys(searchfield2);
		doaa.getgroupconfig1().click();
		doaa.getadd1().click();
		Thread.sleep(1000);
		String getrecipeint = f.getProperty("recipeint");
		doaa.getrecipeint().sendKeys(getrecipeint);
		Thread.sleep(1000);
		String getgrpdescription = f.getProperty("grpdescription");
		doaa.getgrpdescription().sendKeys(getgrpdescription);
		Thread.sleep(1000);
		
		
		
		doaa.getdepartment1().click();
		doaa.getfirs1toption().click();
		doaa.getdesignation1().click();
		doaa.getfirst2option().click();
		doaa.getdistrict1().click();
		doaa.getfirst3option().click();
		doaa.getstatus().click();
		doaa.getblocks1().click();
		doaa.getfirst4option().click();
		doaa.getPanchayats1().click();
		doaa.getfirst5option().click();
		doaa.getnextbtn2().click();
		doaa.getdepartment6().click();
		doaa.getfirst6option().click();
		doaa.getdesignation7().click();
		doaa.getfirst7option().click();
		doaa.getdistrict8().click();
		doaa.getfirst8option().click();
		doaa.getfinishbtn4().click();
		Thread.sleep(1000);
		doaa.getconfirm2().click();
		Thread.sleep(1000);
		doaa.getdelete().click();
		Thread.sleep(1000);
		doaa.getsure().click();
		Thread.sleep(1000);
		doaa.getsuccess().click();
		doaa.getcsreports().click();
		//doaa.getconsalidated().click();
		//Thread.sleep(8000);
		doaa.getsignout().click();
		driver.close();
		
		
		
		
		sat1.assertAll();
		
	
	
	}
	
	

}
