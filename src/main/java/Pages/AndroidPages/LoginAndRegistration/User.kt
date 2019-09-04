package Pages.AndroidPages.LoginAndRegistration

sealed class User constructor(
        open val phone: String,
        open val code: String) {

    class User1(override val phone: String = " git s9111111111",
                override val code: String = "7642") : User(phone, code)

    class User2(override val phone: String = "9222222222",
                override val code: String = "7642") : User(phone, code)

    class User3(override val phone: String = "9333333333",
                override val code: String = "7642") : User(phone, code)

    class User4(override val phone: String = "9444444444",
                override val code: String = "7642") : User(phone, code)

    class User7(override val phone: String = "9777777777",
                override val code: String = "4315") : User(phone, code)

    class User8(override val phone: String = "9888888888",
                override val code: String = "4315") : User(phone, code)

    class User9(override val phone: String = "9999999999",
                override val code: String = "4315") : User(phone, code)
}