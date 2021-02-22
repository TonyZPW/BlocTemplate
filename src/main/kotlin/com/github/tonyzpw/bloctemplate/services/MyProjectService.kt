package com.github.tonyzpw.bloctemplate.services

import com.github.tonyzpw.bloctemplate.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
