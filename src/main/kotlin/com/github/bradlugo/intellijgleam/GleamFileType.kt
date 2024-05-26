package com.github.bradlugo.intellijgleam

import com.intellij.openapi.fileTypes.LanguageFileType
import com.intellij.openapi.vfs.VirtualFile
import javax.swing.Icon

object GleamFileType : LanguageFileType(GleamLanguage) {

    override fun getName(): String = "Gleam"

    override fun getIcon(): Icon = GleamIcons.LUCY

    override fun getDefaultExtension(): String = "gleam"

    override fun getCharset(file: VirtualFile, content: ByteArray): String = "UTF-8"

    override fun getDescription(): String = "Gleam file"
}