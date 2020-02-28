package com.eratart.useful.constants.regex

object RegexConstants {
    const val PATTERN_NUMBER_PHONE_A1_29 =
        "^(\\+375|80)29(1|3|6|9)[0-9]{2}[0-9]{2}[0-9]{2}$"
    const val PATTERN_NUMBER_PHONE_A1_44 = "^(\\+375|80)44[0-9]{3}[0-9]{2}[0-9]{2}$"
    const val PATTERN_NUMBER_PHONE_MTS_29 =
        "^(\\+375|80)29(2|5|7|8)[0-9]{2}[0-9]{2}[0-9]{2}$"
    const val PATTERN_NUMBER_PHONE_MTS_33 = "^(\\+375|80)33[0-9]{3}[0-9]{2}[0-9]{2}$"
    const val PATTERN_NUMBER_PHONE_LIFE = "^(\\+375|80)25[0-9]{3}[0-9]{2}[0-9]{2}$"
}