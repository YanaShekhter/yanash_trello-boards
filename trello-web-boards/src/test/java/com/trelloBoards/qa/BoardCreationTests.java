package com.trelloBoards.qa;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class BoardCreationTests extends TestBaseBoards {
    @Test
    public void BoardCreationTests() {
        driver.findElement(By.cssSelector("[class=\"board-tile mod-add\"]")).click();
        driver.findElement(By.cssSelector("[placeholder=\"Add board title\"]")).click();
        driver.findElement(By.cssSelector("[placeholder=\"Add board title\"]")).clear();
        driver.findElement(By.cssSelector("[placeholder=\"Add board title\"]")).sendKeys("Yana_TEST");
        driver.findElement(By.cssSelector("[type=\"submit\"]")).click();
    }
}
