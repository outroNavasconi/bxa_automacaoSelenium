package com.automacao;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebDriverFactory {
  private static final String driverLocation = ".\\src\\main\\resources\\driver\\chromedriver.exe";
  
  public static ChromeDriver createChromeDriver() {
    System.setProperty("webdriver.chrome.driver", WebDriverFactory.driverLocation);
    ChromeOptions opts = new ChromeOptions();
    opts.addArguments("--start-maximized");
    opts.addArguments("incognito");
    return new ChromeDriver(opts);
  }
}
