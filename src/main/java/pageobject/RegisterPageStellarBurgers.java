package pageobject;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterPageStellarBurgers {

    private static final By REGISTER_BUTTON = By.xpath(".//button[text()='Зарегистрироваться']");
    private static final By NAME_FIELD = By.xpath("//*[@id=\"root\"]/div/main/div/form/fieldset[1]/div/div/input");
    private static final By EMAIL_FIELD = By.xpath("//*[@id=\"root\"]/div/main/div/form/fieldset[2]/div/div/input");
    private static final By PASSWORD_FIELD = By.xpath(".//input[@name='Пароль']");

    private WebDriver driver;

    public RegisterPageStellarBurgers(WebDriver driver) {
        this.driver = driver;
    }

    @Step("Ввод имени при регистрации")
    public void enterName(String name){
        driver.findElement(NAME_FIELD).sendKeys(name);
    }

    @Step("Ввод email при регистрации")
    public void enterEmail(String email){
        driver.findElement(EMAIL_FIELD).sendKeys(email);
    }

    @Step("Ввод пароля при регистрации")
    public void enterPassword(String password){
        driver.findElement(PASSWORD_FIELD).sendKeys(password);
    }

    @Step("Нажать на кнопку Зарегистрироваться")
    public void clickRegister(){
        driver.findElement(REGISTER_BUTTON).click();
    }

}