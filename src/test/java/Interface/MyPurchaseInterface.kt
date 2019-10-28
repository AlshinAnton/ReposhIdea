package Interface

interface MyPurchaseInterface {
    fun waitCurrentPurchaseScreen()
    fun swipeToCompletedPurchase()
    fun waitCompletedPurchase()
}

interface MyPurchaseMethodsInterface {
    fun waitMyPurchaseMethodsScreen()
    fun clickByAddBankCard()
    fun assertNameInCard()
    fun assertCardExpireDate()
    fun assertCardNumber()
}