package com.ozi.covid19.prov


import com.google.gson.annotations.SerializedName


data class ResponseProvinsi(

	@field:SerializedName("attributes")
	val attributes: MutableList<Attributes>? = null
)