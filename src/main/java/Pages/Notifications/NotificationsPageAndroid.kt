package Pages.Notifications

import AndroidAndIOSHelpers.AndroidBaseClass
import Interface.NotificationsInterface
import io.appium.java_client.AppiumDriver



class NotificationsPageAndroid(driver: AppiumDriver<*>?) : AndroidBaseClass(driver), NotificationsInterface {
    override fun turnWiFiOFF() {

    }

    override fun turnWiFiON() {

    }

    val clearAllNotificationsBtnID = "com.android.systemui:id/clear_notifications"




    override fun clearAllNotifications() {

    }

    override fun openNotifications() {
        openNotificationBase()
    }

    override fun assertTextFromNotification() {

    }


}
