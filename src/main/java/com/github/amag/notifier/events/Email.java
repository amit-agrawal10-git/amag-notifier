package com.github.amag.notifier.events;

import lombok.Builder;
import lombok.Data;
import org.springframework.lang.Nullable;

import java.io.Serializable;

@Builder
@Data
public class Email implements Serializable {

    @Nullable
    private String from;
    @Nullable
    private String[] to;
    @Nullable
    private String subject;
    @Nullable
    private String text;

}
