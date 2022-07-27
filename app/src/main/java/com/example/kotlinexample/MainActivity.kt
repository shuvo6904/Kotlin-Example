package com.example.kotlinexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.kotlinexample.viewmodel.MainActivityViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var button : Button
    private lateinit var viewModel : MainActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProvider(this)[MainActivityViewModel::class.java]
        button = findViewById(R.id.callApi)

        button.setOnClickListener {
            //Log.d("BUTTON", "Button Clicked")

            viewModel.onlineShopPublish("Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiJ9.eyJhdWQiOiIxNyIsImp0aSI6IjEwYjY5ZWIyN2MyY2Q5YTU2MDYxMzk5YjEwN2I4YTNjY2E4YzY3ZTcxMjUyNDc3MDNlNmVjZGYzOGI5YWZmZDBmMDE1YTQxM2I2ZGUwZmI3IiwiaWF0IjoxNjU4ODE2MTY1LjEwNDQxNywibmJmIjoxNjU4ODE2MTY1LjEwNDQyMSwiZXhwIjoxNjkwMzUyMTY1LjA4ODEyNiwic3ViIjoiNDMyIiwic2NvcGVzIjpbXX0.bFliy5NefUJqrdeuY4eEiRV39bX6mXJt1LpS_bTnBo4pZ5JUM2yFHI0CUt-7tvUsq6DVDGfYynhqKhOFbBXQy6RjP1lZVx9ZQkhhiJBtsDB1XIdvlg8OhGohO6sb_hhzldMUF24NUwxn9pJK8pewFSVZt1i8N8aJ0loniva5ase1fjm5Z5jr_1oJI14ePMj7KsqVA-U4lYX2k58N0l3z2lU61q5QqT7KidArvkRM4G3bqz4egFoSqknk_3PyJnhjQ9Z6UNw3hTy-xV7SZJT_qvhG4J2biUAWZD6zmYZ55p2S-LaZRaWFr-W2bXBUEZaaDL4q3B2bH99vC-fVjxchxgRPoQ9UkGZu-DMRtfN54IXSqnQwNN86n4b5y2FD-9aRolPWUJ8OoOtv-UDqI5D3G8yNnc8hnOssUDatpXJvjXc6n0rieGyuYhIo6MzdThqB9plopJKhasgc23SKZr0PpJIHT3fWXmx_gZW3pktl8d6uofRspmbt8B5uUsa9woMi3IPDwT7LwMFnqB7xfIATUNGrRQf2uCTxJ12raOcBTt_I09-rjrUQEnZlivbVyzBz4-zq3t-pMvdHSi_-k-0cQ8DLAItGhOQ5Gjl2I9pD2uDVejYgFrTPv7t6rKwF-W6y4mDuQddZz_KHx17m_ULp3Tiszsvr-8vtkkPmtS8o7VQ", 738).observe(this, Observer {

                if (it != null){
                    Log.d("APIRESPONSE", it.toString())
                } else{
                    Log.d("APIRESPONSE", "Null Response")
                }
            })

        }

    }


}