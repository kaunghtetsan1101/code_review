package com.liam.codereview

import android.location.Address

data class TestOne(
    var name : String,
    var age : Int,
    var address : Address,
    var friends : List<String>
)
