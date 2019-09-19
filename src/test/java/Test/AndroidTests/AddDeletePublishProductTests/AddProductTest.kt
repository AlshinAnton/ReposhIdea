package Test.AndroidTests.AddDeletePublishProductTests

import AppiumSupport.BaseTestClass
import Pages.AndroidPages.LoginAndRegistration.User
import Pages.AndroidPages.model.*
import org.junit.Test


class AddProductTest : BaseTestClass() {

/*    @Test
    //@DisplayName("Publish product only with necessary fields = photo, name, description, brand, category, size")
    fun publishProductWithDPDCourier() {
                val createProductTemplate = CreateProductTemplate(
                        UserTemplate(User.User1()),
                        usePhoto = true,
                        itemAndDescription = NameTemplate(nameDpdCourier = true),
                        useCategory = true,
                        useSize = false,
                        useBrand = true,
                        useCondition = false,
                        usePurchasePriceAndSellingPrice = true,
                        useLocation = true,
                        useDelivery = true,
                        useTariff = false,
                        sizeTemplate = SizeTemplate(oneSize = true),
                        deliveryTemplate = DeliveryTemplate(dpdCourier = true)
                )
                addProductByTemplate(createProductTemplate)
                publish()
    }

    @Test
    //@DisplayName("Publish product only with necessary fields = photo, name, description, brand, category, size")
    fun publishProductWithDPDPostamat() {
        val createProductTemplate = CreateProductTemplate(
                UserTemplate(User.User1()),
                usePhoto = true,
                itemAndDescription = NameTemplate(nameDpdPostamat = true),
                useCategory = true,
                useSize = false,
                useBrand = true,
                useCondition = false,
                usePurchasePriceAndSellingPrice = true,
                useLocation = true,
                useDelivery = true,
                useTariff = false,
                sizeTemplate = SizeTemplate(oneSize = true),
                deliveryTemplate = DeliveryTemplate(dpdPostamat = true)
        )
        addProductByTemplate(createProductTemplate)
        publish()
    }

    @Test
    //@DisplayName("Publish product only with necessary fields = photo, name, description, brand, category, size")
    fun publishProductWithBOTHDeliveries() {
        val createProductTemplate = CreateProductTemplate(
                UserTemplate(User.User1()),
                usePhoto = true,
                itemAndDescription = NameTemplate(nameBothDpd = true),
                useCategory = true,
                useSize = false,
                useBrand = true,
                useCondition = false,
                usePurchasePriceAndSellingPrice = true,
                useLocation = true,
                useDelivery = true,
                useTariff = false,
                sizeTemplate = SizeTemplate(oneSize = true),
                deliveryTemplate = DeliveryTemplate(both = true)
        )
        addProductByTemplate(createProductTemplate)
        publish()
    }*/

    @Test
    //@DisplayName("Publish product only with necessary fields = photo, name, description, brand, category, size")
    fun publishProductWithRussianPost() {
        val createProductTemplate = CreateProductTemplate(
                UserTemplate(User.User1()),
                usePhoto = true,
                itemAndDescription = NameTemplate(nameRussianPost = true),
                useCategory = true,
                useSize = false,
                useBrand = true,
                useCondition = false,
                usePurchasePriceAndSellingPrice = true,
                useLocation = true,
                useDelivery = true,
                useTariff = false,
                sizeTemplate = SizeTemplate(oneSize = true),
                deliveryTemplate = DeliveryTemplate(russianPost = true)
        )
        addProductByTemplate(createProductTemplate)
        publish()
    }

    @Test
    //@DisplayName("Publish product only with necessary fields = photo, name, description, brand, category, size")
    fun publishProductWithAllDeliveries() {
        val createProductTemplate = CreateProductTemplate(
                UserTemplate(User.User1()),
                usePhoto = true,
                itemAndDescription = NameTemplate(nameAllDeliveries = true),
                useCategory = true,
                useSize = false,
                useBrand = true,
                useCondition = false,
                usePurchasePriceAndSellingPrice = true,
                useLocation = true,
                useDelivery = true,
                useTariff = false,
                sizeTemplate = SizeTemplate(oneSize = true),
                deliveryTemplate = DeliveryTemplate(allDeliveries = true)
        )
        addProductByTemplate(createProductTemplate)
        publish()
    }

    /*@Test
     fun checkDeleteField() {
        val createProductTemplate = CreateProductTemplate(
                usePhoto = false,
                useCategory = true,
                useSize = false,
                useBrand = true,
                useCondition = false,
                itemAndDescription = NameTemplate(nameDpdCourier = true)
        )
        addProductByTemplate(createProductTemplate)
        publish()
    }*/

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
    }
}
