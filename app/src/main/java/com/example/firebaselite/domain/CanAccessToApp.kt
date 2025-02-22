package com.example.firebaselite.domain

import com.example.firebaselite.data.Repository

class CanAccessToApp {

    val repository = Repository()

    suspend operator fun invoke(): Boolean {
        val currentVersion = repository.getCurrentVersion() //1.0.3
        val minAllowedVersion = repository.getMinAllowedVersion() //1.0.2

        //Recorre las 2 arrays para obtener version
        for ((currentPart, minVersionPart) in currentVersion.zip(minAllowedVersion)) {
            if (currentPart != minVersionPart) {
                return currentPart > minVersionPart
            }
        }
        return true
    }
}