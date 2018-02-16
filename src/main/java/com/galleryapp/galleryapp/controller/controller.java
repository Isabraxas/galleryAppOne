package com.galleryapp.galleryapp.controller;

import com.galleryapp.galleryapp.data.ProjectRepository;
import com.galleryapp.galleryapp.model.Projects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;
import java.util.List;

@Controller
public class controller {
    @Autowired
    private ProjectRepository projectRepository;

    @RequestMapping(value="/")
    public String homePage(ModelMap modelMap){
        List<Projects> allProjects= projectRepository.getAllProjects();
        modelMap.addAttribute("linkTest","/link/test");
        modelMap.put("projects", allProjects);
        return "home";
    }


    @RequestMapping(value = "/link/test")
    public String projectsPage(ModelMap modelMap){
        //Projects projects = projectRepository.findByProjectName("l4");
        //modelMap.put("projects",projects);
        modelMap.addAttribute("miTexto","Hola este es mi texto de prueba");
        return "/link/test";
    }


}
