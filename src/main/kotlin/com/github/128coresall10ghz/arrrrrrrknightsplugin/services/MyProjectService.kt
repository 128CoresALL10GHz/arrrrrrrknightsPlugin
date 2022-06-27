package com.github.128coresall10ghz.arrrrrrrknightsplugin.services

import com.intellij.openapi.project.Project
import com.github.128coresall10ghz.arrrrrrrknightsplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
