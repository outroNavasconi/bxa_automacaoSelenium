package com.automacao.pages.results;

import com.automacao.Wait;
import com.automacao.IPageWait;
import org.openqa.selenium.WebDriver;
import com.automacao.pages.ntthome.NTTHomePage;

public class ResultPage extends ResultMap implements IPageWait {
  private final WebDriver DRIVER;

  public ResultPage(WebDriver driver) {
    this.DRIVER = driver;
  }

  public NTTHomePage clickOnNttResult() {
    this.DRIVER.findElement(this.linkResult).click();
    return new NTTHomePage(this.DRIVER);
  }

  @Override
  public void waitPageLoad() {
    Wait.forVisibility(this.DRIVER, this.linkResult);
  }
}
