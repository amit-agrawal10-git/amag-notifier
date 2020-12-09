package com.github.amag.notifier.mappers;

import com.github.amag.notifier.events.Email;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.springframework.mail.SimpleMailMessage;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface EmailMapper {
    Email simpleMailMessageToEmail(SimpleMailMessage simpleMailMessage);
    SimpleMailMessage emailToSimpleMailMessage(Email email);
}
