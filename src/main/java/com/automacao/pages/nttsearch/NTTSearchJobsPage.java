package com.automacao.pages.nttsearch;

import com.automacao.Wait;
import com.automacao.IPageWait;
import org.openqa.selenium.WebDriver;

public class NTTSearchJobsPage extends NTTSearchJobsMap implements IPageWait {
  private final WebDriver DRIVER;

  public NTTSearchJobsPage(WebDriver driver) {
    this.DRIVER = driver;
  }

  public void search(String query) {
    this.DRIVER.findElement(this.inputSearchJobs).sendKeys(query.concat("\n"));
  }

  @Override
  public void waitPageLoad() {
    Wait.forVisibility(this.DRIVER, this.inputSearchJobs);
  }
}
