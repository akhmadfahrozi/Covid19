package com.ozi.covid19.Model


import com.google.gson.annotations.SerializedName


data class ResponseData(

	@field:SerializedName("meninggal")
	val meninggal: String? = null,

	@field:SerializedName("positif")
	val positif: String? = null,

	@field:SerializedName("sembuh")
	val sembuh: String? = null,

	@field:SerializedName("name")
	val name: String? = null
)