package com.example.android.marsphotos.data

import com.squareup.moshi.Json

data class MarsPhotoModel(
   @Json(name = "id") val id: String,
   @Json(name = "img_src") val img_src: String,
)