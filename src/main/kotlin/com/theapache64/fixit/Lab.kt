package com.theapache64.fixit

import com.google.gson.Gson
import com.google.gson.annotations.SerializedName
import com.google.gson.reflect.TypeToken

var data = """
    [{
  "b_code": 1,
  "c_code": 4,
  "f_code": 5462,
  "f_date": "\/Date(1555270200000+0430)\/",
  "f_meghdar": 11,
  "k_code": 1,
  "k_count": 150,
  "k_pay": 1500,
  "kalanam": "",
  "o_anbar": "",
  "o_code": 1,
  "o_date": "\/Date(1555183800000+0430)\/",
  "o_rasmi": true,
  "u_code": 0
}
]
""".trimIndent()

fun main(args: Array<String>) {
    val gson = Gson()
    val type = object : TypeToken<ArrayList<Offers>>() {}.type
    val offers = gson.fromJson<List<Offers>>(data, type)
    for (offer in offers) {
        println(offer)
    }
}

data class Offers(
    @SerializedName("b_code")
    var mBCode: Long? = null,

    @SerializedName("c_code")
    var mCCode: Long? = null,

    @SerializedName("f_code")
    var mFCode: Long? = null,

    @SerializedName("f_date")
    var mFDate: String? = null,

    @SerializedName("f_meghdar")
    var mFMeghdar: Long? = null,

    @SerializedName("k_code")
    var mKCode: Long? = null,

    @SerializedName("k_count")
    var mKCount: Long? = null,

    @SerializedName("k_pay")
    var mKPay: Long? = null,

    @SerializedName("kalanam")
    var mKalanam: String? = null,

    @SerializedName("o_anbar")
    var mOAnbar: String? = null,

    @SerializedName("o_code")
    var mOCode: Long? = null,

    @SerializedName("o_date")
    var mODate: String? = null,

    @SerializedName("o_rasmi")
    var mORasmi: Boolean? = null,

    @SerializedName("u_code")
    var mUCode: Long? = null
)