package com.example.t_okbot.service;

import com.example.t_okbot.entity.NotificationTask;
import com.example.t_okbot.repository.NotificationTaskRepository;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    private final NotificationTaskRepository notificationTaskRepository;

    public NotificationService(NotificationTaskRepository notificationTaskRepository) {
        this.notificationTaskRepository = notificationTaskRepository;
    }

    public void save(NotificationTask notificationTask){
        notificationTaskRepository.save(notificationTask);
    }
}
