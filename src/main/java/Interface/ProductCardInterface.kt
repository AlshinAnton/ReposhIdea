package Interface

interface ProductCardInterface {

    val productID: Int
    val productName: String

    fun waitMessageOnModeration()

    fun clickMenuAction()

    fun waitMenu()
    fun clickEdit()
    fun clickShareInTape()
    fun clickShareWith()
    fun getInitialProductID(): Int

    fun assertPublishId()


    fun waitLikeIcon()
    fun clickByLikeIcon()
    fun waitCommentsIcon()
    fun clickByCommentsIcon()
    fun waitShareIcon()
    fun clickByShareIcon()

    fun getCommentsCount()
    fun assertCommentCount()
    fun waitBargain()
    fun clickBargain()
    fun getLikeCountBeforeLike()
    fun assertLikeCount()
    fun swipeToSize()
    fun clickByOneSize()
    fun swipeToBrand()
    fun clickByBrandPastilla()
    fun swipeToColor()
    fun clickByColor()
    fun swipeToCategory()
    fun clickByCategory()
    fun swipeToLocation()
    fun clickByLocation()
    fun swipeToCondition()
    fun clickByCondition()
    fun assertFilter(filter : String)
    fun swipeToConnectWithSeller()
    fun clickConnectWithSeller()
    fun waitId()

    fun waitSendToSoldBtn()
    fun clickSendToSold()
    fun assertSoldStatus()
    fun waitProductName()
    fun getProductName()
    fun clickBack()
    fun assertProductName()
    fun buyItem()
    fun waitAndClickBuyBtn()
}

interface CommentsInterface {
    fun waitinputField()
    fun clickByInputField()
    fun sendKeysToInputField()
    fun sendComment()
    fun clickBack()
}

