package Interface

interface AddingCardInterface {
    fun waitAddingBankCardScreen()
    fun waitFieldCardNumber()
    fun waitFieldValidityCard()
    fun waitFieldCardOwner()
    fun waitFieldCVC()
    fun sendKeysToCardNumberField()
    fun sendKeysToValidityField()
    fun sendKeysToOwnerField()
    fun sendKeysToCVCField()
    fun clickSaveCard()

}