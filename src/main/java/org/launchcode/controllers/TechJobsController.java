package org.launchcode.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Ezekiel on 3/27/17.
 */
public class TechJobsController {
    static HashMap<String, String> actionChoices = new HashMap<>();
    public TechJobsController () {
        actionChoices.put("search", "Search");
        actionChoices.put("list", "List");

    }
    @ModelAttribute("actions")
    public static HashMap<String, String> getActionChoices(){
        return actionChoices;

    }
}
