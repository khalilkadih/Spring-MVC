package com.youcode.vc.repository;

import com.youcode.vc.entity.CommandItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommandItemRepo extends JpaRepository<CommandItem ,Long> {
}
