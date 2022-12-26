package org.caroAlexander.autStartSharpDemoSerenity.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.caroAlexander.autStartSharpDemoSerenity.userinterface.StartSharpLogin;
import org.caroAlexander.autStartSharpDemoSerenity.userinterface.StartSharpNorthwindShipper;

public class AddNewShipper implements Task {
    public static AddNewShipper newShipper() { return Tasks.instrumented(AddNewShipper.class); }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(StartSharpNorthwindShipper.NORTHWIND_SECTION_BUTTON),
                Click.on(StartSharpNorthwindShipper.SHIPPER_SECTION_BUTTON),
                Click.on(StartSharpNorthwindShipper.NEW_SHIPPER_BUTTON),
                Enter.theValue("IAS Clean").into(StartSharpNorthwindShipper.INPUT_COMPANYNAME),
                Enter.theValue("3054461269").into(StartSharpNorthwindShipper.INPUT_COMPANYPHONE),
                Click.on(StartSharpNorthwindShipper.SAVE_SHIPPER_BUTTON)
        );

    }
}
