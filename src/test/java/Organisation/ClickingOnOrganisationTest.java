package Organisation;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.HyUpr.Generic.BaseClass;
import com.HyUpr.ObjectRepo.HomePageRepo;
import com.HyUpr.ObjectRepo.OrganizationRepo;

public class ClickingOnOrganisationTest extends BaseClass {
@Test(groups= "smoke")
public void ClickOnOrg() {
HomePageRepo hp=new HomePageRepo(driver);
OrganizationRepo orp=new OrganizationRepo(driver);
hp.Organization();
orp.CrtOrg();
orp.orgData("testyanta", "Construction");
Assert.assertTrue(orp.getIndustry().isDisplayed());
hp.Contacts();
System.out.println(driver.getTitle());
}
}
