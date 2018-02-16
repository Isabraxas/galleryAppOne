package com.galleryapp.galleryapp.data;

import com.galleryapp.galleryapp.model.Projects;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@Component
public class ProjectRepository {
    private static final List<Projects> projectsList= Arrays.asList(
        new Projects("l1", LocalDate.of(2017,01,6),"isvar"),
        new Projects("l2",LocalDate.of(2015,03,8),"indrack"),
        new Projects("l3",LocalDate.of(2014,05,3),"freddy"),
        new Projects("l4",LocalDate.of(2017,06,7),"alicia"),
        new Projects("l5",LocalDate.of(2018,01,15),"carlos")

    );

    public Projects findByProjectName(String name){
        for (Projects project : projectsList){
            if(project.getProjectName().equals(name)){
                return project;
            }
        }
        return null;
    }

    public List<Projects> getAllProjects(){
        return projectsList;
    }



}
