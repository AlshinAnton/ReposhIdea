package Pages.AndroidPages.Profile

import AndroidAndIOSHelpers.AndroidBaseClass
import Interface.ProfilePageInterface
import io.appium.java_client.AppiumDriver
import io.appium.java_client.android.AndroidKeyCode
import io.appium.java_client.pagefactory.AppiumFieldDecorator
import org.openqa.selenium.support.PageFactory

class ProfilePage(driver: AppiumDriver<*>?) : AndroidBaseClass(driver), ProfilePageInterface {

    private val settingsBtnId = "com.reposh.dev:id/action_settings"
    private val subscriptionsID = "com.reposh.dev:id/tvFollowingCount"
    private val subscribersID = "com.reposh.dev:id/tvFollowersCountLabel"
    private val editProfileBtnID = "com.reposh.dev:id/btnAction"
    private val searchBtnId = "com.reposh.dev:id/tv_search_query"
    private val sortBtnId = "com.reposh.dev:id/bt_sort"
    private val filtersBtnId = "com.reposh.dev:id/filter_layout"


    private val sellTab = "В продаже"
    private val soldTab = "Продано"
    private val repostTab = "Репосты"

    internal var coverID = "com.reposh.dev:id/iv_cover"
    internal var avatarID = "com.reposh.dev:id/iv_avatar"
    private val itemsCountID = "com.reposh.dev:id/tv_count_my_sales" //счетчик товаров
    private val closedItemCountID = "com.reposh.dev:id/tv_count_products_closet" // В шкафу
    private val sharedCountID = "com.reposh.dev:id/tv_count_shared" // Поделился
    private val folowersCountID = "com.reposh.dev:id/tv_count_followers" // Подписчики
    private val folowingCountID = "com.reposh.dev:id/tv_count_following" //Подписок
    internal var allFieldsID = "com.reposh.dev:id/tv_menu_item_name"
    private val tooltipID = "com.reposh.dev:id/tooltipText"


    private val guideTxt = "Гид"
    private val etiquetteTxt = "Reposh этикет"
    private val myProductsTxt = "Мои товары"
    private val myPurchaseTxt = "Мои покупки"
    private val mySalesTxt = "Мои продажи"
    private val likedTxt = "Мне понравилось"
    private val inviteFriends = "Пригласить друзей"
    private val findUsers = "Найти пользователей"
    private val aboutProject = "О проекте"
    private val contacts = "Контакты"
    private val offer = "Оферта"

    init {
        PageFactory.initElements(AppiumFieldDecorator(driver), this)
    }

    override fun waitTooltip() {
        waitAndroidViewById(tooltipID)
    }

    override fun closeTooltip() {
        waitAndClickAndroidElementByID(tooltipID)
    }

    override fun swipeToGuid() {
        swipeVerticalToElementWithText(guideTxt)
    }

    override fun clickAboutProjectField() {
        waitAndClickAndroidElementByText("О Mamsy360")
    }

    override fun swipeToMyProducts() {
        swipeVerticalToElementWithText(myProductsTxt)

    }

    override fun swipeToLiked() {
        swipeVerticalToElementWithTextAndClick(likedTxt)
    }

    override fun swipeToMyPurchace() {
        swipeVerticalToElementWithTextAndClick(myPurchaseTxt)
    }

    override fun swipeToMySales() {
        swipeVerticalToElementWithTextAndClick(mySalesTxt)
    }

    override fun back() {
        clickEnter(AndroidKeyCode.BACK)
    }

    override fun waitSettings() {
        waitAndroidViewById(settingsBtnId)
    }

    override fun clickSettings() {
        waitAndClickAndroidElementByID(settingsBtnId)
    }

    override fun waitSubscriptionsField() {
        waitAndroidViewById(subscriptionsID)
    }

    override fun clickSubscriptionsField() {
        waitAndClickAndroidElementByID(subscriptionsID)
    }

    override fun waitSubscribersField() {
        waitAndroidViewById(subscribersID)
    }

    override fun clickSubscribersField() {
        waitAndClickAndroidElementByID(subscribersID)
    }

    override fun waitSearchBtn() {
        waitAndroidViewById(searchBtnId)
    }

    override fun clickSearchBtn() {
        waitAndClickAndroidElementByID(searchBtnId)
    }

    override fun waitSortBtn() {
        waitAndroidViewById(sortBtnId)
    }

    override fun clickSortBtb() {
        waitAndClickAndroidElementByID(sortBtnId)
    }

    override fun waitFiltersBtn() {
        waitAndroidViewById(filtersBtnId)
    }

    override fun clickFiltersBtn() {
        waitAndClickAndroidElementByID(filtersBtnId)
    }

    override fun clickByGuide() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun swipeToEtiquette() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun clickByEtiquette() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun clickByMyProducts() {
        clickAndroidElementByText(myProductsTxt)
    }

    override fun clickByMyPurchase() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun clickByMySales() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun clickLiked() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun swipeToInvitePeopleField() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun clickByInvitePeopleField() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun swipeToFindUsersField() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun clickByFindUsersField() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun swipeToAboutProjectField() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun swipeToContactsField() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun clickByContactsField() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun swipeToOfferField() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun clickByOfferField() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}