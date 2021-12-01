package com.monsterb.sampledagger2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.monsterb.sampledagger2.component.CarModule
import com.monsterb.sampledagger2.component.DaggerCarComponent
import com.monsterb.sampledagger2.model.Car
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var car: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val carComponent = DaggerCarComponent.create()
        carComponent.inject(this)

        car.tire

    }
}