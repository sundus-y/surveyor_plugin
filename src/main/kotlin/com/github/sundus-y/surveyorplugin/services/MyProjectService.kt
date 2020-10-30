package com.github.sundus-y.surveyorplugin.services

import com.intellij.openapi.project.Project
import com.github.sundus-y.surveyorplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
