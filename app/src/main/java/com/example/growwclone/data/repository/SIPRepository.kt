package com.example.growwclone.data.repository

import com.example.growwclone.data.model.SIP

object SIPRepository {
    private val sips = mutableListOf<SIP>()

    fun addSIP(sip: SIP) {
        sips.add(sip)
    }

    fun getSIPs(): List<SIP> = sips
}
