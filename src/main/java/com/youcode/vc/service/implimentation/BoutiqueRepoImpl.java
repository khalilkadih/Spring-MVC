/*
package com.youcode.vc.service.implimentation;

import com.youcode.vc.entity.Client;
import com.youcode.vc.entity.Command;
import com.youcode.vc.entity.CommandItem;
import com.youcode.vc.entity.Panier;
import com.youcode.vc.repository.ClientRepository;
import com.youcode.vc.repository.CommandItemRepo;
import com.youcode.vc.service.BoutiqueRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;

public class BoutiqueRepoImpl implements BoutiqueRepo {

    @Autowired
    ClientRepository clientRepository;
    @Autowired
    CommandItemRepo commandItemRepo;

    @Override
    public Command enregistreCommande(Panier panier, Client client) {

*/
/*
    clientRepository.save(client);
*//*

            Command command= new Command();
            command.setClient(client);
            command.setCommandDate(new Date());
            command.setCommandItem((List<CommandItem>) panier.getItem());
            for (CommandItem commandItem:panier.getItem()){
            }
            return null;
        }


}

*/
