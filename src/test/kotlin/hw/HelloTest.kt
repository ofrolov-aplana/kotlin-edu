package hw

import org.junit.Before
import org.junit.Test
import kotlin.test.assertEquals
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.support.FindBy
import org.openqa.selenium.support.PageFactory


class HelloTest {

    lateinit var driver: ChromeDriver

    @FindBy(css = "a[title='Яндекс']")
    lateinit var link: WebElement


    @Before
    fun setBwser() {
        System.setProperty("webdriver.chrome.driver", """C:\Users\FrologY\Downloads\hw1\kotlinselenium\resourse\chromedriver.exe""")
    }


    @Test
    fun clickLink() {
        val driver = ChromeDriver()
        driver.get("http://ya.ru")
        PageFactory.initElements(driver, this)
        link.click()
        val title = driver.getTitle()
        println(title)
        assertEquals("Яндекс",title,"Wrong page")
        driver.quit()
    }
}
