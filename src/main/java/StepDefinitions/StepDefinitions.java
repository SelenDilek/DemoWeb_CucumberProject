package StepDefinitions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Map;
import java.util.concurrent.TimeUnit;


public class StepDefinitions {

    WebDriver driver;


    @Given("^user enter web page$")
    public void user_enter_web_page() throws Throwable {
        WebDriverManager.chromedriver().setup();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
        driver.get("https://demowebshop.tricentis.com/login");
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);


    }

    @Then("^close the aweb page$")
    public void close_the_aweb_page() throws Throwable {

        System.out.println("Closing web page");
    }

    @And("^user verify title$")
    public void user_verify_title() throws Throwable {
        System.out.println("verifing");

    }

    @And("^user click the register link$")
    public void user_click_the_register_link() throws Throwable {

        System.out.println("user click the register button");
    }

    @And("^user select gender$")
    public void user_select_gender() throws Throwable {
        System.out.println("select gender");

    }

    @And("^users enter below informations$")
    public void users_enter_below_informations(DataTable table) throws Throwable {
        System.out.println("informations as : ");

        Map<String, String> map =table.asMap(String.class, String.class) ;
            driver.findElement(By.xpath("")).sendKeys(map.get("firstname"));
            driver.findElement(By.xpath("")).sendKeys(map.get("lastname"));
            driver.findElement(By.xpath("")).sendKeys(map.get("email"));
            driver.findElement(By.xpath("")).sendKeys(map.get("password"));
            driver.findElement(By.xpath("")).sendKeys(map.get("confirm"));

            driver.findElement(By.xpath("")).click();






    }

}
