package Test.IOSTests.Add_Delete_PublishProductIOSTests

import AppiumSupport.BaseTestClass

class SaveProductToDraftTests : BaseTestClass()
//        AddProductOwner
{

    /*@Test
    fun saveToDrfatsWithAllFields() {
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
        saveToDrafts()
    }

    @Test
    fun saveToDrfatsNoPhoto() {
        val createProductTemplate = CreateProductTemplateIOS(
                usePhoto = false,
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
        saveToDrafts()
        deleteItemFromDraft()
    }

    @Test
    fun saveToDrfatsWithNameAndDescription() {
        val createProductTemplate = CreateProductTemplateIOS(
                usePhoto = false,
                itemAndDescription = true,
                useCategory = false,
                useSize = false,
                useBrand = false,
                useCondition = false,
                usePurchasePriceAndSellingPrice = false,
                useLocation = false,
                useDelivery = false,
                useTariff = false
        )
        addProductByTemplateIOS(createProductTemplate)
        saveToDrafts()
        deleteItemFromDraft()
    }

    @Test
    fun saveToDrfatsWithCategory() {
        val createProductTemplate = CreateProductTemplateIOS(
                usePhoto = false,
                itemAndDescription = false,
                useCategory = true,
                useSize = false,
                useBrand = false,
                useCondition = false,
                usePurchasePriceAndSellingPrice = false,
                useLocation = false,
                useDelivery = false,
                useTariff = false
        )
        addProductByTemplateIOS(createProductTemplate)
        saveToDrafts()
        deleteItemFromDraft()
    }

    @Test
    fun saveToDrfatsWithSize() {
        val createProductTemplate = CreateProductTemplateIOS(
                usePhoto = false,
                itemAndDescription = false,
                useCategory = true,
                useSize = true,
                useBrand = false,
                useCondition = false,
                usePurchasePriceAndSellingPrice = false,
                useLocation = false,
                useDelivery = false,
                useTariff = false,
                sizeTemplate = SizeTemplateIOS(oneSize = true)
        )
        addProductByTemplateIOS(createProductTemplate)
        saveToDrafts()
        deleteItemFromDraft()
    }

    @Test
    fun saveToDrfatsWithBrands() {
        val createProductTemplate = CreateProductTemplateIOS(
                usePhoto = false,
                itemAndDescription = false,
                useCategory = false,
                useSize = false,
                useBrand = true,
                useCondition = false,
                usePurchasePriceAndSellingPrice = false,
                useLocation = false,
                useDelivery = false,
                useTariff = false
        )
        addProductByTemplateIOS(createProductTemplate)
        saveToDrafts()
        deleteItemFromDraft()
    }

    @Test
    fun saveToDrfatsWithCondition() {
        val createProductTemplate = CreateProductTemplateIOS(
                usePhoto = false,
                itemAndDescription = false,
                useCategory = false,
                useSize = false,
                useBrand = false,
                useCondition = true,
                usePurchasePriceAndSellingPrice = false,
                useLocation = false,
                useDelivery = false,
                useTariff = false
        )
        addProductByTemplateIOS(createProductTemplate)
        saveToDrafts()
        deleteItemFromDraft()
    }

    @Test
    fun saveToDrfatsWithPurchaseAndSalePrice() {
        val createProductTemplate = CreateProductTemplateIOS(
                usePhoto = false,
                itemAndDescription = false,
                useCategory = false,
                useSize = false,
                useBrand = false,
                useCondition = true,
                usePurchasePriceAndSellingPrice = false,
                useLocation = false,
                useDelivery = false,
                useTariff = false
        )
        addProductByTemplateIOS(createProductTemplate)
        saveToDrafts()
        deleteItemFromDraft()
    }

    @Test
    fun saveToDrfatsWithLocation() {
        val createProductTemplate = CreateProductTemplateIOS(
                usePhoto = false,
                itemAndDescription = false,
                useCategory = false,
                useSize = false,
                useBrand = false,
                useCondition = false,
                usePurchasePriceAndSellingPrice = false,
                useLocation = true,
                useDelivery = false,
                useTariff = false
        )
        addProductByTemplateIOS(createProductTemplate)
        saveToDrafts()
        deleteItemFromDraft()
    }

    @Test
    fun saveToDrfatsWithDpdCourier() {
        val createProductTemplate = CreateProductTemplateIOS(
                usePhoto = false,
                itemAndDescription = false,
                useCategory = false,
                useSize = false,
                useBrand = false,
                useCondition = false,
                usePurchasePriceAndSellingPrice = false,
                useLocation = true,
                useDelivery = false,
                useTariff = false,
                deliveryTemplate = DeliveryTemplateIOS(dpdCourier = DpdCourierTemplateIOS())
        )
        addProductByTemplateIOS(createProductTemplate)
        saveToDrafts()
        deleteItemFromDraft()
    }

    @Test
    fun saveToDrfatsWithDpdPostamat() {
        val createProductTemplate = CreateProductTemplateIOS(
                usePhoto = false,
                itemAndDescription = false,
                useCategory = false,
                useSize = false,
                useBrand = false,
                useCondition = true,
                usePurchasePriceAndSellingPrice = false,
                useLocation = false,
                useDelivery = false,
                useTariff = false,
                deliveryTemplate = DeliveryTemplateIOS(dpdPostamat = DpdPostamatTemplateIOS())
        )
        addProductByTemplateIOS(createProductTemplate)
        saveToDrafts()
        deleteItemFromDraft()
    }


    private fun saveToDrafts() {
        addProductInterface.swipeToSaveToDraft()
        addProductInterface.clickSaveToDraft()
        addProductOrDraftConfirmationInterface.clickMoveToMyProductsOrDrafts()
    }

    private fun deleteItemFromDraft() {
        myProductsInterface.clickByFirstProduct()
        productCardInterface.clickMenuAction()
        productCardInterface.waitMenu()

        productCardInterface.clickEdit()

        addProductInterface.waitAddProductPage()
        addProductInterface.swipeToDelete()
        addProductInterface.clickDelete()
        addProductInterface.waitDeleteConfirmationFragment()
        addProductInterface.clickDeleteConfirm()

    }*/
}


//interface AddProductOwner{
//    fun addProductByTemplate(template: CreateProductTemplate)
//}