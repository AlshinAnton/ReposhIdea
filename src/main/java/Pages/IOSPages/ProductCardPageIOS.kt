package Pages.IOSPages

import AndroidAndIOSHelpers.IOSBaseClass
import Interface.ProductCardInterface
import org.openqa.selenium.support.PageFactory

import io.appium.java_client.AppiumDriver
import io.appium.java_client.pagefactory.AppiumFieldDecorator

class ProductCardPageIOS(driver: AppiumDriver<*>) : IOSBaseClass(driver), ProductCardInterface {
    override fun waitAndClickBuyBtn() {

    }

    override fun buyItem() {

    }

    override fun assertProductName() {

    }


    override fun clickBack() {
        clickBack()
    }

    override fun getProductName() {

    }

    override val productID: Int
        get() = 0

    override val productName: String
        get() = ""

    init {
        PageFactory.initElements(AppiumFieldDecorator(driver), this)

    }

    override fun waitMessageOnModeration() {

    }

    override fun clickMenuAction() {

    }

    override fun waitMenu() {

    }

    override fun clickEdit() {

    }

    override fun clickShareInTape() {

    }

    override fun clickShareWith() {

    }

    override fun getInitialProductID(): Int {
        return 0
    }

    override fun assertPublishId() {

    }

    override fun waitLikeIcon() {

    }

    override fun clickByLikeIcon() {

    }

    override fun waitCommentsIcon() {

    }

    override fun clickByCommentsIcon() {

    }

    override fun waitShareIcon() {

    }

    override fun clickByShareIcon() {

    }

    override fun getCommentsCount() {

    }

    override fun assertCommentCount() {

    }

    override fun waitBargain() {

    }

    override fun clickBargain() {

    }

    override fun getLikeCountBeforeLike() {

    }

    override fun assertLikeCount() {

    }

    override fun swipeToSize() {

    }

    override fun clickByOneSize() {

    }

    override fun swipeToBrand() {

    }

    override fun clickByBrandPastilla() {

    }

    override fun swipeToColor() {

    }

    override fun clickByColor() {

    }

    override fun swipeToCategory() {

    }

    override fun clickByCategory() {

    }

    override fun swipeToLocation() {

    }

    override fun clickByLocation() {

    }

    override fun swipeToCondition() {

    }

    override fun clickByCondition() {

    }

    override fun assertFilter(filter: String) {

    }

    override fun swipeToConnectWithSeller() {

    }

    override fun clickConnectWithSeller() {

    }

    override fun waitId() {

    }

    override fun waitSendToSoldBtn() {

    }

    override fun clickSendToSold() {

    }

    override fun assertSoldStatus() {

    }

    override fun waitProductName() {

    }
}
