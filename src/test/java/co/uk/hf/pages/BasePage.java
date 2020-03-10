package co.uk.hf.pages;

import co.uk.hf.commons.DriverLib;

public class BasePage extends DriverLib
{public String BASE_URL = "https://www.h-f.co.uk/";

public void launchURL()
{
    driver.navigate().to(BASE_URL);
}
}
