package Pages.AndroidPages.ProductCard

import AndroidAndIOSHelpers.AndroidBaseClass
import Interface.ProductCardInterface
import org.openqa.selenium.support.PageFactory

import io.appium.java_client.AppiumDriver
import io.appium.java_client.android.AndroidKeyCode
import io.appium.java_client.pagefactory.AppiumFieldDecorator

class ProductCardScreen(driver: AppiumDriver<*>) : AndroidBaseClass(driver), ProductCardInterface {

    override fun clickBack() {
        clickEnter(AndroidKeyCode.BACK)
    }

    private val menuActionBtnID = "com.reposh.dev:id/action_options"
    private val menuEditID = "com.reposh.dev:id/btn_edit"
    private val menuShareInTapeID = "com.reposh.dev:id/btn_share_in_feed"
    private val menuShareWithID = "com.reposh.dev:id/btn_share_more"
    private val likeIconID = "com.reposh.dev:id/btn_like"
    private val commentsIconID = "com.reposh.dev:id/btn_comment"
    private val shareIconID = "com.reposh.dev:id/btn_share"
    private val commentsCOUNTId = "com.reposh.dev:id/tv_comment_counter"
    private val sendToSoldBtnID = "com.reposh.dev:id/btnSold"
    private val statusID = "com.reposh.dev:id/tvSold"
    private val productNameID = "com.reposh.dev:id/tv_product_name"

    private val bargainId = "com.reposh.dev:id/btn_offer"

    override var productID: Int = 0
    override var productName: String = ""

    val sizeTxt = "One Size"
    val brandTxt = "08Sircus"
    val colorTxt = "Черный"
    val categoryTxt = "Аксессуары"
    val locationTxt = "5-й Донской пр-д, 11 строение 2, Москва, Россия, 115419"
    val conditiontxt = "Хорошее"


    init {
        PageFactory.initElements(AppiumFieldDecorator(driver), this)
    }

    override fun waitMessageOnModeration() {
        waitANDROIDElementByTEXT("Объявление на модерации")
    }

    override fun clickMenuAction() {
        Thread.sleep(1000)
        waitAndClickAndroidElementByID(menuActionBtnID)
    }


    override fun waitMenu() {
        isVisibleID(menuActionBtnID)
    }

    override fun clickEdit() {
        waitANDROIDElementByTEXT("Редактировать")
        clickAndroidElementByText("Редактировать")
    }

    override fun clickShareInTape() {
        waitAndClickAndroidElementByID(menuShareInTapeID)
    }

    override fun clickShareWith() {
        waitAndClickAndroidElementByID(menuShareWithID)
    }

    override fun getInitialProductID(): Int {
        isVisibleID("com.reposh.dev:id/tv_id")
        val moderationID = getTextFromElementWithId("com.reposh.dev:id/tv_id")
        return Integer.parseInt(moderationID.substring(4))
    }

    override fun assertPublishId() {
        val text = getTextFromElementWithId("com.reposh.dev:id/tv_id")
        val publishId = Integer.parseInt(text.substring(4))
        assert(productID == publishId)
    }

    override fun waitLikeIcon() {
        isVisibleID(likeIconID)
    }

    override fun clickByLikeIcon() {
        waitAndClickAndroidElementByID(likeIconID)
    }

    override fun waitCommentsIcon() {
        isClickableID(commentsIconID)
    }

    override fun clickByCommentsIcon() {

        waitAndClickAndroidElementByID(commentsIconID)
    }

    override fun waitShareIcon() {
        isVisibleID(shareIconID)
    }

    override fun clickByShareIcon() {
        waitAndClickAndroidElementByID(shareIconID)
    }

    var countCommentsBefore = 0
    override fun getCommentsCount() {
        val count = getTextFromElementWithId("com.reposh.dev:id/tv_comment_counter")
        countCommentsBefore = Integer.parseInt(count)
    }

    override fun assertCommentCount() {
        countCommentsBefore += 1
        val countBeforeString = String.format(countCommentsBefore.toString())
        val element = getTextFromElementWithId("com.reposh.dev:id/tv_comment_counter")
        assertTemplateStringsById("com.reposh.dev:id/tv_comment_counter", countBeforeString, "Счетчик не обновился. " +
                "Элемент взятый в начале + 1 =  " + countCommentsBefore + "  Элемент после комментрия = " + element)
    }

    override fun clickBargain() {
        waitAndClickAndroidElementByID(bargainId)
    }

    override fun waitBargainOfferPrice() {
        waitANDROIDElementByTEXT("Предложить цену")
    }

    override fun waitBargainMoveToBargain() {
        waitANDROIDElementByTEXT("Перейти в торги")
    }

    override fun waitBargainOfferConfirm() {
        waitANDROIDElementByTEXT("Ура")
    }

    var countLikesBefore = 0
    override fun getLikeCountBeforeLike() {
        val startCountLikes = getTextFromElementWithId("com.reposh.dev:id/tv_like_counter")
        countLikesBefore = Integer.parseInt(startCountLikes)
    }

    override fun assertLikeCount() {
        val countAfterString = getTextFromElementWithId("com.reposh.dev:id/tv_like_counter")
        val countLikesAfterInt = Integer.parseInt(countAfterString)
        if (!(countLikesAfterInt == (countLikesBefore + 1) || countLikesAfterInt == (countLikesBefore - 1))) {
            println("Счетчик не обновился. Элемент взятый в начале =  $countLikesBefore  Элемент после лайка = $countLikesAfterInt")
        }
    }

    override fun swipeToSize() {
        swipeVerticalToElementWithText(sizeTxt)
    }

    override fun clickByOneSize() {
        clickAndroidElementByText(sizeTxt)
    }

    override fun swipeToBrand() {
        swipeVerticalToElementWithText(brandTxt)
    }

    override fun clickByBrandPastilla() {
        clickAndroidElementByText(brandTxt)
    }

    override fun swipeToColor() {
        swipeVerticalToElementWithText(colorTxt)
    }

    override fun clickByColor() {
        clickAndroidElementByText(colorTxt)
    }

    override fun swipeToCategory() {
        swipeVerticalToElementWithText(categoryTxt)
    }

    override fun clickByCategory() {
        clickAndroidElementByText(categoryTxt)
    }

    override fun swipeToLocation() {
        swipeVerticalToElementWithText(locationTxt)
    }

    override fun clickByLocation() {
        clickAndroidElementByText(locationTxt)
    }

    override fun clickByCondition() {
        swipeVerticalToElementWithText(conditiontxt)
    }

    override fun swipeToCondition() {
        swipeVerticalToElementWithTextAndClick(conditiontxt)
    }

    override fun assertFilter(filter : String) {
        assertTextWithSwipe(filter)
    }

    override fun swipeToConnectWithSeller() {
        swipeVerticalToElementWithText("Написать продавцу")
    }

    override fun clickConnectWithSeller() {
        clickAndroidElementByText("Написать продавцу")
    }

    override fun swipeToAnotherProducts() {
        swipeVerticalToElementWithText("Другие товары продавца")
    }

    override fun waitId() {
        isVisibleID("com.reposh.dev:id/tv_id")
    }

    override fun waitSendToSoldBtn() {
        isVisibleID(sendToSoldBtnID)
    }

    override fun clickSendToSold() {
        waitAndClickAndroidElementByID(sendToSoldBtnID)
        waitANDROIDElementByTEXT("OK")
        clickAndroidElementByText("OK")
    }

    override fun assertSoldStatus() {
        assertTemplateStringsById(statusID, "Продано", "Статус товара не = Продано")
    }

    override fun waitAndClickBuyBtn() {
        swipeVerticalToElementWithText("Купить")
        waitAndClickAndroidElementByID("com.reposh.dev:id/btn_buy")
    }

    override fun waitProductName() {
        isVisibleID(productNameID)
    }

    override fun getProductName() {
        productName = getTextFromElementWithId(productNameID)
    }

    override fun assertProductName() {
        //assertTemplateStringsById(productNameID, productName, "Не совпадает название продукта")
    }

    override fun buyItem() {
        clickAndroidElementByText("Купить")
    }
}
