package com.aditya.irctc_seat_agent.exception;

public class TrainNotFoundException extends RuntimeException {

    public TrainNotFoundException(String message) {
        super(message);
    }
}