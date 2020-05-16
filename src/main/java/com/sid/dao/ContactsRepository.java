package com.sid.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sid.entities.Contacts;

public interface ContactsRepository extends JpaRepository<Contacts, Long>{

}
