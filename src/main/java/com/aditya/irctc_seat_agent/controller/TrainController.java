package com.aditya.irctc_seat_agent.controller;

import com.aditya.irctc_seat_agent.dto.ApiResponse;
import com.aditya.irctc_seat_agent.dto.TrainResponseDto;
import com.aditya.irctc_seat_agent.service.TrainService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/trains")
@RequiredArgsConstructor
public class TrainController {

    private final TrainService trainService;

    @GetMapping("/search")
    public ApiResponse<List<TrainResponseDto>> searchTrains(
            @RequestParam String source,
            @RequestParam String destination
    ) {

        List<TrainResponseDto> trains =
                trainService.searchTrains(source, destination);

        return new ApiResponse<>(
                true,
                "Trains fetched successfully",
                trains
        );
    }
}