package org.caroAlexander.autStartSharpDemoSerenity.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class StartSharpNorthwindShipper extends PageObject {

    public static final Target NORTHWIND_SECTION_BUTTON = Target.the("button that shows us the Northwind options")
            .located(By.xpath("//span[contains(text(),'Northwind')]"));

    public static final Target SHIPPER_SECTION_BUTTON = Target.the("button that shows the Shipper Section")
            .located(By.xpath("//span[contains(text(),'Shippers')]"));

    public static final Target NEW_SHIPPER_BUTTON = Target.the("button that shows us the New Shipper form")
            .located(By.xpath("//i[contains(text(),'Nuevo Shipper')]"));

    public static final Target INPUT_COMPANYNAME = Target.the( "where do we write the Company's Name")
            .located(By.id("Serenity_Demo_Northwind_ShipperDialog9_CompanyName"));

    public static final Target INPUT_COMPANYPHONE = Target.the("where do we write the Company's Phone")
            .located(By.id("Serenity_Demo_Northwind_ShipperDialog9_Phone"));

    public static final Target SAVE_SHIPPER_BUTTON = Target.the("button that shows us the New Shipper form")
            .located(By.xpath("//span[contains(text(),'Guardar')]"));

}
