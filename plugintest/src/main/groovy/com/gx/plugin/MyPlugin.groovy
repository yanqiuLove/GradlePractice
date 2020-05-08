package com.gx.plugin

import com.android.build.gradle.options.ProjectOptions
import com.gx.plugin.extensions.Person
import org.apache.tools.ant.Task
import org.gradle.api.Plugin
import org.gradle.api.Project

public class MyPlugin implements Plugin<Project> {
    @Override
    void apply(Project project) {
        println("--------------------------")
        project.extensions.add("person", Person)

        project.task('printPerson', group: atom).doLast {
            Person ext = project.person
            println(ext.toString())

        }

//        project.tasks("printPerson"){
//            group 'atom'
//            doLast{
//                Person ext=project.person
//                println(ext.toString())
//            }
//        }


        println('--------------------------')
    }
}