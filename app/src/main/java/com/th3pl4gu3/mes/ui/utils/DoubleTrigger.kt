package com.th3pl4gu3.mes.ui.utils

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData

class DoubleTrigger<A, B>(a: LiveData<A>, b: LiveData<B>) : MediatorLiveData<Pair<A?, B?>>() {
    init {
        addSource(a) { value = it to b.value }
        addSource(b) { value = a.value to it }
    }
}