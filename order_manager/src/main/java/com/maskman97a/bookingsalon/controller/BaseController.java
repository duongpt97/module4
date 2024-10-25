package com.maskman97a.bookingsalon.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class BaseController {
    @RequestMapping
    public String redirectHome() {
        return "redirect:/home";
    }

    protected String homePage() {
        return "home";
    }

    @RequestMapping("/system_error")
    protected String renderSystemError() {
        return "system_error";
    }

    protected String renderPage(HttpServletRequest httpServletRequest, String tabName, String functionName) {
        httpServletRequest.setAttribute("tabName", tabName);
        httpServletRequest.setAttribute("functionName", functionName);
        return "home";
    }
}
