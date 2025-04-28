package com.hetpatel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class StartApplication {

    public static void main(String[] args) {
        SpringApplication.run(StartApplication.class, args);
    }

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("title", "🚀 CI/CD Pipeline Powered by Het Patel");
        model.addAttribute("msg", "💡 This app is powered by Het Patel and deployed on Kubernetes using Argo CD.");
        return "index"; // returns templates/index.html
    }
}