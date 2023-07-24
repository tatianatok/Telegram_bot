package com.example.t_okbot.repository;

import com.example.t_okbot.entity.NotificationTask;
import org.springframework.data.jpa.repository.JpaRepository;


public interface NotificationTaskRepository extends JpaRepository<NotificationTask, Long> {
}
