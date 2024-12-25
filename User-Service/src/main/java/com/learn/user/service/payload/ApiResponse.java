package com.learn.user.service.payload;

import lombok.*;
import org.springframework.http.HttpStatus;
@Getter
@Setter
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class ApiResponse {
    private String message;
    private boolean success;
    private HttpStatus status;
}
