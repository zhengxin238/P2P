package com.example.myapplication2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import com.example.myapplication2.retrofit.ApiInterface
import com.example.myapplication2.retrofit.RetrofitBuilder
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import com.example.myapplication2.StoreModel


const val BASE_URL = "http://192.168.178.80:3002/"


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //getSummaryObject()
        storeFullSummary()
    }

    private fun storeFullSummary() {
        val newStoreModel = StoreModel("Sixth App",333,"2022-03-03",99,"2022-03-02")


        //make a retrofit builder object implements the ApiInterface so that we can call the function predefined in the ApiInterface
        val retrofitBuilderObject = RetrofitBuilder.buildData(ApiInterface::class.java)

        //create one more variable to get the data from the retrofit builder
        val requestCall = retrofitBuilderObject.addSummary(newStoreModel)

        requestCall.enqueue(object : Callback<MyDataResponse?> {
            override fun onResponse(
                call: Call<MyDataResponse?>,
                response: Response<MyDataResponse?>
            ) {
                val responseBody = response.body()!!
                Log.i("MainActivity", "LogMessage"+response.body())
                val myStringBuilder = StringBuilder()

                myStringBuilder.append(responseBody.toString())


                Log.i("MainActivity", "LogMessage: "+responseBody)


                findViewById<TextView>(R.id.txtId).text = myStringBuilder
            }

            override fun onFailure(call: Call<MyDataResponse?>, t: Throwable) {
                Log.i("MainActivity", "ErrorMessage"+t.message)
            }
        })
    }

    private fun getSummaryObject() {

        //make a retrofit builder object implements the ApiInterface so that we can call the function predefined in the ApiInterface
        val retrofitBuilderObject = RetrofitBuilder.buildData(ApiInterface::class.java)

        //create one more variable to get the data from the retrofit builder
        val requestCall = retrofitBuilderObject.getData()

        requestCall.enqueue(object : Callback<MyDataResponse?> {
            override fun onResponse(
                call: Call<MyDataResponse?>,
                response: Response<MyDataResponse?>
            ) {
                val responseBody = response.body()!!
                Log.i("MainActivity", "LogMessage"+response.body())
                val myStringBuilder = StringBuilder()

                myStringBuilder.append(responseBody.responseOne.size)
                myStringBuilder.append("\n")
                myStringBuilder.append(responseBody.responseOne[0]._id)
                myStringBuilder.append("\n")
                myStringBuilder.append(responseBody.responseOne[0].appTitle)
                myStringBuilder.append("\n")


                Log.i("MainActivity", "LogMessage: "+responseBody)


                findViewById<TextView>(R.id.txtId).text = myStringBuilder
            }

            override fun onFailure(call: Call<MyDataResponse?>, t: Throwable) {
                Log.i("MainActivity", "ErrorMessage"+t.message)
            }
        })
    }

}