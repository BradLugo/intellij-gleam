@file:Suppress("UnstableApiUsage")

package com.github.bradlugo.intellijgleam.lsp

import com.intellij.execution.configurations.GeneralCommandLine
import com.intellij.openapi.project.Project
import com.intellij.openapi.vfs.VirtualFile
import com.intellij.platform.lsp.api.ProjectWideLspServerDescriptor

internal class GleamLspServerDescriptor(project: Project) : ProjectWideLspServerDescriptor(project, "Gleam") {
    override fun isSupportedFile(file: VirtualFile) = file.extension == "gleam"
    override fun createCommandLine() = GeneralCommandLine("gleam", "lsp")
}