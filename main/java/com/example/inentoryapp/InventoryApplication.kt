package com.example.inentoryapp

import android.app.Application
import com.example.inentoryapp.data.AppContainer
import com.example.inentoryapp.data.AppDataContainer

class InventoryApplication : Application() {

    /**
     * AppContainer instance used by the rest of classes to obtain dependencies
     */
    lateinit var container: AppContainer

    override fun onCreate() {
        super.onCreate()
        container = AppDataContainer(this)
    }
}
