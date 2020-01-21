package Pages.AndroidPages.AddProduct;

import AndroidAndIOSHelpers.AndroidBaseClass;
import Interface.AddProductInterface;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.support.PageFactory;
import java.util.Random;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;


public class AddProductScreen extends AndroidBaseClass implements AddProductInterface {

    public AddProductScreen(AppiumDriver driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    String random = String.valueOf((int) (Math.random() * 1000) + 1);
    private String errorPriceMessageID = "com.reposh.dev:id/helper_tv";
    private String errorPhotoMessageID = "com.reposh.dev:id/tv_error";
    private String tooltipID = "com.reposh.dev:id/tooltipText";
    private String addPhotoID = "com.reposh.dev:id/iv_add_photo";
    private String productNameAndDescriptionFieldsID = "com.reposh.dev:id/edit_text";
    private String categoryID = "com.reposh.dev:id/category_ttv";
    private String sizeID = "com.reposh.dev:id/size_ttv";
    private String brandsID = "com.reposh.dev:id/brand_ttv";
    private String colorID = "com.reposh.dev:id/layout_color";
    private String conditionID = "com.reposh.dev:id/condition_ttv";
    private String mamsyProtectSwitchID = "com.reposh.dev:id/protectSwitch";
    private String chooseDeliveryID = "com.reposh.dev:id/edit_text";
    private String saveToDraftBtnID = "com.reposh.dev:id/postAsDraftBtn";
    private String deleteBtnID = "com.reposh.dev:id/deleteBtn";
    private String deleteIconFromField = "com.reposh.dev:id/clearBtn";
    private String allShippingSwitchId = "com.reposh.dev:id/allShippingMethodsSwitch";


    @NonNls
    private String locationID = "com.reposh.dev:id/layout_location";
    private String publishID = "";
    String itemName;

    private String dpdCourierTxt = "Курьер Dpd";
    private String dpdPostamatTxt = "ПВЗ";
    private String russianPostText = "Отделение Почты России";
    private String subsidyTooglId = "com.reposh.dev:id/toggle";




    public static String[] generateRandomWords(int numberOfWords)
    {
        String[] randomStrings = new String[numberOfWords];
        Random random = new Random();
        for(int i = 0; i < numberOfWords; i++)
        {
            char[] word = new char[random.nextInt(8)+3]; // words of length 3 through 10. (1 and 2 letter words are boring.)
            for(int j = 0; j < word.length; j++)
            {
                word[j] = (char)('a' + random.nextInt(26));
            }
            randomStrings[i] = new String(word);
        }
        return randomStrings;
    }

    @NotNull
    @Override
    public String getProductName() {
        return itemName;
    }

    @Override
    public void waitAddProductPage() {
        isVisibleID(addPhotoID);
    }

    @Override
    public void clickAddPhoto() {
        swipeVerticalToElementWithText("Фото товара");
        waitAndClickAndroidElementByID(addPhotoID);
    }

    @Override
    public void clickProductName() {
        if (productNameAndDescriptionFieldsID.equals("")) {
            clickAndroidElementByIDAndInstance(productNameAndDescriptionFieldsID, 4);
        } else {
            waitAndClickAndroidElementByID(deleteIconFromField);
            clickAndroidElementByIDAndInstance(productNameAndDescriptionFieldsID, 4);
        }
    }

    @Override
    public void clickEnter() {
        clickEnter(AndroidKeyCode.KEYCODE_ENTER);
    }

    @Override
    public void sendKeysToProductDescriptionField() {
        clickAndroidElementByIDAndInstance(productNameAndDescriptionFieldsID,5);
        sendKeysToAndroidElementByIDAndInstance(
                productNameAndDescriptionFieldsID,
                5,
                "Здесь описание товара !Здесь описание товара !Здесь описание товара !Здесь описание товара !");
    }

    @Override
    public void closeKeyboard() {
        clickEnter(AndroidKeyCode.KEYCODE_BACK);
    }

    @Override
    public void clickCategory() {
        swipeVerticalToElementWithText("Категория");
        waitAndClickAndroidElementByID(categoryID);
    }

    @Override
    public void clickSize() {
        waitAndClickAndroidElementByID(sizeID);
    }

    @Override
    public void clickBrands() {
        swipeVerticalToElementWithText("Бренд");
        waitAndClickAndroidElementByID(brandsID);
    }

    @Override
    public void clickColor() {
        waitAndClickAndroidElementByID(colorID);
    }

    @Override
    public void swipeToCondition() {
        swipeVerticalToElementWithText("Состояние");
    }

    @Override
    public void clickCondition() { clickAndroidElementByText("Состояние");}

    @Override
    public void swipeToPurchasePrice() {
        swipeVerticalToElementWithText("Вы купили за");
    }

    @Override
    public void swipeToSellingPrice() {
        swipeVerticalToElementWithText("Стоимость продажи");
    }

    @Override
    public void setPurchasePrice() {
        swipeToSaveToDraft();
        sendKeysTo2StageChildElementWithIds(
                "com.reposh.dev:id/buyForTv",
                "com.reposh.dev:id/text_il",
                "com.reposh.dev:id/edit_text",
                "5000");
    }

    @Override
    public void setSellingPrise() {
        sendKeysTo2StageChildElementWithIds(
                "com.reposh.dev:id/sellForTv",
                "com.reposh.dev:id/text_il",
                "com.reposh.dev:id/edit_text",
                "3000");
    }

    @Override
    public void clickLocation() {
        //swipeVerticalToElementWithTextAndClick("Город");
        swipeVerticalToElementWithText("Город");
        waitAndClickAndroidElementByID("com.reposh.dev:id/cityTv");
    }

    @Override
    public void clickBySubsidy() {
        swipeVerticalToElementWithText("Доставка за мой счет");
        waitAndClickAndroidElementByID(subsidyTooglId);
    }

    @Override
    public void swipeToSaveToDraft() {
        swipeVerticalToElementWithText("Сохранить черновик");
    }

    @Override
    public void swipeToDelete() {
        swipeVerticalToElementWithText("Удалить");
    }

    @Override
    public void clickPublish() {
        swipeVerticalToElementWithText("Опубликовать");
        clickAndroidElementByText("Опубликовать");
    }

    @Override
    public void clickPurchasePrice() {
       clickAndroidElementByText("Вы купили за");
    }

    @Override
    public void waitDeleteConfirmationFragment() {
        waitANDROIDElementByTEXT("Вы действительно хотите удалить товар?");
    }

    @Override
    public void clickDeleteConfirm() {
        waitAndClickAndroidElementByID("android:id/button1");
    }

    @Override
    public void clickDelete() {
        clickAndroidElementByText("Удалить");
    }

    @Override
    public void clickSaveToDraft() {
        clickAndroidElementByText("Сохранить черновик");
    }

    @Override
    public void assertNoPhotoErrorMessage() {
        String expectedErMessage = "Как минимум 4 изображения";
        assertWaitChildElementWithIDTemplate(errorPhotoMessageID, expectedErMessage);
        assertTemplateStringsById(errorPhotoMessageID, expectedErMessage, "Сообщение отличается от " + expectedErMessage);
    }

    @Override
    public void assertNoPriceErrorMessage() {
        String expectedErMessage = "Укажите цену не меньше 300руб";
        assertWaitChildElementWithIDTemplate(errorPriceMessageID, expectedErMessage);
        assertTemplateStringsById(errorPriceMessageID, expectedErMessage, "Сообщение отличается от " + expectedErMessage);
    }

    @Override
    public void clickAddPhotoIOS(int i) {

    }

    @Override
    public void closeTooltips() {
        for (int i = 0; i <2 ; i++) {
            try {
                waitAndClickAndroidElementByID(tooltipID);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void clickDeleteAndroid() {
        clickEnter(AndroidKeyCode.DEL);
    }

    @Override
    public void swipeToDpdCourier() {
        swipeVerticalToElementWithText(dpdCourierTxt);
    }

    @Override
    public void clickDpdCourier() {
        clickAndroidElementByText(dpdCourierTxt);
    }

    @Override
    public void swipeToDpdPostamat() {
        swipeVerticalToElementWithText(dpdPostamatTxt);
    }

    @Override
    public void clickDpdPostamat() {
        clickAndroidElementByText(dpdPostamatTxt);
    }

    @Override
    public void swipeToRussianPost() {
        swipeVerticalToElementWithText(russianPostText);
    }

    @Override
    public void clickRussianPost() {
        clickAndroidElementByText(russianPostText);
    }

    @Override
    public void setProductNameCourier() {
        itemName = "Товар с доставкой курьер";
        //swipeVerticalToElementWithText("Фото товара");
        clickProductName();
        sendKeysToAndroidElementByIDAndInstance(productNameAndDescriptionFieldsID, 4, itemName);
        //sendKeysToAndroidElementWithID(productNameAndDescriptionFieldsID,  itemName);
    }

    @Override
    public void setProductNamePostamat() {
        itemName = "Товар с доставкой постамат";
        //swipeVerticalToElementWithText("Фото товара");
        clickProductName();
        sendKeysToAndroidElementByIDAndInstance(productNameAndDescriptionFieldsID, 4,   itemName);
    }

    @Override
    public void setproductNameBothDeliveries() {
        itemName = "Товар с доставками Dpd courier and Dpd postamat";
        //swipeVerticalToElementWithText("Фото товара");
        clickProductName();
        sendKeysToAndroidElementByIDAndInstance(productNameAndDescriptionFieldsID, 4,  itemName);
    }

    @Override
    public void swipeToDescription() {
        swipeVerticalToElementWithText("Описание");
    }

    @Override
    public void swipeToTop() {
        swipeVerticalToElementWithText("Фото товара");
    }

    @Override
    public void setProductName_RussianPost() {
        itemName = "Товар с доставкой Почта России";
        clickProductName();
        sendKeysToAndroidElementByIDAndInstance(productNameAndDescriptionFieldsID, 4,   itemName);
    }

    @Override
    public void setProductNameAllDeliveryes() {
        itemName = "Товар с доставкой курьер, постамат, почта";
        //swipeVerticalToElementWithText("Фото товара");
        clickProductName();
        sendKeysToAndroidElementByIDAndInstance(productNameAndDescriptionFieldsID, 4,   itemName);
    }

    @Override
    public void clickBySwitchAllShippingMethods() {
        swipeVerticalToElementWithText("Опубликовать");
        waitAndClickAndroidElementByID(allShippingSwitchId);
    }
}
