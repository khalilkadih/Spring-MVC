package com.youcode.vc.controller;

import com.youcode.vc.entity.Command;
import com.youcode.vc.repository.CommandRepository;
import com.youcode.vc.service.CommandService;
import com.youcode.vc.service.implimentation.CommandServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CommandController {
    @Autowired
    private CommandRepository  commandRepository;
    @Autowired
    private CommandServiceImpl commandService;


    @GetMapping("/command")
    public String ShowAllCommande(Model model){
        List<Command> commands = commandRepository.findAll();
        model.addAttribute("command",commands);
        return "command";
    }
}
