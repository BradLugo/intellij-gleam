package com.github.bradlugo.intellijgleam.lang

import com.intellij.lang.Language

object GleamLanguage : Language("Gleam") {
    private fun readResolve(): Any = GleamLanguage
}
