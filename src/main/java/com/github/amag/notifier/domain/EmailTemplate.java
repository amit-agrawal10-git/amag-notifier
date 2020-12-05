package com.github.amag.notifier.domain;


import com.arangodb.entity.KeyType;
import com.arangodb.springframework.annotation.Document;
import com.arangodb.springframework.annotation.HashIndex;
import com.github.amag.platform.domain.BaseObject;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Document(value = "email_templates", keyType = KeyType.uuid, allowUserKeys = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EmailTemplate extends BaseObject {

    private String key;
    private Date dateValue;
    private Boolean booleanValue;
    private Double doubleValue;
    private String stringValue;

}


