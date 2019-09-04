package com.trelloBoards.qa;


import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TeamCreationTests extends TestBaseBoards {

    @Test
    public void TeamCreationTests() {
        driver.findElement(By.cssSelector("[aria-label='Create a team']")).click();

        driver.findElement(By.cssSelector("[placeholder=\"Taco's Co.\"]")).click();
        driver.findElement(By.cssSelector("[placeholder=\"Taco's Co.\"]")).clear();
        driver.findElement(By.cssSelector("[placeholder=\"Taco's Co.\"]")).sendKeys("YanaTeam");
        driver.findElement(By.cssSelector("[data-test-id=\"header-create-team-submit-button\"]")).click();


    }
}