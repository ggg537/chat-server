package com.a.chatserver.dto;

public record ChatMessage(
        String sender,
        String message
) {
}
