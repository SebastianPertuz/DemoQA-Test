package tests;

import org.junit.Test;
import pages.DashboardPage;

public class DashboardInteracts {

    public DashboardPage dashboardPage;

    @Test
    public void dashboardCards(){
        dashboardPage.clickOnCard();
    }

}
