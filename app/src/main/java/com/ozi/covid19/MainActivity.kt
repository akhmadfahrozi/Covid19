package com.ozi.covid19

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import com.ozi.covid19.Model.ResponseKaltim
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

    private var adapter: AdapterUtama? = null
    lateinit var a: TextView
    lateinit var but: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activty1)
        dataaa()
        datatgl()

    }
    private fun dataaa(){

ApiService.getService()?.getData()
   ?.enqueue(object : Callback<List<ResponseKaltim>> {
        override fun onFailure(call: Call<List<ResponseKaltim>>, t: Throwable) {
        }

        override fun onResponse(
            call: Call<List<ResponseKaltim>>,
            response: Response<List<ResponseKaltim>>
        ) {
            rcutamaa.adapter = AdapterUtama(response.body())
        }

    })
    }



//    private fun setdata(responn: List<ResponseData>) {
//
//        val respone = responn[0]
//        sembuh.setText("${respone.sembuh}")
//        positif.setText("${respone.positif}")
//        meninggal.setText(("${respone.meninggal}"))
//
//    }





    private fun datatgl() {
        val sdf = SimpleDateFormat("dd MMM yyyy ", Locale.getDefault())
        val currentDateandTime = sdf.format(Date())
        tv_datee?.text = currentDateandTime
    }
}




