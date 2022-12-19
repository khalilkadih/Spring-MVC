package com.youcode.vc.repository;

import com.youcode.vc.entity.Command;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommandRepository extends JpaRepository<Command,Long> {
    Command findCommandByReferenceLike(String s);
    void deleteByReference(String Ref);

}
