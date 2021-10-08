package com.bignerdranch.android.WorkOut.data

import java.util.*

class SampleDataProvider {

    companion object{
        private val exerciseText1 = "Push ups"
        private val exerciseText2 = "Sit ups"
        private val exerciseText3 = "Burpees"


        private val placeText1 = "Push ups"
        private val placeText2 = "Sit ups"
        private val placeText3 = "Burpees"

        private fun getDate(diff: Long): Date {
            return Date( Date().time + diff)
        }

        fun getNotes() = arrayListOf (
            ExerciseEntity(1, exerciseText1, getDate(0), placeText1),
            ExerciseEntity(2, exerciseText2, getDate(1), placeText2),
            ExerciseEntity(3, exerciseText3, getDate(2), placeText3)
                )

    }
}