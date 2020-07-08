package com.ozi.covid19.Model


import com.google.gson.annotations.SerializedName


data class ResponseKaltim(

	@field:SerializedName("Meninggal")
	val meninggal: String? = null,

	@field:SerializedName("OTG")
	val oTG: Int? = null,

	@field:SerializedName("Process")
	val process: Int? = null,

	@field:SerializedName("Latitude")
	val latitude: String? = null,

	@field:SerializedName("TOTAL_KASUS")
	val tOTALKASUS: Int? = null,

	@field:SerializedName("Probable")
	val probable: Int? = null,

	@field:SerializedName("Negative")
	val negative: Int? = null,

	@field:SerializedName("ODP_yang_diperiksa_Lab")
	val oDPYangDiperiksaLab: Int? = null,

	@field:SerializedName("ODP")
	val oDP: Int? = null,

	@field:SerializedName("Proses_Pemantauan")
	val prosesPemantauan: Int? = null,

	@field:SerializedName("Provinsi")
	val provinsi: String? = null,

	@field:SerializedName("Confirmed")
	val confirmed: String? = null,

	@field:SerializedName("Selesai_Pemantauan")
	val selesaiPemantauan: Int? = null,

	@field:SerializedName("PDP")
	val pDP: Int? = null,

	@field:SerializedName("Sembuh")
	val sembuh: String? = null,

	@field:SerializedName("Dirawat")
	val dirawat: Int? = null,

	@field:SerializedName("Longtitude")
	val longtitude: String? = null,

	@field:SerializedName("KabKota")
	val kabKota: String? = null
)