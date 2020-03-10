package co.uk.hf.hooks;

import co.uk.hf.commons.Browsers;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends Browsers
{private String defaultBrowser = "Chrome";
@Before
public void setUp()
{
    launchBrowser(defaultBrowser);
}

@After
    public void tearDown()
{
closeBrowser();
}
}
