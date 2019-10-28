/*
package Pages.AndroidPages.model

import com.example.anton.autotestsreposh.AppiumSupport.BaseTestClass

data class BueProductTemplate(val usePhoto: Boolean = false,
                                 val itemAndDescription: Boolean = false,
                                 val useCategory: Boolean = false,
                                 val useSize: Boolean = false,
                                 val sizeTemplate: SizeTemplate = SizeTemplate(),
                                 val useBrand: Boolean = false,
                                 val useCondition: Boolean = false,
                                 val usePurchasePriceAndSellingPrice: Boolean = false,
                                 val useLocation: Boolean = false,
                                 val useDelivery: Boolean = false,
                                 val deliveryTemplate: DeliveryTemplate = DeliveryTemplate(),
                                 val dpdCourier: DpdCourierTemplate = DpdCourierTemplate(),
                                 val both: BothDpdCourierAndPostamat = BothDpdCourierAndPostamat(),
                                 val useTariff: Boolean = false)

data class SizeTemplate(val oneSize: Boolean = true)
data class DeliveryTemplate(val dpdCourier: DpdCourierTemplate? = null,
                            val dpdPostamat: DpdPostamatTemplate? = null,
                            val both: BothDpdCourierAndPostamat? = null)


fun BaseTestClass.bueProductByTemplate(template: BueProductTemplate) {
    onboardingInterface.waitThenCloseOnBoardingPage()
    loginInterface.loginAsTester8()
    tapeInterface.closeTooltips()
    bottomToolbarInterface.clickAddProduct()
    addProductInterface.closeTooltips()
    if (template.usePhoto) {
        for (i in 0..3) {
            addProductInterface.clickAddPhoto()
            addPhotoFromGalleryInterface.addPhoto()
        }
    }
    if (template.itemAndDescription) {
        addProductInterface.setProductName()
        addProductInterface.clickEnter()
        addProductInterface.sendKeysToProductDescriptionField()
        addProductInterface.closeKeyboard()
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
    addProductInterface.swipeToSellingPrice()
    if (template.usePurchasePriceAndSellingPrice) {
        addProductInterface.swipeToPurchasePrice()
        addProductInterface.setPurchasePrice()
        addProductInterface.clickEnter()
        addProductInterface.setSellingPrise()
    }
    if (template.useLocation) {
        addProductInterface.clickLocation()
        locationInterface.waitAndClickRegionField()
        locationInterface.clickSearchField()
        locationInterface.enterCity()
        locationInterface.clickByFirstCity()
    }
    if (template.useDelivery) {
        if (template.deliveryTemplate.dpdCourier != null) {
            addProductInterface.swipeToDpdCourier()
            addProductInterface.clickDpdCourier()
            //deliveryInterface.waitDeliveryScreen()
            */
/*if (template.useTariff) {
                deliveryInterface.clickChooseRateCourier()
                deliveryInterface.waitChooseRateScreen()

                when (template.deliveryTemplate.dpdCourier.tariff) {
                    Tariff.MINI -> deliveryInterface.chooseRateMINI()
                    Tariff.CLASSIC -> deliveryInterface.chooseRateCLASSIC()
                    Tariff.MAX -> deliveryInterface.chooseRateMAX()
                    Tariff.SUPER_MAX -> deliveryInterface.chooseRateSUPERMAX()
                }
            }
            if (template.deliveryTemplate.dpdCourier.address) {
                deliveryInterface.clickChooseAddressCourier()
                deliveryInterface.waitChooseAddressCourierScreen()
                deliveryInterface.chooseMainAddress()
            }
            if (template.deliveryTemplate.dpdCourier.packToBox) {
                deliveryInterface.switchPackToBox()
            }*//*

        } else if (template.deliveryTemplate.dpdPostamat != null) {
            addProductInterface.swipeToDpdPostamat()
            addProductInterface.clickDpdPostamat()
            */
/*if (template.useTariff) {
                deliveryInterface.clickChooseRatePostamat()
                deliveryInterface.waitChooseRateScreen()

                when (template.deliveryTemplate.dpdPostamat.tariff) {
                    Tariff.MINI -> deliveryInterface.chooseRateMINI()
                    Tariff.CLASSIC -> deliveryInterface.chooseRateCLASSIC()
                    Tariff.MAX -> deliveryInterface.chooseRateMAX()
                    Tariff.SUPER_MAX -> deliveryInterface.chooseRateSUPERMAX()
                }
            }
            if (template.deliveryTemplate.dpdPostamat.address) {
                deliveryInterface.clickChooseAdressPostamat()
                deliveryInterface.waitChooseAddressPostamatScreen()
                deliveryInterface.choosePostamatAddress()
            }*//*

        } else if (template.deliveryTemplate.both != null) {
            addProductInterface.swipeToDpdCourier()
            addProductInterface.clickDpdCourier()
            addProductInterface.swipeToDpdPostamat()
            addProductInterface.clickDpdPostamat()
            */
/*deliveryInterface.clickDpdPostamat()
            deliveryInterface.clickDpdСourier()*//*

        }
    }
     else {
    }
    addProductInterface.clickPublish()
}*/
