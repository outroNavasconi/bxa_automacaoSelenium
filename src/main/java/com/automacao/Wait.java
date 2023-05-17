package com.automacao;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Wait {
  private static final int SECONDS = 10;
  
  public static void forVisibility(WebDriver driver, By by) {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(Wait.SECONDS));
    wait.until(ExpectedConditions.visibilityOfElementLocated(by));
  }

  public static void countdown(int seconds) {
    try { Thread.sleep(seconds * 1000);
    } catch (InterruptedException e) { e.printStackTrace(); }
  }
}
