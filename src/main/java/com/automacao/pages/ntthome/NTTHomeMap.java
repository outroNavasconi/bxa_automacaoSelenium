package com.automacao.pages.ntthome;

import org.openqa.selenium.By;

public class NTTHomeMap {
  protected final By linkCareers;
  protected final By linkSearchJobs;
  protected final By buttonAcceptCookies;

  protected NTTHomeMap() {
    this.buttonAcceptCookies = By.id("necessary");
    this.linkCareers = By.xpath("//span[text()='Carreira']/..");
    this.linkSearchJobs = By.xpath("//a[normalize-space()='Junte-se a nossa equipe']");
  }
}
