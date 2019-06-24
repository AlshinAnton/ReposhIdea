package Pages.IOSPages.AddProduct;

import AndroidAndIOSHelpers.IOSBaseClass;
import Interface.AddProductInterface;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class AddProductPageIOS extends IOSBaseClass implements AddProductInterface {

    public AddProductPageIOS(AppiumDriver driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    String random = String.valueOf((int) (Math.random() * 100) + 1);


    private String tooltip1ID = "hintControllerTultipNo0TestId";
    private String tooltip2ID = "hintControllerTultipNo1TestId";
    private String tooltip3ID = "hintControllerTultipNo2TestId";

    private String addPhotoID = "ui_test_id_add_product_add_photo_button_";
    private String productNameFieldsID = "nameFieldId";
    private String productDescriptionFieldsID = "descriptionFieldId";
    private String categoryID = "com.reposh.dev:id/category_ttv";
    private String sizeID = "com.reposh.dev:id/size_ttv";
    private String brandsID = "com.reposh.dev:id/brand_ttv";
    private String colorID = "com.reposh.dev:id/layout_color";
    private String conditionID = "com.reposh.dev:id/condition_ttv";
    private String purchasePriceID = "com.reposh.dev:id/edit_text";
    private String sellPriceID = "sellPriceFieldId";
    private String oldSellPrice = "oldSellPriceFieldId";
    private String mamsyProtectSwitchID = "com.reposh.dev:id/protectSwitch";
    private String chooseDeliveryID = "com.reposh.dev:id/edit_text";
    private String saveToDraftBtnID = "com.reposh.dev:id/postAsDraftBtn";
    private String deleteBtnID = "com.reposh.dev:id/deleteBtn";


    private String locationID = "com.reposh.dev:id/layout_location";
    private String publishID = "ui_test_id_add_product_top_apply";
    private String reposhProtectID = "Need add reposh protect ID";
    private String deleteConfirmationBtnId = "нужно добавить delete confirmation btn";
    String itemName;

    @Override
    public String getProductName() {
        return itemName;
    }

    @Override
    public void waitAddProductPage() {
        waitIOSViewById(addPhotoID);
    }

    @Override
    public void clickAddPhotoIOS(int indexId) {
        // надо подумать , так как id будет меняться ui_test_id_add_product_add_photo_button_0
        clickViewById(addPhotoID+indexId);
    }

    @Override
    public void clickProductName() {
        clickViewById(productNameFieldsID);
    }


    @Override
    public void clickEnterIOS() {
        clickEnterIOS();
    }

    @Override
    public void sendKeysToProductDescriptionField() {
        sendKeysToIOSElementWithID(productNameFieldsID, "Здесь описание товара !Здесь описание товара !Здесь описание товара !Здесь описание товара !");
    }

    @Override
    public void closeKeyboard() {
        clickEnterIOS();
    }

    @Override
    public void clickCategory() {
        waitIOSViewById(categoryID);
        clickViewById(categoryID);
    }

    @Override
    public void clickSize() {
        waitIOSViewById(sizeID);
        clickViewById(sizeID);
    }

    @Override
    public void clickBrands() {
        waitIOSViewById(brandsID);
        clickViewById(brandsID);
    }

    @Override
    public void clickColor() {
        waitIOSViewById(colorID);
        clickViewById(colorID);
    }

    @Override
    public void swipeToCondition() {
        swipeVertical(conditionID);
    }

    @Override
    public void clickCondition() { clickViewById(conditionID);}

    @Override
    public void swipeToPurchasePrice() {
        swipeVertical(purchasePriceID);
    }

    @Override
    public void swipeToSellingPrice() {
        swipeVertical(sellPriceID);
    }

    @Override
    public void setPurchasePrice() {
        sendKeysToIOSElementWithID(purchasePriceID, "3000");
    }

    @Override
    public void setSellingPrise() {
        sendKeysToIOSElementWithID(
                sellPriceID,"3000");
    }

    @Override
    public void clickLocation() {
        swipeVertical(locationID);
        clickViewById(locationID);
    }

    public void clickBySubsidy() {

    }

    @Override
    public void swipeToSaveToDraft() {
        swipeVertical(saveToDraftBtnID);
    }

    @Override
    public void swipeToDelete() {
        swipeVertical(deleteBtnID);
    }

    @Override
    public void clickPublish() {
        waitIOSViewById(publishID);
        clickViewById(publishID);
    }

    @Override
    public void clickPurchasePrice() {
        clickViewById(purchasePriceID);
    }

    @Override
    public void waitDeleteConfirmationFragment() {
        waitIOSViewById(deleteConfirmationBtnId);
    }

    @Override
    public void clickDeleteConfirm() {
        waitIOSViewById("android:id/button1");
        clickViewById("android:id/button1");
    }

    @Override
    public void clickDelete() {
        clickViewById(deleteBtnID);
    }

    @Override
    public void clickSaveToDraft() {
        clickViewById(saveToDraftBtnID);
    }

    @Override
    public void assertNoPhotoErrorMessage() {
       /* String expectedErMessage = "Как минимум 4 изображения";
        assertWaitChildElementWithIDTemplate(errorPhotoMessageID, expectedErMessage);
        assertTemplateStringsById(errorPhotoMessageID, expectedErMessage, "Сообщение отличается от " + expectedErMessage);*/
    }

    @Override
    public void assertNoPriceErrorMessage() {
       /* String expectedErMessage = "Укажите цену не меньше 300руб";
        assertWaitChildElementWithIDTemplate(errorPriceMessageID, expectedErMessage);
        assertTemplateStringsById(errorPriceMessageID, expectedErMessage, "Сообщение отличается от " + expectedErMessage);*/
    }

    @Override
    public void clickEnter() {

    }

    @Override
    public void clickAddPhoto() {
        clickViewById("ui_test_id_add_product_add_photo_button_0");
    }

    @Override
    public void closeTooltips() {
        waitIOSViewById(tooltip1ID);
        clickViewById(tooltip1ID);
        waitIOSViewById(tooltip2ID);
        clickViewById(tooltip2ID);
        waitIOSViewById(tooltip3ID);
        clickViewById(tooltip3ID);
    }

    @Override
    public void clickDeleteAndroid() {

    }

    @Override
    public void swipeToDpdCourier() {

    }

    @Override
    public void clickDpdCourier() {

    }

    @Override
    public void swipeToDpdPostamat() {

    }

    @Override
    public void clickDpdPostamat() {

    }

    @Override
    public void setProductNameCourier() {

    }

    @Override
    public void setProductNamePostamat() {

    }

    @Override
    public void setproductNameBothDeliveries() {

    }

    @Override
    public void swipeToDescription() {

    }

    @Override
    public void swipeToTop() {

    }
}
