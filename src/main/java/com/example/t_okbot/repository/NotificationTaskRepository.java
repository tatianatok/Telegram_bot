package com.example.t_okbot.repository;

import com.example.t_okbot.entity.NotificationTask;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDateTime;
import java.util.List;


public interface NotificationTaskRepository extends JpaRepository<NotificationTask, Long> {


    List<NotificationTask> findAllByNotificationDateTime(LocalDateTime localDateTime);


    //List<NotificationTask> findAllByNotificationDateTimeAndAndChatId(LocalDateTime localDateTime,
                                                                     //long chatID);

   // @Query(value = "SELECT nt.* FROM notification_task nt INNER JOIN user u ON nt.user_id=u.id WHERE u.name like %:nameLke%", nativeQuery = true)
   // List<NotificationTask> findAllByNameLike(@Param("nameLike")String nameLike);

   // @Modifying
   // @Query("DELETE FROM NotificationTask WHERE message like %:nameLike%")
   // void removeAllLike(@Param("nameLike") String nameLike);
}
