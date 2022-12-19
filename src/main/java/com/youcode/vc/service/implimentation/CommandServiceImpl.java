package com.youcode.vc.service.implimentation;

import com.youcode.vc.entity.Client;
import com.youcode.vc.entity.Command;
import com.youcode.vc.repository.ClientRepository;
import com.youcode.vc.repository.CommandRepository;
import com.youcode.vc.service.CommandService;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.ConstraintViolationException;
import jakarta.validation.Validator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

 @Service
public class CommandServiceImpl implements CommandService {
    @Autowired
    private Validator validator;
    @Autowired
    private CommandRepository commandRepository;

    @Autowired
    private ClientRepository clientRepository;

     @Override
     public List<Command> COMMAND_LIST() {
          return commandRepository.findAll();
     }

     @Override
    public Command saveCommande(Command command) {
        Set<ConstraintViolation<Command>> violations = validator.validate(command);
        if(!violations.isEmpty()){
            StringBuilder sb = new StringBuilder("<ul>");
            for (ConstraintViolation<Command> constraintViolation : violations) {
                sb.append("<li>"+constraintViolation.getMessage()+"</li>");
            }
            sb.append("</ul>");
            throw new ConstraintViolationException("<h3>Error occurred:</h3> " + sb.toString(), violations);
        }
        Client cl = new Client();
        cl = clientRepository.findByEmail("khalil@email.com");
        command.setClient(cl);
        return commandRepository.save(command);
     }

    @Override
    public Command updateCommand(Long id) {
        Optional<Command> optionalCommand = commandRepository.findById(id);
        Command commande = null;
        if(optionalCommand.isPresent()){
            commande = optionalCommand.get();
        }else {
            throw new RuntimeException("Command not found for id : " + id);
        }
        return commande;
    }

     @Override
     public Command getCommandeByRef(String ref) {
    return commandRepository.findCommandByReferenceLike(ref);

     }

     @Override
     public Optional<Command> getCommandeById(Long id) {
         Optional<Command> command= commandRepository.findById(id);
         if(command.isPresent()){
             return command;

        } else throw new IllegalStateException("commande ,'exist pas");

     }

     @Override
     public void deleteCommande(Long id) {
    commandRepository.deleteById(id);
     }
 }


