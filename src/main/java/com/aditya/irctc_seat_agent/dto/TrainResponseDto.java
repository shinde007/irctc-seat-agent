package com.aditya.irctc_seat_agent.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TrainResponseDto {

    private String trainNumber;

    private String trainName;

    private String source;

    private String destination;
}