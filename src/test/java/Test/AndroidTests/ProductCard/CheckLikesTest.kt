package Test.AndroidTests.ProductCard

import AppiumSupport.BaseTestClass
import Pages.AndroidPages.LoginAndRegistration.User
import org.junit.jupiter.api.Test

class CheckLikesTest : BaseTestClass() {

    @Test
    fun checkLikesTest() {
        onboardingInterface.waitThenCloseOnBoardingPage()
        loginInterface.login(User.User1())
        tapeInterface.closeTooltips()
        bottomToolbarInterface.clickSearch()
        Thread.sleep(1000)
        searchPageInterface.waitAndClickSearchIconTop()
        searchPageInterface.waitAndClickSearchField()
        searchPageInterface.setTextForSearchHeadPhones()
        searchPageInterface.clickEnter()
        searchPageInterface.clickByHeadPhonesProduct()
        productCardInterface.waitLikeIcon()
        productCardInterface.clickByLikeIcon()
        productCardInterface.getLikeCountBeforeLike()
        Thread.sleep(1000)
        productCardInterface.clickByLikeIcon()
        Thread.sleep(1000)
        productCardInterface.assertLikeCount()
    }
}