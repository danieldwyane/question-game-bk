package com.juego.preguntas.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ApiResponse {
    private Boolean success;
    private String message;
    private Object data;

    public ApiResponse() {
    }

    public ApiResponse(Boolean success) {
        this.success = success;
    }

    public ApiResponse(String message) {
        this.message = message;
    }

    public ApiResponse(Boolean success, String message) {
        this.success = success;
        this.message = message;
    }

    public ApiResponse(String message, Object data) {
        this.message = message;
        this.data = data;
    }
}