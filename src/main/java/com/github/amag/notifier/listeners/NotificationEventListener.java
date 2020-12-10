package com.github.amag.notifier.listeners;

import com.github.amag.notifier.events.Email;
import com.github.amag.notifier.mappers.EmailMapper;
import com.github.amag.notifier.services.EmailService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class NotificationEventListener  {

    private final EmailService emailService;
    private final EmailMapper emailMapper;

    @EventListener
    @Async
    public void handleEmailNotificationEvent(Email email){
        log.debug("Received simple message {}",email);
        emailService.sendSimpleMessage(emailMapper.emailToSimpleMailMessage(email));
        log.debug("Sent simple message");
    }
}
