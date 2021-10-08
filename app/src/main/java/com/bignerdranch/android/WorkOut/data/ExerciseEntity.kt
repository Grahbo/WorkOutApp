package com.bignerdranch.android.WorkOut.data

import com.bignerdranch.android.WorkOut.NEW_NOTE_ID
import java.util.*

data class ExerciseEntity(
    var id: Int,
    var exercise: String,
    var date: Date,
    var place: String
) {
    constructor() : this(NEW_NOTE_ID, "", Date(), "")
    constructor(exercise: String, date: Date, place: String) : this(NEW_NOTE_ID, exercise, date, place)
}
