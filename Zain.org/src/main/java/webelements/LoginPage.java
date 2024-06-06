package webelements;

import org.openqa.selenium.By;

public interface LoginPage {

	By locateDealerButton = By.xpath("//a[contains(text(),'Locate Dealer')]");
	By resetPasswordButton = By.xpath("//a[contains(text(),'Reset password')]");
	By dropDownOfAccountEmail = By.xpath("//*[@class='ml-auto svg-inline--fa fa-angle-down fa-w-10']");
	By dropDownOfAccountEmailMyGarageLink = By
			.xpath("//a[@class='dropdown-item nuxt-link-exact-active nuxt-link-active']");
	By dropDownOfAccountEmailProfileLink = By.xpath("//a[contains(text(),'Profile')]");
	By dropDownOfAccountEmailSignOutLink = By.xpath("//a[contains(text(),'Sign Out')]");
//titles of link when click.  
	By titleOfMyGarageLinkOpen = By.xpath("//h3");
	By titleOfProfileLinkOpen = By.xpath("//a[contains(text(),'Account')]");

}
