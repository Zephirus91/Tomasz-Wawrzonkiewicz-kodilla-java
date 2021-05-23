package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {

    public static final String COOKIES_ACCEPT = "//div[contains(@class, \"_9o-r\")]/button[2]";
    public static final String REGISTER_ACCOUNT = "//div[contains(@class, \"_6ltg\")/a]";
    public static final String NAME = "//div[contains(@class, \"u_d_a_dt\"/div/input";
    public static final String SURNAME = "//div[contains(@class, \"u_d_c_Hd\"/div/input";
    public static final String PHONE_NUMBER_OR_EMAIL = "//div[contains(@class, \"u_d_f_3w\"/div/input/";
    public static final String PASSWORD = "//div[contains(@class, \"u_d_k_us\"/div/input";
    public static final String BIRTH_DAY = "//div[contains(@class, \"u_d_l_O0\"/span/select[1]";
    public static final String BIRTH_MONTH = "//div[contains(@class, \"u_d_l_O0\"/span/select[2]";
    public static final String BIRTH_YEAR = "//div[contains(@class, \"u_d_l_O0\"/span/select[3]";
    public static final String SEX_FEMALE = "//div[contains(@class, \"_5k_3\"/span[1]/input";
    public static final String SEX_MALE = "//div[contains(@class, \"_5k_3\"/span[2]/input";
    public static final String SECOND_REGISTER_ACCOUNT = "//div[contains(@class, \"_1lch\"/button";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.FIREFOX);
        driver.get("https://www.facebook.com/");

        WebElement cookiesAccept = driver.findElement(By.xpath(COOKIES_ACCEPT));
        cookiesAccept.click();

        while (!driver.findElement(By.xpath(REGISTER_ACCOUNT)).isDisplayed());

        WebElement registerAccount = driver.findElement(By.xpath(REGISTER_ACCOUNT));
        registerAccount.click();

        while (!driver.findElement(By.xpath(NAME)).isDisplayed());

        WebElement enterName = driver.findElement(By.xpath(NAME));
        enterName.sendKeys("Benny");

        WebElement enterSurname = driver.findElement(By.xpath(SURNAME));
        enterSurname.sendKeys("Hilarious");

        WebElement enterPhoneNumberOrEmail = driver.findElement(By.xpath(PHONE_NUMBER_OR_EMAIL));
        enterPhoneNumberOrEmail.sendKeys("111222333");

        WebElement enterPassword = driver.findElement(By.xpath(PASSWORD));
        enterPassword.sendKeys("QWerTY1234");

        WebElement enterBirthDay = driver.findElement(By.xpath(BIRTH_DAY));
        Select selectDay = new Select(enterBirthDay);
        selectDay.selectByIndex(10);

        WebElement enterBirthMonth = driver.findElement(By.xpath(BIRTH_MONTH));
        Select selectMonth = new Select(enterBirthMonth);
        selectMonth.selectByIndex(3);

        WebElement enterBirthYear = driver.findElement(By.xpath(BIRTH_YEAR));
        Select selectYear = new Select(enterBirthYear);
        selectYear.selectByIndex(30);

        WebElement chooseFemaleSex = driver.findElement(By.xpath(SEX_FEMALE));
        chooseFemaleSex.click();

        WebElement chooseMaleSex = driver.findElement(By.xpath(SEX_MALE));
        chooseMaleSex.click();

        WebElement secondRegister = driver.findElement(By.xpath(SECOND_REGISTER_ACCOUNT));
        secondRegister.click();
    }
}