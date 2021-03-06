package com.oratakashi.covid19.root

import android.app.Application
import com.oratakashi.covid19.data.db.Database
import com.oratakashi.covid19.data.db.QueryBuilder
import com.oratakashi.covid19.data.network.ApiBNPB
import com.oratakashi.covid19.data.network.ApiOrata
import com.oratakashi.covid19.data.network.ApiService
import io.reactivex.disposables.CompositeDisposable

class App : Application() {
    /**
     * Tempat Deklarasi Retrofit agar bisa di pakai di seluruh aplikasi tanpa deklarasi ulang
     */
    companion object{
        var service : ApiService?= null
        var bnpb : ApiBNPB ?= null
        var orata : ApiOrata ?= null
        var builder : QueryBuilder ?= null
        var disposable : CompositeDisposable?= null
        var db : Database ?= null
    }
    override fun onCreate() {
        super.onCreate()
        service = ApiService()
        bnpb = ApiBNPB()
        orata = ApiOrata()
        disposable = CompositeDisposable()
        db = Database(this)

        builder = object : QueryBuilder() {}
    }
}