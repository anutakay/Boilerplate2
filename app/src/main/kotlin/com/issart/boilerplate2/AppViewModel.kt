package com.issart.boilerplate2

import android.app.Application
import androidx.lifecycle.AndroidViewModel

open class AppViewModel(
    app: Application,
    protected val interactors: Interactors
) : AndroidViewModel(app) {
    protected val application: App = this.getApplication()
}