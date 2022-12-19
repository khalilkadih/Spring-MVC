package com.youcode.vc.service.implimentation;

import com.youcode.vc.entity.CommandItem;
import com.youcode.vc.repository.CommandItemRepo;
import com.youcode.vc.service.CommandeItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class CommandeItemServiceImpl implements CommandeItemService {
    @Autowired
    CommandItemRepo commandItemRepo;
    @Override
    public List<CommandItem> COMMAND_ITEM_LIST() {
        return commandItemRepo.findAll();
    }

    @Override
    public CommandItem saveCommandeItem(CommandItem commandItem) {
        return commandItemRepo.save(commandItem);
    }

    @Override
    public CommandItem updateCommandeItem(CommandItem commandItem,Long id) {
        Optional<CommandItem> ifExistCommandeItem=commandItemRepo.findById(id);
        if(ifExistCommandeItem.isPresent()){
            commandItemRepo.save(commandItem);
        }
            return commandItem;

    }

    @Override
    public void deleteCommandeItem(Long id) {
    commandItemRepo.deleteById(id);
    }
}
