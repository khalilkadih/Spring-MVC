package com.youcode.vc.service;

import com.youcode.vc.entity.CommandItem;

import java.util.List;

public interface CommandeItemService {
    List<CommandItem> COMMAND_ITEM_LIST();
    CommandItem saveCommandeItem(CommandItem commandItem);
    CommandItem  updateCommandeItem(CommandItem commandItem,Long id);
    void deleteCommandeItem(Long id);

}

