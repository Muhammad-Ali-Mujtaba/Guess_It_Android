package com.example.android.guesstheword.screens.score

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ScoreViewModel(finalScore: Int): ViewModel(){

    private val _score = MutableLiveData<Int>(finalScore)
    val score: LiveData<Int> get() = _score

    private val _playedAgain = MutableLiveData<Boolean>(false)
    val playedAgain: LiveData<Boolean> get() = _playedAgain

    init {
        _score.value = finalScore
    }

    fun onPlayAgain(){
        _playedAgain.value = true
    }

    fun onPlayAgainComplete(){
        _playedAgain.value = false
    }

}