package stepDefinitions;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import utilities.Driver;

import java.text.SimpleDateFormat;
import java.util.Date;

public class _00_Hooks {
    @Before   // her senaryodan önce
    public void before(Scenario scenario)
    {

        System.out.println("senaryonun id = "+scenario.getId());
        System.out.println(scenario.getName() + " has been started");
    }

    @After  // her senaryodan sonra
    public void after(Scenario scenario)
    {
        System.out.println(scenario.getName() + " has been started");
        System.out.println(scenario.getName() + " : " + scenario.getStatus());

        Date now=new Date();
        SimpleDateFormat formatter=new SimpleDateFormat("yyyy-MM-dd HH_mm_ss"); // istediğim formatı oluşturdum
        String strDate = formatter.format(now); // şu andaki zamanı istediğim formata dönüştürdüm.
        System.out.println(strDate);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Driver.quitDriver();

        }
    }