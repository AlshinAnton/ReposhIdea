package Test.AndroidTests

import AppiumSupport.BaseTestClass
import Pages.AndroidPages.LoginAndRegistration.User


class CheckFiltersTests : BaseTestClass() {

    /*@Test
    fun checkSizeFilterTest() {
        preCondition()
        productCardInterface.swipeToLocation()
        productCardInterface.clickByOneSize()
        filtersInterface.waitFiltersPage()
        filtersInterface.checkCountFilters("2", "Size")
        filtersInterface.clickByFirstItem()
        productCardInterface.assertFilter("One Size")
    }

    @Test
    fun checkBrandFilterTest() {
        preCondition()
        productCardInterface.swipeToBrand()
        productCardInterface.clickByBrandPastilla()
        filtersInterface.checkCountFilters("2", "Brand")
        *//*filtersInterface.clickByFirstItem()
        productCardInterface.assertFilter("Pastilla")*//*
    }

    @Test
    fun checkColorFilterTest() {
        preCondition()
        productCardInterface.swipeToColor()
        productCardInterface.clickByColor()
        filtersInterface.checkCountFilters("2", "Color")
        *//*filtersInterface.clickByFirstItem()
        productCardInterface.assertFilter("Черный")*//*
    }

    @Test
    fun checkCategoryFilterTest() {
        preCondition()
        productCardInterface.swipeToCategory()
        productCardInterface.clickByCategory()
        filtersInterface.checkCountFilters("1", "Category")
        filtersInterface.clickByFirstItem()
        productCardInterface.assertFilter("Аксессуары")
    }*/

    /*@Test
    fun checkLocationFilterTest() {
        preCondition()
        productCardInterface.swipeToLocation()
        productCardInterface.clickByLocation()
        filtersInterface.checkCountFilters("2", "Location")
    }*/

    /*@Test
    fun checkConditionFilterTest() {
        preCondition()
        productCardInterface.swipeToCondition()
        productCardInterface.clickByCondition()
        filtersInterface.checkCountFilters("2", "Condition")
        filtersInterface.waitFiltersPage()
        *//*filtersInterface.clickByFirstItem()
        productCardInterface.assertFilter("Хорошее") // надо изменить , когда Саня поправит "Состояние"*//*
    }*/


    private fun preCondition() {
        onboardingInterface.waitThenCloseOnBoardingPage()
        loginInterface.login(User.User1())
        tapeInterface.closeTooltips()
        bottomToolbarInterface.clickSearch()
        searchPageInterface.waitAndClickSearchIconTop()
        searchPageInterface.waitAndClickSearchField()
        searchPageInterface.setTextForSearchHeadPhones()
        searchPageInterface.clickEnter()
        searchPageInterface.clickByHeadPhonesProduct()
        productCardInterface.waitLikeIcon()
    }
}