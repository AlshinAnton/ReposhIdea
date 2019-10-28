package Pages.IOSPages.model



/*
data class CreateProductTemplateIOS(val usePhoto: Boolean = false,
                                    val useItemNameAndDescription: Boolean = false,
                                    val useCategory: Boolean = false,
                                    val useSize: Boolean = false,
                                    val sizeTemplate: SizeTemplateIOS = SizeTemplateIOS(),
                                    val useBrand: Boolean = false,
                                    val useCondition: Boolean = false,
                                    val usePurchasePriceAndSellingPrice: Boolean = false,
                                    val useLocation: Boolean = false,
                                    val useDelivery: Boolean = false,
                                    val deliveryTemplate: DeliveryTemplateIOS = DeliveryTemplateIOS(),
                                    val dpdCurier: DpdCourierTemplateIOS = DpdCourierTemplateIOS(),
                                    val useTariff: Boolean = false)

data class SizeTemplateIOS(val oneSize: Boolean = true)
data class DeliveryTemplateIOS(val dpdCourier: DpdCourierTemplateIOS? = null,
                            val dpdPostamat: DpdPostamatTemplateIOS? = null) {

    enum class Tariff {
        MINI,
        CLASSIC,
        MAX,
        SUPER_MAX
    }

}

data class DpdPostamatTemplateIOS(val tariff: DeliveryTemplateIOS.Tariff = DeliveryTemplateIOS.Tariff.MINI,
                                  val address: Boolean = true)


data class DpdCourierTemplateIOS(val tariff: DeliveryTemplateIOS.Tariff = DeliveryTemplateIOS.Tariff.MINI,
                                 val packToBox: Boolean = true,
                                 val address: Boolean = true)

fun BaseTestClass.addProductByTemplateIOS(template: CreateProductTemplateIOS) {
    var indexAddPhotoID = 0
    onboardingInterface.waitThenCloseOnBoardingPage()
    loginInterface.loginAsTester9()
    bottomToolbarInterface.clickAddProduct()
    if (template.usePhoto) {
        for (i in 0..3) {
            addProductInterface.clickAddPhoto()*/
/*clickAddPhotoIOS(indexAddPhotoID)*//*

            addPhotoFromGalleryInterface.addPhoto()
            indexAddPhotoID++
        }
    }
    if (template.useItemNameAndDescription) {
        addProductInterface.setProductName()
        addProductInterface.clickEnter()
        addProductInterface.sendKeysToProductDescriptionField()
        addProductInterface.closeKeyboard()
    }
    if (template.useCategory) {
        addProductInterface.clickCategory()
        categoryInterface.womensWardrobe()
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
        locationInterface.waitLocationPage()
        locationInterface.clickDone()
    }
    if (template.useDelivery) {
        deliveryInterface.waitDeliveryScreen()
        if (template.deliveryTemplate.dpdCourier != null) {
            deliveryInterface.clickDpdСourier()
            if (template.useTariff) {
                deliveryInterface.clickChooseRateCourier()
                deliveryInterface.waitChooseRateScreen()

                when (template.deliveryTemplate.dpdCourier.tariff) {
                    DeliveryTemplateIOS.Tariff.MINI -> deliveryInterface.chooseRateMINI()
                    DeliveryTemplateIOS.Tariff.CLASSIC -> deliveryInterface.chooseRateCLASSIC()
                    DeliveryTemplateIOS.Tariff.MAX -> deliveryInterface.chooseRateMAX()
                    DeliveryTemplateIOS.Tariff.SUPER_MAX -> deliveryInterface.chooseRateSUPERMAX()
                }
            }
            if (template.deliveryTemplate.dpdCourier.address) {
                deliveryInterface.clickChooseAddressCourier()
                deliveryInterface.waitChooseAddressCourierScreen()
                deliveryInterface.chooseMainAddress()
            }
            if (template.deliveryTemplate.dpdCourier.packToBox) {
                deliveryInterface.switchPackToBox()
            }
        } else if (template.deliveryTemplate.dpdPostamat != null) {
            deliveryInterface.clickDpdPostamat()
            if (template.useTariff) {
                deliveryInterface.clickChooseRatePostamat()
                deliveryInterface.waitChooseRateScreen()

                when (template.deliveryTemplate.dpdPostamat.tariff) {
                    DeliveryTemplateIOS.Tariff.MINI -> deliveryInterface.chooseRateMINI()
                    DeliveryTemplateIOS.Tariff.CLASSIC -> deliveryInterface.chooseRateCLASSIC()
                    DeliveryTemplateIOS.Tariff.MAX -> deliveryInterface.chooseRateMAX()
                    DeliveryTemplateIOS.Tariff.SUPER_MAX -> deliveryInterface.chooseRateSUPERMAX()
                }
            }
            if (template.deliveryTemplate.dpdPostamat.address) {
                deliveryInterface.clickChooseAdressPostamat()
                deliveryInterface.waitChooseAddressPostamatScreen()
                deliveryInterface.choosePostamatAddress()
            }
        }
        deliveryInterface.clickConfirm()
    } else {
    }
}*/
