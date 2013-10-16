package com.worldmanager.platform.kpi.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class KpiController {

    @RequestMapping("/kpi")
    public String greeting(Model model) {
        return "default/home";
    }
}
