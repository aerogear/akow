package pageobjects

import org.aerogear.akow.pageobject.PageObject
import org.openqa.selenium.WebElement

/**
 * Created on 2/27/18.
 */
interface MainScreen : PageObject {

    val navDrawer: WebElement
    val mnuTextFieldsItem: WebElement

    fun selectInNavDrawer(item: WebElement) {
        navDrawer.click()
        item.click()
    }

}