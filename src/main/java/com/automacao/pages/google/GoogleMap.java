package com.automacao.pages.google;

import org.openqa.selenium.By;

public class GoogleMap {
  protected final By inputQuery;

  protected GoogleMap() {
    this.inputQuery = By.xpath("//textarea[@name='q']");
  }
}
