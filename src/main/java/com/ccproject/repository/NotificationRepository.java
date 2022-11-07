package com.ccproject.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ccproject.entities.Notification;



@Repository
public interface NotificationRepository extends CrudRepository<Notification, Long> {

}
