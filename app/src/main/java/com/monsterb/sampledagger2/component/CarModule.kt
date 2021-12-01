package com.monsterb.sampledagger2.component

import com.monsterb.sampledagger2.model.Car
import com.monsterb.sampledagger2.model.Tire
import com.monsterb.sampledagger2.model.Wheel
import dagger.Module
import dagger.Provides

@Module
object CarModule {
    @Provides
    fun providesCar(wheel: Wheel, tire: Tire): Car {
        return Car(wheel, tire)
    }

    @Provides
    fun providesWheel(): Wheel {
        return Wheel()
    }

    @Provides
    fun providesTire(): Tire {
        return Tire()
    }
}
