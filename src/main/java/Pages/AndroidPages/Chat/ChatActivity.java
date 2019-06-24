package Pages.AndroidPages.Chat;

import AndroidAndIOSHelpers.AndroidBaseClass;
import Interface.ChatInterface;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ChatActivity extends AndroidBaseClass implements ChatInterface {
    private int messageCount = 1;

    public ChatActivity(AppiumDriver driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    private String contextMenuID = "com.reposh.dev:id/action_options";
    private String itemNameID = "com.reposh.dev:id/tv_title";
    private String itemPriceID = "com.reposh.dev:id/tv_price";
    private String date_tvID = "com.reposh.dev:id/header_timestamp_tv";
    private String time_tvID = "com.reposh.dev:id/time_tv";
    private String addPhotoIconID = "com.reposh.dev:id/button_add_photo";
    private String entryFieldMessageID = "com.reposh.dev:id/et_message";
    private String sendMessageBtnID = "com.reposh.dev:id/button_send_message";


    @Override
    public void waitSendMessageBtn() {
        waitAndroidViewById(sendMessageBtnID);
    }

    @Override
    public void waitMessageField() {
        waitAndroidViewById(entryFieldMessageID);
    }

    @Override
    public void writeMessage() {
        sendKeysToAndroidElementWithID(entryFieldMessageID, "message" + messageCount);
    }

    @Override
    public void write5messages() {
        for (int i = 0; i < 5; i++) {
            writeMessage();
            clickSendButton();
            messageCount++;
        }
    }

    @Override
    public void writeMessageWithHieroglyphs() {
        String hieroglyphsMessage = "中国权威汽车调查咨询机构新华信公司发布最新调查结果称，44.4%的被调查者把拥有汽车视为改变生活质量的重要标志，有40.3%的被调查者认为车辆在使用到第五年时为最佳的换车时机，有半数以上被调查者说他们最愿意购买的是10万元左右、经济实用的家庭轿车。这些数字表明，中国家庭购买\"第二辆车\"的热潮正方兴未艾。";
        sendKeysToAndroidElementWithID(entryFieldMessageID, hieroglyphsMessage);
    }

    @Override
    public void clickSendButton() {
        waitAndClickAndroidElementByID(sendMessageBtnID);
    }

    @Override
    public void clickAddPhoto() {
        waitAndClickAndroidElementByID(addPhotoIconID);
    }

    @Override
    public void writeLongMessage() {
        String longText = "Сатурн Saturn \n" +
                "Saturn during \n" +
                "Снимок планеты со станции Кассини\n" +
                "Орбитальные характеристики\n" +
                "Перигелий\t1 353 572 956 км\n" +
                "9,048 а. е.\n" +
                "Афелий\t1 513 325 783 км\n" +
                "10,116 а. е.\n" +
                "Большая полуось (a)\t1 429 394 069 ± 1 км[10] и 1 426 666 414 094,1 м[11]\n" +
                "Эксцентриситет орбиты (e)\t0,055 723 219\n" +
                "Сидерический период обращения\t10 759,22 суток (29,46 года)[1]\n" +
                "Синодический период обращения\t378,09 суток\n" +
                "Орбитальная скорость (v)\t9,69 км/с\n" +
                "Наклонение (i)\t2,485 240°\n" +
                "5,51° (относительно солнечного экватора)\n" +
                "Долгота восходящего узла (Ω)\t113,642 811°\n" +
                "Аргумент перицентра (ω)\t336,013 862°\n" +
                "Чей спутник\tСолнце\n" +
                "Спутники\t62[2]\n" +
                "Физические характеристики\n" +
                "Полярное сжатие\t0,097 96 ± 0,000 18\n" +
                "Экваториальный радиус\t60 268 ± 4 км [3]\n" +
                "Полярный радиус\t54 364 ± 10 км [3]\n" +
                "Средний радиус\t58 232 ± 6 км [4]\n" +
                "Площадь поверхности (S)\t4,272·1010 км2[5]\n" +
                "Объём (V)\t8,2713·1014 км3 [6]\n" +
                "Масса (m)\t5,6846·1026 кг[6] \n" +
                "95 земных\n" +
                "Средняя плотность (ρ)\t0,687 г/см3 [3][6]\n" +
                "Ускорение свободного падения на экваторе (g)\t10,44 м/с²[6]\n" +
                "Вторая космическая скорость (v2)\t35,5 км/с[6]\n" +
                "Экваториальная скорость вращения\t9,87 км/c\n" +
                "Период вращения (T)\t10 ч 32 мин 45 с ± 46 с[7][8]\n" +
                "Наклон оси\t26,73°[6]\n" +
                "Склонение северного полюса (δ)\t83,537°\n" +
                "Альбедо\t0,342 (альбедо Бонда)\n" +
                "0,47 (геом. альбедо)[6]\n" +
                "Видимая звёздная величина\tот +1,47 до −0,24 [9]\n" +
                "Абсолютная звёздная величина\t+28 m\n" +
                "Угловой диаметр\t14,5\"—20,1\"\n" +
                "Температура\n" +
                " \t\n" +
                "мин.\tсред.\tмакс.\n" +
                "уровень 1 бара\t\n" +
                "134 K\t\n" +
                "0,1 бара\t\n" +
                "84 K\t\n" +
                "Атмосфера\n" +
                "Состав:\n" +
                "~96 %\tВодород (H2)\n" +
                "~3 %\tГелий\n" +
                "~0,4 %\tМетан\n" +
                "~0,01 %\tАммиак\n" +
                "~0,01 %\tДейтерид водорода (HD)\n" +
                "~0,0007 %\tЭтан\n" +
                "Льды:\t\n" +
                "Аммиачные\n" +
                "Водяные\n" +
                "Гидросульфид аммония (NH4SH)\n" +
                "Информация в Викиданных\n" +
                "У этого термина существуют и другие значения, см. Сатурн (значения).\n" +
                "Сату́рн — шестая планета от Солнца и вторая по размерам планета в Солнечной системе после Юпитера. Сатурн, а также Юпитер, Уран и Нептун, классифицируются как газовые гиганты. Сатурн назван в честь римского бога земледелия. Символ Сатурна — серп (Юникод: ♄).\n" +
                "\n" +
                "В основном Сатурн состоит из водорода, с примесями гелия и следами воды, метана, аммиака и тяжёлых элементов. Внутренняя область представляет собой относительно небольшое ядро из железа, никеля и льда, покрытое тонким слоем металлического водорода и газообразным внешним слоем. Внешняя атмосфера планеты кажется из космоса спокойной и однородной, хотя иногда на ней появляются долговременные образования. Скорость ветра на Сатурне может достигать местами 1800 км/ч, что значительно больше, чем на Юпитере. У Сатурна имеется планетарное магнитное поле, занимающее промежуточное положение по напряжённости между магнитным полем Земли и мощным полем Юпитера. Магнитное поле Сатурна простирается на 1 000 000 километров в направлении Солнца. Ударная волна была зафиксирована «Вояджером-1» на расстоянии в 26,2 радиуса Сатурна от самой планеты, магнитопауза расположена на расстоянии в 22,9 радиуса.\n" +
                "\n" +
                "Сатурн обладает заметной системой колец, состоящей главным образом из частичек льда, меньшего количества тяжёлых элементов и пыли. Вокруг планеты обращается 62 известных на данный момент спутника[2]. Титан — самый крупный из них, а также второй по размерам спутник в Солнечной системе (после спутника Юпитера, Ганимеда), который превосходит по своим размерам Меркурий и обладает единственной среди спутников планет Солнечной системы плотной атмосферой.\n" +
                "\n" +
                "На орбите Сатурна находилась автоматическая межпланетная станция (АМС) «Кассини», запущенная в 1997 году и достигшая системы Сатурна в 2004 году. В задачи АМС входило изучение структуры колец, а также динамики атмосферы и магнитосферы планеты.\n" +
                "15 сентября 2017 года станция завершила свою миссию, сгорев в атмосфере планеты.";
        sendKeysToAndroidElementWithID(entryFieldMessageID, longText);
    }
}
