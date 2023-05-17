package com.automacao.pages.ntthome;

import com.automacao.Wait;
import com.automacao.pages.nttsearch.NTTSearchJobsPage;
import com.automacao.IPageWait;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;

public class NTTHomePage extends NTTHomeMap implements IPageWait {
  private final WebDriver DRIVER;

  public NTTHomePage(WebDriver driver) {
    this.DRIVER = driver;
  }

  public NTTSearchJobsPage accessSearchJobsPage() {
    this.DRIVER.findElement(this.linkCareers).click();
    Wait.forVisibility(this.DRIVER, this.linkSearchJobs);
    this.DRIVER.findElement(this.linkSearchJobs).click();
    ArrayList<String> handles = new ArrayList<>(this.DRIVER.getWindowHandles());
    this.DRIVER.switchTo().window(handles.get(1));
    return new NTTSearchJobsPage(this.DRIVER);
  }

  public void acceptCookies() {
    this.DRIVER.findElement(this.buttonAcceptCookies).click();
  }

  @Override
  public void waitPageLoad() {
    Wait.forVisibility(this.DRIVER, this.linkCareers);
  }
}
