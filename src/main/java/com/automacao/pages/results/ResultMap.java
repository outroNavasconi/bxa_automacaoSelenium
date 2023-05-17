package com.automacao.pages.results;

import org.openqa.selenium.By;

public class ResultMap {
  protected final By linkResult;

  protected ResultMap() {
    this.linkResult = By.xpath("//h3[contains(text(),'NTT DATA Business Solutions')]");
  }
}
