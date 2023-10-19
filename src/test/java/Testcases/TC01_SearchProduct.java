package Testcases;

import Baseclass.baseclass;
import Objects.SearchboxPO;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TC01_SearchProduct extends baseclass {



    @Test

    public  void Textboxpage() throws InterruptedException {


        Thread.sleep(2000);
        PageFactory.initElements(driver, SearchboxPO.class);

        SearchboxPO.searchfield.sendKeys("samsung s22 ultra 5g ");
        SearchboxPO.inputSubmitButton.click();

         SearchboxPO.SamsungGalaxyUltraGreen.click();

    }


}
