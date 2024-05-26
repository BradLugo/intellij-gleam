package com.github.bradlugo.intellijgleam

import com.intellij.lang.Language

object GleamLanguage : Language("Gleam") {
    override fun isCaseSensitive() = true

    override fun getDisplayName() = "Gleam"
}