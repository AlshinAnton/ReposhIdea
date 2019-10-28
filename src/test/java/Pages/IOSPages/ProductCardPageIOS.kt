package Pages.IOSPages

import AndroidAndIOSHelpers.IOSBaseClass
import Interface.ProductCardInterface
import org.openqa.selenium.support.PageFactory

import io.appium.java_client.AppiumDriver
import io.appium.java_client.pagefactory.AppiumFieldDecorator

class ProductCardPageIOS(driver: AppiumDriver<*>) : IOSBaseClass(driver), ProductCardInterface {
    override val productID: Int
        get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.
    override val productName: String
        get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.

    override fun waitMessageOnModeration() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun clickMenuAction() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun waitMenu() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun clickEdit() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun clickShareInTape() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun clickShareWith() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getInitialProductID(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun assertPublishId() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun waitLikeIcon() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun clickByLikeIcon() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun waitCommentsIcon() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun clickByCommentsIcon() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun waitShareIcon() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun clickByShareIcon() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getCommentsCount() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun assertCommentCount() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun waitBargainOfferPrice() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun waitBargainMoveToBargain() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun waitBargainOfferConfirm() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun clickBargain() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getLikeCountBeforeLike() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun assertLikeCount() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun swipeToSize() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun clickByOneSize() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun swipeToBrand() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun clickByBrandPastilla() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun swipeToColor() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun clickByColor() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun swipeToCategory() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun clickByCategory() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun swipeToLocation() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun clickByLocation() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun swipeToCondition() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun clickByCondition() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun assertFilter(filter: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun swipeToConnectWithSeller() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun clickConnectWithSeller() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun waitId() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun waitSendToSoldBtn() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun clickSendToSold() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun assertSoldStatus() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun waitProductName() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getProductName() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun clickBack() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun assertProductName() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun buyItem() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun waitAndClickBuyBtn() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    init { PageFactory.initElements(AppiumFieldDecorator(driver), this) }


}
