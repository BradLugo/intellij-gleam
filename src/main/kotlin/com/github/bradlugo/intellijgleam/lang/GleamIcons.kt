package com.github.bradlugo.intellijgleam.lang

import com.intellij.openapi.util.IconLoader
import javax.swing.Icon

object GleamIcons {
    val LUCY = load("/icons/lucy.svg")

    private fun load(path: String): Icon = IconLoader.getIcon(path, GleamIcons::class.java)
}
