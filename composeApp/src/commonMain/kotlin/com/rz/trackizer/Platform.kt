package com.rz.trackizer

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform