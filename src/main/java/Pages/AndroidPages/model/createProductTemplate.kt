package Pages.AndroidPages.model

import AppiumSupport.BaseTestClass

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
                        val nameBothDpd: Boolean = false)

data class SizeTemplate(val oneSize: Boolean = true)
data class DeliveryTemplate(val dpdCourier: Boolean = false,
                            val dpdPostamat: Boolean = false,
                            val both: Boolean = false)

data class UserTemplate(val user: User)

sealed class User constructor(
        open val phone: String,
        open val code: String) {

    class User1(override val phone: String = "9111111111",
                override val code: String = "7642") : User(phone, code)

    class User2(override val phone: String = "9222222222",
                 override val code: String = "7642") : User(phone, code)

    class User3(override val phone: String = "9333333333",
                 override val code: String = "7642") : User(phone, code)

    class User4(override val phone: String = "9444444444",
                 override val code: String = "7642") : User(phone, code)

    class User7(override val phone: String = "9777777777",
                 override val code: String = "4315") : User(phone, code)

    class User8(override val phone: String = "9888888888",
                 override val code: String = "4315") : User(phone, code)

    class User9(override val phone: String = "9999999999",
                 override val code: String = "4315") : User(phone, code)
}


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
    }
    addProductInterface.clickEnter()
    addProductInterface.sendKeysToProductDescriptionField()
    addProductInterface.closeKeyboard()

    if (template.useDelivery) {
        if (template.deliveryTemplate.dpdCourier) {
            addProductInterface.swipeToDpdCourier()
            addProductInterface.clickDpdCourier()
        } else if (template.deliveryTemplate.dpdPostamat) {
            addProductInterface.swipeToDpdPostamat()
            addProductInterface.clickDpdPostamat()
        } else if (template.deliveryTemplate.both) {
            addProductInterface.swipeToDpdCourier()
            addProductInterface.clickDpdCourier()
            addProductInterface.swipeToDpdPostamat()
            addProductInterface.clickDpdPostamat()
        } else {
        }
        addProductInterface.clickPublish()
    }
}