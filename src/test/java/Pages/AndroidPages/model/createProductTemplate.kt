package Pages.AndroidPages.model

import AppiumSupport.BaseTestClass
import Pages.AndroidPages.LoginAndRegistration.User
import com.sun.org.apache.xpath.internal.operations.Bool

// Если не  получится публиковать продукт, то надо отдельно  создавать товары с курьером и постаматом , последующий сценарий будетзависеть от имени товара
data class CreateProductTemplate(val userTemplate: UserTemplate,
                                 val usePhoto: Boolean = false,
                                 val itemAndDescription: NameTemplate = NameTemplate(),
                                 val useCategory: Boolean = false,
                                 val useSize: Boolean = false,
                                 val sizeTemplate: SizeTemplate = SizeTemplate(),
                                 val useBrand: Boolean = false,
                                 val useCondition: Boolean = false,
                                 val usePurchasePriceAndSellingPrice: Boolean = false,
                                 val useLocation: Boolean = false,
                                 val useDelivery: Boolean = false,
                                 val deliveryTemplate: DeliveryTemplate = DeliveryTemplate(),
                                 val useTariff: Boolean = false)


data class NameTemplate(val nameDpdCourier: Boolean = false,
                        val nameDpdPostamat: Boolean = false,
                        val nameRussianPost: Boolean = false,
                        val nameBothDpd: Boolean = false,
                        val nameAllDeliveries: Boolean = true)

data class SizeTemplate(val oneSize: Boolean = true)
data class DeliveryTemplate(val dpdCourier: Boolean = false,
                            val dpdPostamat: Boolean = false,
                            val russianPost : Boolean = false,
                            val both: Boolean = false,
                            val allDeliveries: Boolean = true)

data class UserTemplate(val user: User)


fun BaseTestClass.addProductByTemplate(template: CreateProductTemplate) {
    onboardingInterface.waitThenCloseOnBoardingPage()
    loginInterface.login(template.userTemplate.user)
    tapeInterface.closeTooltips()
    bottomToolbarInterface.clickAddProduct()
    addPhotoFromGalleryInterface.addPhoto()
    addProductInterface.closeTooltips()
    addProductInterface.swipeToTop()
    addProductInterface.clickAddPhoto()
    if (template.usePhoto) {
        for (i in 0..2) {
            addProductInterface.clickAddPhoto()
            addPhotoFromGalleryInterface.addPhoto()
        }
    }
    if (template.useCategory) {
        addProductInterface.clickCategory()
        categoryInterface.womensWardrobe()
        categoryInterface.chooseAccessoriesCategory()
        categoryInterface.chooseAccessoriesCategory()
    }
    if (template.useSize) {
        if (template.sizeTemplate.oneSize) {
            addProductInterface.clickSize()
            sizeInterface.chooseOneSize()
        } else {
            addProductInterface.clickSize()
            sizeInterface.chooseMultiSize()
        }
    }
    if (template.useBrand) {
        addProductInterface.clickBrands()
        brandsInterface.chooseBrand()
    }
    if (template.useCondition) {
        addProductInterface.swipeToCondition()
        addProductInterface.clickCondition()
        conditionInterface.clickNew()
    }
    if (template.usePurchasePriceAndSellingPrice) {
        addProductInterface.swipeToPurchasePrice()
        addProductInterface.setPurchasePrice()
        addProductInterface.clickEnter()
        addProductInterface.setSellingPrise()
    }
    if (template.useLocation) {
        addProductInterface.clickLocation()
        locationInterface.waitSearchField()
        locationInterface.clickSearchField()
        locationInterface.enterCity()
        locationInterface.clickByFirstCity()
    }
    addProductInterface.swipeToTop()
    if (template.itemAndDescription.nameDpdCourier) {
        addProductInterface.setProductNameCourier()

    } else if (template.itemAndDescription.nameDpdPostamat) {
        addProductInterface.setProductNamePostamat()
    } else if (template.itemAndDescription.nameBothDpd) {
        addProductInterface.setproductNameBothDeliveries()
    } else if (template.itemAndDescription.nameRussianPost) {
        addProductInterface.setProductName_RussianPost()
    } else if (template.itemAndDescription.nameAllDeliveries) {
        addProductInterface.setProductNameAllDeliveryes()
    }
    addProductInterface.clickEnter()
    addProductInterface.sendKeysToProductDescriptionField()
    addProductInterface.closeKeyboard()

    if (template.useDelivery) {
        if (template.deliveryTemplate.dpdCourier) {
            addProductInterface.swipeToDpdCourier()
            addProductInterface.clickBySwitchAllShippingMethods()
            addProductInterface.clickDpdCourier()
        } else if (template.deliveryTemplate.dpdPostamat) {
            addProductInterface.swipeToDpdPostamat()
            addProductInterface.clickBySwitchAllShippingMethods()
            addProductInterface.clickDpdPostamat()
        } else if (template.deliveryTemplate.russianPost) {
            addProductInterface.swipeToRussianPost()
            addProductInterface.clickBySwitchAllShippingMethods()
            addProductInterface.clickRussianPost()
        } else if (template.deliveryTemplate.both) {
            addProductInterface.swipeToDpdCourier()
            addProductInterface.clickBySwitchAllShippingMethods()
            addProductInterface.clickDpdCourier()
            addProductInterface.swipeToDpdPostamat()
            addProductInterface.clickDpdPostamat()
            /*addProductInterface.swipeToRussianPost()
            addProductInterface.clickRussianPost()*/
        } else if (template.deliveryTemplate.russianPost) {

        }
        addProductInterface.clickPublish()
    }
}