package com.adidaas.pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.adidaas.generic.BaseClass;


public class DOAUserList {
	
	@FindBy(xpath = "//span[.='Advance Search']")
	private WebElement advancesearch;	
	public WebElement getadvancesearch() {
		return advancesearch;
	}

	@FindBy(xpath = "//input[@id='firstName']")
	private WebElement firstname;	
	public WebElement getfirstname() {
		return firstname;
	}

	@FindBy(xpath = "//input[@id='lastName']")
	private WebElement lastname;
	public WebElement getlastname() {
		return lastname;
	}
	
	@FindBy(xpath = "(//div[@class='filter-option-inner-inner'])[1]")
	private WebElement selectdesign;
	public WebElement getselectdesign() {
		return selectdesign;
	
	}
	
	@FindBy(xpath = "//span[.='Agriculture']")
	private WebElement firstoption;
	public WebElement getfirstoption() {
		return firstoption;
	}
	
	@FindBy(xpath = "(//div[@class='filter-option-inner-inner'])[2]")
	private WebElement selectdesign2;
	public WebElement getselectdesign2() {
		return selectdesign2;
	}
	
	@FindBy(xpath = "//span[.='Agriculture Coordinator']")
	private WebElement firstoption2;
	public WebElement getfirstoption2() {
		return firstoption2;
	}
	
	@FindBy(xpath = "(//div[@class='filter-option-inner-inner'])[3]")
	private WebElement selectdesign3;
	public WebElement getselectdesign3() {
		return selectdesign3;
	}
	
	@FindBy(xpath = "//span[.='AURANGABAD']")
	private WebElement firstoption3;
	public  WebElement getfirstoption3() {
		return firstoption3;
	}
	
	@FindBy(xpath = "(//div[@class='filter-option-inner-inner'])[4]")
	private WebElement selectdesign4;
	public WebElement getselectdesign4() {
		return selectdesign4;
	}
	
	@FindBy(xpath = "//span[.='KURSAKANTA']")
	private WebElement firstoption4;
	public  WebElement getfirstoption4() {
		return firstoption4;
	}
	
	@FindBy(xpath = "(//div[@class='filter-option-inner-inner'])[5]")
	private WebElement selectdesign5;
	public WebElement getselectdesign5() {
		return selectdesign5;
	}
	
	@FindBy(xpath = "//span[.='HARIRA']")
	private WebElement firstoption5;
	public  WebElement getfirstoption5() {
		return firstoption5;
	}
	
	@FindBy(xpath = "//input[@id='Gender'][1]")
	private WebElement radiobtn;
	public WebElement getradiobtn() {
		return radiobtn;
	}
	
	@FindBy(xpath = "//span[@id='calendar1']")
	private WebElement calender1;
	public WebElement getcalender1() {
		return calender1;
	}
	
	@FindBy(xpath = "//input[@id='datePicker1']")
	private WebElement datepicker1;
	public WebElement getdatepicker1() {
		return datepicker1;
	}
	
	@FindBy(xpath = "//input[@id='datePicker2']")
	private WebElement datepicker2;
	public WebElement getdatepicker2() {
		return datepicker2;
	}
	
	@FindBy(xpath = "//button[.='Apply']")
	private WebElement advbtn;
	public WebElement getadvbtn() {
		return advbtn;
	}
	
	@FindBy(xpath = "//span[.='User List - Pending']")
	private WebElement reviwe;
	public WebElement getreviwe() {
		return reviwe;
	}
	
	/**@FindBy(xpath = "//input[@id='searchField']")
	private WebElement searchfield3;
	public WebElement getsearchfield3() {
		return searchfield3;
	}**/
	
	@FindBy(xpath = "(//img[contains(@src,'Icons')])[12]")
	private WebElement edit;
	public WebElement getedit() {
		return edit;
	}
	
	@FindBy(xpath = "//input[@id='PanchayatLevel']")
	private WebElement panchayatlevel;
	public WebElement getpanchayatlevel() {
		return panchayatlevel;
	}
	
	@FindBy(xpath = "//input[@id='emailVerified']")
	private WebElement emailverified;
	public WebElement getemailverified() {
		return emailverified;
	}
	
	@FindBy(xpath = "//textarea[@id='Comments']")
	private WebElement comments;
	public WebElement getcomments() {
		return comments;
	}
	
	@FindBy(xpath = "(//input[@type='submit'])[1]")
	private WebElement submit;
	public WebElement getsubmit() {
		return submit;
	}
	
	@FindBy(xpath = "//button[@class='swal-button swal-button--confirm']")
	private WebElement confirm3;
	public WebElement getconfirm3() {
		return confirm3;
	}
	
	@FindBy(xpath = "(//img[contains(@src,'Icons')])[5]")//xpath
	private WebElement edit1;
	public WebElement getedit1() {
		return edit1;
	}
	
	@FindBy(xpath = "(//input[@type='submit'])[1]")
	private WebElement cancel;
	public WebElement getcancel() {
		return cancel;
	}
	
	@FindBy(xpath = "(//img[contains(@src,'Icons')])[13]")
	private WebElement view;
	public WebElement getview() {
		return view;
	}
	
	@FindBy(xpath = "//span[.='Back To List']")
	private WebElement backtolist1;
	public WebElement getbacktolist1() {
		return backtolist1;
	}
	
	@FindBy(xpath = "//span[.='User List - Pending']")
	private WebElement review1;
	public WebElement getreview1() {
		return review1;
	}
	
	@FindBy(xpath = "(//img[contains(@src,'Icons')])[8]")//karthik xp
	private WebElement view1;
	public WebElement getview1() {
		return view1;
	}
	
	@FindBy(xpath = "(//img[contains(@src,'Icons')])[6]")//venu xp
	private WebElement view2;
	public WebElement getview2() {
		return view2;
	}
	
	@FindBy(xpath = "//button[@class='btn buttons']")
	private WebElement cancel2;
	public WebElement getcancel2() {
		return cancel2;
	}
	
	@FindBy(xpath = "(//input[@class='btn buttons'])[2]")
	private WebElement approve2;
	public WebElement getapprove2() {
		return approve2;
	}
	
	
	

	@FindBy(xpath = "//span[.='User List - Reviewed']")
	private WebElement reviwed;
	public WebElement getreviwed() {
		return reviwed;
	}
	
	@FindBy(xpath = "//input[@id='searchField']")
	private WebElement searchfield3;
	public WebElement getsearchfield3() {
		return searchfield3;
	}
	
	@FindBy(xpath = "//span[@class='slider round']")
	private WebElement action1;
	public WebElement getaction1() {
		return action1;
	}
	
	@FindBy(xpath = "//span[.='User List - Reviewed']")
	private WebElement reviwed1;
	public WebElement getreviwed1() {
		return reviwed1;
	}
	
	@FindBy(xpath = "//button[@class='btn dropdown-toggle btn-light']")
	private WebElement statusbtn;
	public WebElement getstatusbtn() {
		return statusbtn;
	}
	
	@FindBy(xpath = "(//span[@class='text'])[1]")
	private WebElement selectall;
	public WebElement getselectall() {
		return selectall;
	}
	
	@FindBy(xpath = "//button[@class='btn dropdown-toggle btn-light']")
	private WebElement statusbtn2;
	public WebElement getstatusbtn2() {
		return statusbtn2;
	}
	
	@FindBy(xpath = "(//span[.='Approved'])[1]")
	private WebElement approved;
	public WebElement getapproved() {
		return approved;
	}
	
	@FindBy(xpath = "//span[@class='ag-icon ag-icon-next']")
	private WebElement nexticon;
	public WebElement getnexticon() {
		return nexticon;
	}
	
	@FindBy(xpath = "//button[@class='btn dropdown-toggle btn-light']")
	private WebElement statusbtn3;
	public WebElement getstatusbtn3() {
		return statusbtn3;
	}
	
	@FindBy(xpath = "(//span[.='Rejected'])[1]")
	private WebElement rejected;
	public WebElement getrejected() {
		return rejected;
	}
	
	

	
	
	@FindBy(xpath = "(//img[contains(@src,'Icons')])[6]")//karthik xp
	private WebElement action;
	public WebElement getaction() {
		return action;
	}
	
	@FindBy(xpath = "//span[.='Back To List']")
	private WebElement bacttolist;
	public WebElement getbacktolist() {
		return bacttolist;
	}
	
	@FindBy(xpath = "(//img[contains(@src,'Icons')])[5]")
	private WebElement exportdwn;
	public WebElement getexportdwn() {
		return exportdwn;
	}
	
	@FindBy(xpath = "//span[contains(.,'Signout')]")
	private WebElement logout;
	public WebElement getlogout() {
		return logout;
	}

	public DOAUserList(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}

