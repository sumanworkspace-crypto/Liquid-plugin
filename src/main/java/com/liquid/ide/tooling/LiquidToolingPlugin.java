package com.liquid.ide.tooling;

import org.gradle.api.DefaultTask;
import org.gradle.api.Plugin;
import org.gradle.api.Project;
import org.gradle.api.tasks.TaskAction;

/**
 * Liquid Tooling Plugin for Liquid IDE projects.
 * 
 * Provides utilities and tasks for building and configuring Liquid IDE applications.
 */
public class LiquidToolingPlugin implements Plugin<Project> {
    
    @Override
    public void apply(Project project) {
        // Register the liquidIdeInfo task
        project.getTasks().register("liquidIdeInfo", LiquidIdeInfoTask.class);
    }
    
    /**
     * Task that prints Liquid IDE plugin information.
     */
    public static class LiquidIdeInfoTask extends DefaultTask {
        
        @TaskAction
        public void printInfo() {
            Project project = getProject();
            getLogger().quiet("========================================");
            getLogger().quiet("Liquid Tooling Plugin");
            getLogger().quiet("Version: 1.0.0");
            getLogger().quiet("Project: " + project.getName());
            getLogger().quiet("========================================");
        }
    }
}
