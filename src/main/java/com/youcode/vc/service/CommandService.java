package com.youcode.vc.service;

import com.youcode.vc.entity.Command;

import java.util.List;
import java.util.Optional;

public interface CommandService {
    List<Command> COMMAND_LIST ();
    Command saveCommande(Command command);
    Command updateCommand(Long id);
    Command getCommandeByRef(String ref);
    Optional<Command> getCommandeById(Long id);
    void deleteCommande(Long id);



}
