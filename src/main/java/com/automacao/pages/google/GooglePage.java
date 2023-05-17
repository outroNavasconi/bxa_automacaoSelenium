package com.automacao.pages.google;

import com.automacao.Wait;
import com.automacao.IPageWait;
import org.openqa.selenium.WebDriver;
import com.automacao.pages.results.ResultPage;

public class GooglePage extends GoogleMap implements IPageWait {
  private final String URL;
  private final WebDriver DRIVER;

  public GooglePage(WebDriver driver) {
    this.DRIVER = driver;
    this.URL = "https://www.google.com";
  }

  public void accessPage() {
    this.DRIVER.navigate().to(this.URL);
  }
  
  public ResultPage search(String query) {
    this.DRIVER.findElement(this.inputQuery).sendKeys(query.concat("\n"));
    return new ResultPage(this.DRIVER);
  }

  @Override
  public void waitPageLoad() {
    Wait.forVisibility(this.DRIVER, this.inputQuery);
  }
}
