package com.ozi.covid19

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import com.ozi.covid19.Model.ResponseData
import com.ozi.covid19.prov.Attributes
import com.ozi.covid19.prov.ResponseProvinsi
import kotlinx.android.synthetic.main.activty1.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity(){
//    override fun onClick(p0: View?) {
//        when (View.id) {
//            R.id.bt_play -> {
//                val pindah = Intent(this@MainActivity, isi::class.java)
//                startActivity(pindah)
//            }
//    }

    private var data: List<Attributes> = ArrayList()
    private var adapter: AdapterUtama? = null
    lateinit var a: TextView
    lateinit var but: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activty1)

        dataa()
        datatgl()





        a = findViewById(R.id.sembuh)
    }

    private fun setdata(responn: List<ResponseData>) {

        val respone = responn[0]
        sembuh.setText("${respone.sembuh}")
        positif.setText("${respone.positif}")
        meninggal.setText(("${respone.meninggal}"))

    }

    private fun dataa() {

        ApiService.getService()?.getData()
            ?.enqueue(object : Callback<List<ResponseData>> {
                override fun onFailure(call: Call<List<ResponseData>>?, t: Throwable?) {
                    Toast.makeText(this@MainActivity, "ERROR HOST ", Toast.LENGTH_LONG).show()

                }

                override fun onResponse(
                    call: Call<List<ResponseData>>,
                    response: Response<List<ResponseData>>
                ) {
                    if (response?.isSuccessful!!) {

                        val main: List<ResponseData> = response.body()!!
                        setdata(main)


                    } else {
                        Toast.makeText(this@MainActivity, "Hasil data", Toast.LENGTH_LONG).show()

                    }
                }

            })
    }

    private fun datatgl() {
        val sdf = SimpleDateFormat("dd MMM yyyy ", Locale.getDefault())
        val currentDateandTime = sdf.format(Date())
        tv_datee?.text = currentDateandTime
    }



}

