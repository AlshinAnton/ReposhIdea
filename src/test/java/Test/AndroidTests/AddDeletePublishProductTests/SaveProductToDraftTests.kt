package Test.AndroidTests.AddDeletePublishProductTests

import AppiumSupport.BaseTestClass
import Pages.AndroidPages.model.*
import org.junit.Test

class SaveProductToDraftTests : BaseTestClass() {

    /*@Test
    fun saveToDrfatsNoPhoto() {
        val createProductTemplate = CreateProductTemplate(
                usePhoto = true,
                itemAndDescription = NameTemplate(nameDpdPostamat = true),
                useCategory = true,
                useSize = false,
                useBrand = true,
                useCondition = true,
                usePurchasePriceAndSellingPrice = true,
                useLocation = true,
                useDelivery = true,
                useTariff = false,
                sizeTemplate = SizeTemplate(oneSize = true),
                deliveryTemplate = DeliveryTemplate(dpdCourier = true)
        )
        addProductByTemplate(createProductTemplate)
        saveToDrafts()
        deleteItemFromDraft()
    }

    @Test
    fun saveToDrfatsWithNameAndDescription() {
        val createProductTemplate = CreateProductTemplate(
                usePhoto = true,
                itemAndDescription = NameTemplate(nameDpdPostamat = true),
                useCategory = false,
                useSize = false,
                useBrand = false,
                useCondition = false,
                usePurchasePriceAndSellingPrice = false,
                useLocation = false,
                useDelivery = false,
                useTariff = false
        )
        addProductByTemplate(createProductTemplate)
        saveToDrafts()
        deleteItemFromDraft()
    }

    @Test
    fun saveToDrfatsWithCategory() {
        val createProductTemplate = CreateProductTemplate(
                usePhoto = true,
                itemAndDescription = NameTemplate(nameDpdPostamat = true),
                useCategory = true,
                useSize = false,
                useBrand = false,
                useCondition = false,
                usePurchasePriceAndSellingPrice = false,
                useLocation = false,
                useDelivery = false,
                useTariff = false
        )
        addProductByTemplate(createProductTemplate)
        saveToDrafts()
        deleteItemFromDraft()
    }

    /*@Test
    fun saveToDrfatsWithSize() {
        val createProductTemplate = CreateProductTemplate(
                usePhoto = false,
                itemAndDescription = NameTemplate(nameDpdPostamat = true),
                useCategory = true,
                useSize = true,
                useBrand = false,
                useCondition = false,
                usePurchasePriceAndSellingPrice = false,
                useLocation = false,
                useDelivery = false,
                useTariff = false,
                sizeTemplate = SizeTemplate(oneSize = true)
        )
        addProductByTemplate(createProductTemplate)
        saveToDrafts()
        deleteItemFromDraft()
    }*/

    @Test
    fun saveToDrfatsWithBrands() {
        val createProductTemplate = CreateProductTemplate(
                usePhoto = true,
                itemAndDescription = NameTemplate(nameDpdPostamat = true),
                useCategory = false,
                useSize = false,
                useBrand = true,
                useCondition = false,
                usePurchasePriceAndSellingPrice = false,
                useLocation = false,
                useDelivery = false,
                useTariff = false
        )
        addProductByTemplate(createProductTemplate)
        saveToDrafts()
        deleteItemFromDraft()
    }

    @Test
    fun saveToDrfatsWithCondition() {
        val createProductTemplate = CreateProductTemplate(
                usePhoto = true,
                itemAndDescription = NameTemplate(nameDpdPostamat = true),
                useCategory = false,
                useSize = false,
                useBrand = false,
                useCondition = true,
                usePurchasePriceAndSellingPrice = false,
                useLocation = false,
                useDelivery = false,
                useTariff = false
        )
        addProductByTemplate(createProductTemplate)
        saveToDrafts()
        deleteItemFromDraft()
    }

    @Test
    fun saveToDrfatsWithPurchaseAndSalePrice() {
        val createProductTemplate = CreateProductTemplate(
                usePhoto = true,
                itemAndDescription = NameTemplate(nameDpdPostamat = true),
                useCategory = false,
                useSize = false,
                useBrand = false,
                useCondition = true,
                usePurchasePriceAndSellingPrice = false,
                useLocation = false,
                useDelivery = false,
                useTariff = false
        )
        addProductByTemplate(createProductTemplate)
        saveToDrafts()
        deleteItemFromDraft()
    }

    @Test
    fun saveToDrfatsWithLocation() {
        val createProductTemplate = CreateProductTemplate(
                usePhoto = true,
                itemAndDescription = NameTemplate(nameDpdPostamat = true),
                useCategory = true,
                useSize = false,
                useBrand = false,
                useCondition = false,
                usePurchasePriceAndSellingPrice = false,
                useLocation = true,
                useDelivery = false,
                useTariff = false
        )
        addProductByTemplate(createProductTemplate)
        saveToDrafts()
        deleteItemFromDraft()
    }

    @Test
    fun saveToDrfatsWithDpdCourier() {
        val createProductTemplate = CreateProductTemplate(
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
                deliveryTemplate = DeliveryTemplate(dpdCourier = true)
        )
        addProductByTemplate(createProductTemplate)
        saveToDrafts()
        deleteItemFromDraft()
    }*/

    @Test
    fun saveToDrfatsWithDpdPostamat() {
        val createProductTemplate = CreateProductTemplate(
                usePhoto = true,
                itemAndDescription = NameTemplate(nameDpdPostamat = true),
                useCategory = true,
                useSize = false,
                useBrand = true,
                useCondition = true,
                usePurchasePriceAndSellingPrice = true,
                useLocation = true,
                useDelivery = true,
                useTariff = false,
                deliveryTemplate = DeliveryTemplate(dpdPostamat = true)
        )
        addProductByTemplate(createProductTemplate)
        saveToDrafts()
        deleteItemFromDraft()
    }

    @Test
    fun saveToDrfatsWithDpdCourierAndPostamat() {
        val createProductTemplate = CreateProductTemplate(
                usePhoto = true,
                itemAndDescription = NameTemplate(nameBothDpd = true),
                useCategory = true,
                useSize = false,
                useBrand = true,
                useCondition = true,
                usePurchasePriceAndSellingPrice = true,
                useLocation = true,
                useDelivery = true,
                useTariff = false,
                deliveryTemplate = DeliveryTemplate(both = true)
        )
        addProductByTemplate(createProductTemplate)
        saveToDrafts()
        //deleteItemFromDraft()
    }

    private fun saveToDrafts() {
        addProductInterface.swipeToSaveToDraft()
        addProductInterface.clickSaveToDraft()
        addProductOrDraftConfirmationInterface.clickMoveToMyProductsOrDrafts()
    }

    private fun deleteItemFromDraft() {
        myProductsInterface.clickByFirstProduct()
        productCardInterface.waitMenu()
        productCardInterface.clickMenuAction()
        productCardInterface.clickEdit()

        addProductInterface.waitAddProductPage()
        addProductInterface.swipeToDelete()
        addProductInterface.clickDelete()
        addProductInterface.waitDeleteConfirmationFragment()
        addProductInterface.clickDeleteConfirm()

    }
}


//interface AddProductOwner{
//    fun addProductByTemplate(template: CreateProductTemplate)
//}