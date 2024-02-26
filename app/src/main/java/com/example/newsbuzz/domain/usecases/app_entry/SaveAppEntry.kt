package com.example.newsbuzz.domain.usecases.app_entry

import com.example.newsbuzz.domain.manger.LocalUserManger

class SaveAppEntry(
    private val localUserManger: LocalUserManger
) {

    suspend operator fun invoke(){
        localUserManger.saveAppEntry()
    }

}