package com.monsterb.sampledagger2.component

import com.monsterb.sampledagger2.MainActivity
import dagger.BindsInstance
import dagger.Component

@Component(modules = [CarModule::class])
interface CarComponent {
    fun inject(activity: MainActivity)

//    @Component.Builder
//    interface Builder {
//        fun build(): CarComponent
//
////        @BindsInstance
////        fun carModule(carModule: CarModule): Builder
//    }
}
