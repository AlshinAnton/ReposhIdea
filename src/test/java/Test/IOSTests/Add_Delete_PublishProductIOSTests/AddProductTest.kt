package Test.IOSTests.Add_Delete_PublishProductIOSTests

import AppiumSupport.BaseTestClass


class AddProductTest : BaseTestClass() {
    //Добавление товара все поля заполнены, один размер, доставка Dpd курьер с коробкой
    /*@Test
    //@DisplayName("Add product with settings = one size and Dpd courier")
    fun publishProductWithOneSizeDpdCourierTest() {
        val createProductTemplate = CreateProductTemplateIOS(
                usePhoto = true,
                itemAndDescription = true,
                useCategory = true,
                useSize = true,
                useBrand = true,
                useCondition = true,
                usePurchasePriceAndSellingPrice = true,
                useLocation = true,
                useDelivery = true,
                useTariff = true,
                sizeTemplate = SizeTemplateIOS(oneSize = true),
                deliveryTemplate = DeliveryTemplateIOS(dpdCourier = DpdCourierTemplateIOS())
        )
        addProductByTemplateIOS(createProductTemplate)
        publish()
    }

    //Добавление товара все поля заполнены, несколько размеров , доставка Dpd курьер с коробкой
    @Test
    //@DisplayName("Add product with settings = multiple size and Dpd courier")
    fun publishProductWithMultiSizeDpdCourierTest() {
        val createProductTemplate = CreateProductTemplateIOS(
                usePhoto = true,
                itemAndDescription = true,
                useCategory = true,
                useSize = true,
                useBrand = true,
                useCondition = true,
                usePurchasePriceAndSellingPrice = true,
                useLocation = true,
                useDelivery = true,
                useTariff = true,
                sizeTemplate = SizeTemplateIOS(oneSize = false),
                deliveryTemplate = DeliveryTemplateIOS(dpdCourier = DpdCourierTemplateIOS())
        )
        addProductByTemplateIOS(createProductTemplate)
        publish()
    }

    @Test
    //@DisplayName("Add product with settings = one size and Postamat")
    fun publishProductWithOneSizePostamatTest() {
        val createProductTemplate = CreateProductTemplateIOS(
                usePhoto = true,
                itemAndDescription = true,
                useCategory = true,
                useSize = true,
                useBrand = true,
                useCondition = true,
                usePurchasePriceAndSellingPrice = true,
                useLocation = true,
                useDelivery = true,
                useTariff = true,
                sizeTemplate = SizeTemplateIOS(oneSize = true),
                deliveryTemplate = DeliveryTemplateIOS(dpdPostamat = DpdPostamatTemplateIOS())
        )
        addProductByTemplateIOS(createProductTemplate)
        publish()
    }

    @Test
    //@DisplayName("Publish product with settings = multiple size and Dpd postamat")
    fun publishProductWithMultiSizePostamatTest() {
        val createProductTemplate = CreateProductTemplateIOS(
                usePhoto = true,
                itemAndDescription = true,
                useCategory = true,
                useSize = true,
                useBrand = true,
                useCondition = true,
                usePurchasePriceAndSellingPrice = true,
                useLocation = true,
                useDelivery = true,
                useTariff = true,
                sizeTemplate = SizeTemplateIOS(oneSize = false),
                deliveryTemplate = DeliveryTemplateIOS(dpdPostamat = DpdPostamatTemplateIOS())
        )
        addProductByTemplateIOS(createProductTemplate)
        publish()
    }

    //Публикация товара с обязательными полями (без бренда, цвета, состояния, местоположения и доставки)
    @Test
    //@DisplayName("Publish product only with necessary fields = photo, name, description, category, size")
    fun publishProductWithDPDCourier() {
        val createProductTemplate = CreateProductTemplateIOS(
                usePhoto = true,
                itemAndDescription = true,
                useCategory = true,
                useSize = true,
                useBrand = false,
                useCondition = false,
                usePurchasePriceAndSellingPrice = true,
                useLocation = false,
                useDelivery = false,
                useTariff = false,
                sizeTemplate = SizeTemplateIOS(oneSize = true)
        )
        addProductByTemplateIOS(createProductTemplate)
        publish()
    }

    @Test
    //@DisplayName("Add product without photo")
    fun addProductWithoutPhoto() {
        val createProductTemplate = CreateProductTemplateIOS(
                usePhoto = false,
                itemAndDescription = true,
                useCategory = true,
                useSize = true,
                useBrand = false,
                useCondition = false,
                usePurchasePriceAndSellingPrice = true,
                useLocation = false,
                useDelivery = false,
                useTariff = false
        )
        addProductByTemplateIOS(createProductTemplate)
        assertErrorPhotoMessage()
    }

    @Test
    //@DisplayName("Add product without price")
    fun addProductWithoutPrice() {
        val createProductTemplate = CreateProductTemplateIOS(
                usePhoto = true,
                itemAndDescription = true,
                useCategory = true,
                useSize = true,
                useBrand = false,
                useCondition = false,
                usePurchasePriceAndSellingPrice = false,
                useLocation = false,
                useDelivery = false,
                useTariff = false
        )
        addProductByTemplateIOS(createProductTemplate)
        assertErrorPriceMessage()
    }

    private fun assertErrorPriceMessage() {
        addProductInterface.clickPublish()
        addProductInterface.assertNoPriceErrorMessage()
    }

    private fun assertErrorPhotoMessage() {
        addProductInterface.clickPublish()
        addProductInterface.assertNoPhotoErrorMessage()
    }

    private fun publish() {
        addProductInterface.clickPublish()
        addProductOrDraftConfirmationInterface.clickMoveToMyProductsOrDrafts()
        myProductsInterface.setInitialProductName(addProductInterface.productName)
        myProductsInterface.searchAddedProductInMyProducts()
        productCardInterface.waitMessageOnModeration()
    }*/
}
