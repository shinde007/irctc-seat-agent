package com.aditya.irctc_seat_agent.service;

import com.aditya.irctc_seat_agent.dto.TrainResponseDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainService {

    public List<TrainResponseDto> searchTrains(
            String source,
            String destination
    ) {

        return List.of(
                new TrainResponseDto(
                        "12155",
                        "Bhopal Express",
                        source,
                        destination
                ),
                new TrainResponseDto(
                        "12722",
                        "Dakshin Express",
                        source,
                        destination
                )
        );
    }
}