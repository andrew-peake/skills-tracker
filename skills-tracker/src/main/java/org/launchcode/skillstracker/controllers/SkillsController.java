package org.launchcode.skillstracker.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class SkillsController {

    @GetMapping()
    public String skillsText() {
        return "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>C#</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }

    @PostMapping("form")
    public String formGenWithParam(@RequestParam String name, @RequestParam String codingLanguage1, @RequestParam String codingLanguage2, @RequestParam String codingLanguage3) {
        return "<html>" +
                "<body>" +
                "<h1>" + name + "</h1>" +
                "<ol>" +
                "<li>" + codingLanguage1 + "</li>" +
                "<li>" + codingLanguage2 + "</li>" +
                "<li>" + codingLanguage3 + "</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }

    @GetMapping("form")
    public String skillsForm() {
        return "<html>" +
                "<body>" +
                "<form method='post' action=''>" +
                "<p>Name:</p>" +
                "<input type = 'text' name = 'name'>" +
                "<p>My favorite language:</p>" +
                "<select name = 'codingLanguage1'>" +
                "<option value = 'Java' selected>Java</option>" +
                "<option value = 'JavaScript'>JavaScript</option>" +
                "<option value = 'C#'>C#</option>" +
                "</select>" +
                "<p>My second favorite language:</p>" +
                "<select name = 'codingLanguage2'>" +
                "<option value = 'Java' selected>Java</option>" +
                "<option value = 'JavaScript'>JavaScript</option>" +
                "<option value = 'C#'>C#</option>" +
                "</select>" +
                "<p>My third favorite language:</p>" +
                "<select name = 'codingLanguage3'>" +
                "<option value = 'Java' selected>Java</option>" +
                "<option value = 'JavaScript'>JavaScript</option>" +
                "<option value = 'C#'>C#</option>" +
                "</select>" +
                "<input type = 'submit' value = 'Submit'>" +
                "</form>" +
                "</body>" +
                "</html>";
    }


}
