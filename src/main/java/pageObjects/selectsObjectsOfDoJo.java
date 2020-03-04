package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class selectsObjectsOfDoJo {
	
	WebDriver driver;
	//created a constructor 
	public selectsObjectsOfDoJo (WebDriver driver) 
	{
		this.driver=driver;
		//Initializing FindBy annotations
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(css="#docs_MiniGlass_6 > a:nth-child(1) > span:nth-child(1)")
	WebElement runButton;
	
	@FindBy(css="#tabContainer_tablist_dijit_layout_ContentPane_4")
	WebElement tab3;
	
	@FindBy(css="#tabContainer_tablist_dijit_layout_TabContainer_1")
	WebElement tab2;
	
	@FindBy(css="#tabContainer_tablist_dijit_layout_TabContainer_0")
	WebElement tab1;
	
	@FindBy(css="#dijit_layout_TabContainer_1_tablist_dijit_layout_ContentPane_3")
	WebElement my4thinnerTab;
	
	@FindBy(css="#dijit_layout_TabContainer_0_tablist_dijit_layout_ContentPane_1")
	WebElement my2ndinnerTab;
	
	@FindBy(css="#dijit_layout_TabContainer_1_tablist_dijit_layout_ContentPane_2")
	WebElement my3rdinnerTab;
	
	
	@FindBy(css="#dijit_layout_ContentPane_3")
	WebElement my4thinnerText ;
	
	@FindBy(css="#dijit_layout_ContentPane_1")
	WebElement my2ndinnerText ;
	
	@FindBy(css="#dijit_layout_ContentPane_2")
	WebElement my3rdinnerText ;
	
	@FindBy(css="#dijit_layout_ContentPane_4")
	WebElement tab2Text ;
	
	@FindBy(css="#dijit_layout_ContentPane_0")
	WebElement tab1Text ;
	
	
	public WebElement runButton()
	{
		return runButton;
	}
	public WebElement tab2()
	{
		return tab2;
	}
	public WebElement tab1()
	{
		return tab1;
	}
	public WebElement tab3()
	{
		return tab3;
	}
	public WebElement my4thInnerTab()
	{
		return my4thinnerTab;
	}
	public WebElement my2ndInnerTab()
	{
		return my2ndinnerTab;
	}
	public WebElement my3rdInnerTab()
	{
		return my3rdinnerTab;
	}
	public WebElement my4thInnerText()
	{
		return my4thinnerText;
	}
	public WebElement my2ndInnerText()
	{
		return my2ndinnerText;
	}
	public WebElement my3rdInnerText()
	{
		return my3rdinnerText;
	}
	public WebElement tab2Text()
	{
		return tab2Text;
	}
	public WebElement tab1Text()
	{
		return tab1Text;
	}
}
