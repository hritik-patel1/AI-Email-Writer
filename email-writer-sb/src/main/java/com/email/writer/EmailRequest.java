package com.email.writer;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class EmailRequest {
    private String emailContent;
    private String tone;
}
