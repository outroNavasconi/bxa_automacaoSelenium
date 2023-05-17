package com.automacao.nttsearchjobs;

import com.automacao.Wait;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import com.automacao.WebDriverFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import com.automacao.pages.google.GooglePage;
import com.automacao.pages.results.ResultPage;
import com.automacao.pages.ntthome.NTTHomePage;
import com.automacao.pages.nttsearch.NTTSearchJobsPage;

public class NTTSearchJobsTest {
  private WebDriver driver;
  private GooglePage googlePage;
  private ResultPage resultPage;
  private NTTHomePage nttHomePage;
  private NTTSearchJobsPage nttSearchJobsPage;

  @BeforeEach
  public void beforeEach() {
    this.driver = WebDriverFactory.createChromeDriver();
  }

  @Test
  public void shouldSearchJobs() {
    this.googlePage = new GooglePage(this.driver);
    this.googlePage.accessPage();
    this.googlePage.waitPageLoad();
    this.resultPage = this.googlePage.search("nttdata");
    this.resultPage.waitPageLoad();
    this.nttHomePage = this.resultPage.clickOnNttResult();
    this.nttHomePage.waitPageLoad();
    this.nttSearchJobsPage = this.nttHomePage.accessSearchJobsPage();
    this.nttSearchJobsPage.waitPageLoad();
    this.nttSearchJobsPage.search("arquiteto");
    Wait.countdown(5);
  }

  @AfterEach
  public void afterEach() {
    this.driver.quit();
  }
}
