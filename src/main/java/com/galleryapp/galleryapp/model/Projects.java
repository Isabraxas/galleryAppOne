package com.galleryapp.galleryapp.model;

import java.time.LocalDate;

public class Projects {

    private String projectName;
    private LocalDate completedDate;
    private String developerName;

    public Projects(String projectName, LocalDate completedDate, String developerName) {
        this.projectName = projectName;
        this.completedDate = completedDate;
        this.developerName = developerName;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public LocalDate getCompletedDate() {
        return completedDate;
    }

    public void setCompletedDate(LocalDate completedDate) {
        this.completedDate = completedDate;
    }

    public String getDeveloperName() {
        return developerName;
    }

    public void setDeveloperName(String developerName) {
        this.developerName = developerName;
    }



}
