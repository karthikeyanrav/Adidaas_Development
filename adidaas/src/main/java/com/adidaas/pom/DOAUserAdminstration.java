package com.adidaas.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DOAUserAdminstration {

	
	@FindBy(xpath = "//input[@id='searchFieldRole']")
	private WebElement searchfield;
	public WebElement getsearchfield() {
		return searchfield;
	}
	
	@FindBy(xpath = "(//a[.='1 Users'])[1]")
	private WebElement users;
	public WebElement getusers() {
		return users;
	}
	
	@FindBy(xpath = "//button[@id='userrolemodalclose']")
	private WebElement rolemodelclose;
	public WebElement getrolemodelclose() {
		return rolemodelclose;
	}
	
	@FindBy(xpath = "(//img[contains(@src,'edit')])[2]")
	private WebElement edit1;
	public WebElement getedit1() {
		return edit1;
	}
	
	@FindBy(xpath = "(//input[@class='form-control'])[3]")
	private WebElement next1;
	public WebElement getnext1() {
		return next1;
	}
	
	@FindBy(xpath = "(//input[@class='form-control'])[7]")
	private WebElement next2;
	public WebElement getnext2() {
		return next2;
	}
	
	@FindBy(xpath = "//input[@id='searchbyName']")
	private WebElement searchbyName;
	public WebElement getsearchbyName() {
		return searchbyName;
	}

	
	
	@FindBy(xpath = "(//button[@id='FinishBtn'])")
	private WebElement finishbtnn;
	public WebElement getfinishbtnn() {
		return finishbtnn;
	}
	
	@FindBy(xpath = "//button[@class='swal-button swal-button--confirm']")
	private WebElement confirmm;
	public WebElement getconfirmm() {
		return confirmm;
	}
	
	@FindBy(xpath = "(//button[@class='form-control'])[2]")
	private WebElement cancelbtn;
	public WebElement getcancelbtn() {
		return cancelbtn;
	}
	
	
	
	
	
	
	
	
	
	@FindBy(xpath = "//span[.=' + Add']")
	private WebElement addlink;
	public WebElement getaddlink() {
		return addlink;
	}
	
	@FindBy(xpath = "//input[@id='RoleName']")
	private WebElement rollname;
	public WebElement getrollname() {
		return rollname;
	}
	
	@FindBy(xpath = "//textarea[@id='RoleDescription']")
	private WebElement roledescription;
	public WebElement getroledescription() {
		return roledescription;
	}
	
	@FindBy(xpath = "(//input[@name='nextBtn'])[1]")
	private WebElement nextbtn1;
	public WebElement getnextbtn1() {
		return nextbtn1;
	}
	
	@FindBy(xpath = "(//input[@id='permissionCheckBox'])[1]")
	private WebElement instructionvideo;
	public WebElement getinstructionvideo() {
		return instructionvideo;
	}
	
	@FindBy(xpath = "(//input[@id='permissionCheckBox'])[3]")
	private WebElement instructiondocument;
	public WebElement getinstructiondocument() {
		return instructiondocument;
	}
	
	@FindBy(xpath = "(//input[@id='permissionCheckBox'])[5]")
	private WebElement message;
	public WebElement getmessage() {
		return message;
	}
	
	@FindBy(xpath = "(//input[@name='nextBtn'])[2]")
	private WebElement nextbtn;
	public WebElement getnextbtn() {
		return nextbtn;
	}
	
	@FindBy(xpath = "(//div[@class='filter-option-inner-inner'])[1]")
	public WebElement department;
	public WebElement getdepartment() {
		return department;	
	}
	
	@FindBy(xpath = "//span[.='Agriculture']")
	private WebElement firstoptin;
	public WebElement getfirstoption() {
		return firstoptin;
	}
	
	@FindBy(xpath = "(//div[@class='filter-option-inner-inner'])[2]")
	public WebElement designation;
	public WebElement getdesignation() {
		return designation;	
	}
	
	@FindBy(xpath = "//span[.='Assistant Agriculture Officer']")
	private WebElement firstoptin2;
	public WebElement getfirstoption2() {
		return firstoptin2;
	}
	
	@FindBy(xpath = "(//div[@class='filter-option-inner-inner'])[3]")
	public WebElement district;
	public WebElement getdistrict() {
		return district;	
	}
	
	@FindBy(xpath = "(//span[.='AURANGABAD'])[1]")
	private WebElement firstoptin3;
	public WebElement getfirstoption3() {
		return firstoptin3;
	}
	
	@FindBy(xpath = "//button[@id='FinishBtn']")
	private WebElement finishbtn;
	public WebElement getfinishbtn() {
		return finishbtn;
	}
	
	
	@FindBy(xpath = "//div[@class='swal-button-container']")
	private WebElement confirm;
	public WebElement getconfirm() {
		return confirm;
	}
	
	@FindBy(xpath = "//span[.='Group Configuration']")
	private WebElement groupconfig;
	public WebElement getgroupconfig() {
		return groupconfig;
	}
	
	@FindBy(xpath = "//input[@id='searchField']")
	private WebElement searchfield1;
	public WebElement getsearchfield1() {
		return searchfield1;
	}
	
	@FindBy(xpath = "//img[contains(@src,'edit')]")
	private WebElement edit5;
	public WebElement getedit5() {
		return edit5;
	}
	
	@FindBy(xpath = "//input[@id='searchbyName']")
	private WebElement searchbyName5;
	public WebElement getsearchbyName5() {
		return searchbyName5;
	}
	
	@FindBy(xpath = "(//button[@name='nextBtn'])[1]")
	private WebElement nextbtn5;
	public WebElement getnextbtn5() {
		return nextbtn5;
	}
	
	@FindBy(xpath = "//button[@id='FinishBtn']")
	private WebElement finishbtn5;
	public WebElement getfinishbtn5() {
		return finishbtn5;
	}
	
	@FindBy(xpath = "//button[@class='swal-button swal-button--confirm']")
	private WebElement confirm5;
	public WebElement getconfirm5() {
		return confirm5;
	}
	
	
	
	
	
	@FindBy(xpath = "//span[.='Group Configuration']")
	private WebElement groupconfig1;
	public WebElement getgroupconfig1() {
		return groupconfig1;
	}
	
	@FindBy(xpath = "//span[.=' + Add']")
	private WebElement add1;
	public WebElement getadd1() {
		return add1;
	}
	
	@FindBy(xpath = "//input[@id='recipeintGroupData_RecipientGroupName']")
	private WebElement recipeint;
	public WebElement getrecipeint() {
		return recipeint;
	}
	
	@FindBy(xpath = "//textarea[@id='recipeintGroupData_RecipientGroupDescription']")
	private WebElement grpdescription;
	public WebElement getgrpdescription() {
		return grpdescription;
	}
	
	
	@FindBy(xpath = "(//div[@class='filter-option-inner-inner'])[1]")
	public WebElement department1;
	public WebElement getdepartment1() {
		return department1;	
	}
	
	@FindBy(xpath = "//span[.='Agriculture']")
	private WebElement first1optin;
	public WebElement getfirs1toption() {
		return first1optin;
	}
	
	@FindBy(xpath = "(//div[@class='filter-option-inner-inner'])[2]")
	public WebElement designation1;
	public WebElement getdesignation1() {
		return designation1;	
	}
	
	@FindBy(xpath = "//span[.='Assistant Agriculture Officer']")
	private WebElement first2optin;
	public WebElement getfirst2option() {
		return first2optin;
	}
	
	@FindBy(xpath = "(//div[@class='filter-option-inner-inner'])[3]")
	public WebElement district1;
	public WebElement getdistrict1() {
		return district1;	
	}
	
	@FindBy(xpath = "(//span[.='AURANGABAD'])[1]")
	private WebElement first3optin;
	public WebElement getfirst3option() {
		return first3optin;
	}
	
	@FindBy(xpath = "//label[.=' Status ']")
	private WebElement status;
	public WebElement getstatus() {
		return status;
	}
	
	@FindBy(xpath = "(//div[@class='filter-option-inner-inner'])[4]")
	public WebElement blocks1;
	public WebElement getblocks1() {
		return blocks1;	
	}
	
	@FindBy(xpath = "(//span[.='AURANGABAD'])[3]")
	private WebElement first4optin;
	public WebElement getfirst4option() {
		return first4optin;
	}
	
	@FindBy(xpath = "(//div[@class='filter-option-inner-inner'])[5]")
	public WebElement Panchayats1;
	public WebElement getPanchayats1() {
		return Panchayats1;	
	}
	
	@FindBy(xpath = "//span[.='AURANGABAD (NAGAR PARISHAD)']")
	private WebElement first5optin;
	public WebElement getfirst5option() {
		return first5optin;
	}
	
	@FindBy(xpath = "//button[@id='NextBtn']")
	private WebElement nextbtn2;
	public WebElement getnextbtn2() {
		return nextbtn2;
	}
	
	@FindBy(xpath = "(//div[@class='filter-option-inner-inner'])[6]")
	public WebElement department6;
	public WebElement getdepartment6() {
		return department6;	
	}
	
	@FindBy(xpath = "(//span[.='Agriculture'])[2]")
	private WebElement first6option;
	public WebElement getfirst6option() {
		return first6option;
	}
	
	@FindBy(xpath = "(//div[@class='filter-option-inner-inner'])[7]")
	public WebElement designation7;
	public WebElement getdesignation7() {
		return designation7;	
	}
	
	@FindBy(xpath = "(//span[.='Assistant Agriculture Officer'])[2]")
	private WebElement first7option;
	public WebElement getfirst7option() {
		return first7option;
	}
	
	@FindBy(xpath = "(//div[@class='filter-option-inner-inner'])[8]")
	public WebElement district8;
	public WebElement getdistrict8() {
		return district8;	
	}
	
	@FindBy(xpath = "(//span[.='AURANGABAD'])[5]")
	private WebElement first8option;
	public WebElement getfirst8option() {
		return first8option;
	}
	
	@FindBy(xpath = "//button[@id='FinishBtn']")
	private WebElement finishbtn4;
	public WebElement getfinishbtn4() {
		return finishbtn4;
	}
	
	
	@FindBy(xpath = "//div[@class='swal-button-container']")
	private WebElement confirm2;
	public WebElement getconfirm2() {
		return confirm2;
	}
	
	@FindBy(xpath = "(//img[contains(@src,'delete-icon')])[6]")
	private WebElement delete;
	public WebElement getdelete() {
		return delete;
	}
	
	@FindBy(xpath = "//button[@class='swal-button swal-button--confirm swal-button--danger']")
	private WebElement sure;
	public WebElement getsure() {
		return sure;
	}
	
	@FindBy(xpath = "//button[@class='swal-button swal-button--confirm']")
	private WebElement success;
	public WebElement getsuccess() {
		return success;
	}
	
	@FindBy(xpath = "//span[.='CS Reports']")
	private WebElement csreports;
	public WebElement getcsreports() {
		return csreports;
	}
	
	@FindBy(xpath = "(//u[.='Click to download'])[1]")
	private WebElement consalidated;
	public WebElement getconsalidated() {
		return consalidated;
	}
	
	@FindBy(xpath = "//a[contains(text(),'Signout')]")
	private WebElement signout;
	public WebElement getsignout() {
		return signout;
	}

	
	
	
	


	public DOAUserAdminstration(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	
	

}
