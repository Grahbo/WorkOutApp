package com.bignerdranch.android.WorkOut

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.bignerdranch.android.WorkOut.data.ExerciseEntity
import com.bignerdranch.android.WorkOut.data.SampleDataProvider

class MainViewModel : ViewModel() {

    val notesList = MutableLiveData<List<ExerciseEntity>>()
    
    init{
        notesList.value=SampleDataProvider.getNotes()
    }
}