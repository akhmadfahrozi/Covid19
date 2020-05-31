package com.ozi.covid19

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.gson.Gson
import com.ozi.covid19.prov.Attributes
import com.ozi.covid19.prov.ResponseProvinsi
import kotlinx.android.synthetic.main.activity_aksi.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.util.*
import kotlin.collections.ArrayList

class aksi : AppCompatActivity() {
    private var data1: MutableList<Attributes>? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_aksi)
        loadData()


    }




    private fun loadData() {
        ApiService.getService()?.getpro()
            ?.enqueue(object : Callback<ResponseProvinsi> {
                override fun onFailure(call: Call<ResponseProvinsi>, t: Throwable) {
                }

                override fun onResponse(
                    call: Call<ResponseProvinsi>,
                    response: Response<ResponseProvinsi>
                ) {

                    if (response.isSuccessful)
                    {
                        Log.e("TAG", "Hasil data${Gson().toJson(response.body())}")

                       data1 = response.body()?.attributes
                        val adapter = AdapterUtama(data1!!,this@aksi)
                        rc_utama.adapter=adapter

                    }
                }
            })

    }
}
