package com.example.wherebnb.dto.host;

import com.example.wherebnb.entity.Rooms;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Getter
@NoArgsConstructor
public class HostResponseDto {
    private Long roomId;
    private String imageUrl; // 이미지 url
    private String location; // 숙소위치
    private int price; // 가격
    private LocalDate startDate; // 시작날짜
    private LocalDate endDate; // 종료날짜
    private String createdAt; // 등록일
    private boolean likeStatus; // 좋아요 갯수

    public HostResponseDto(Rooms room) {
        this.roomId = room.getId();
        this.imageUrl = "image_url";
        this.location = room.getLocation();
        this.price = room.getPrice();
        this.startDate = room.getCheckInDate();
        this.endDate = room.getCheckOutDate();
        this.createdAt = room.getCreatedAt().format(DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm"));
        this.likeStatus = false;
    }

    public HostResponseDto(Rooms room, boolean likeStatus) {
        this.imageUrl = "image_url";
        this.location = room.getLocation();
        this.price = room.getPrice();
        this.startDate = room.getCheckInDate();
        this.endDate = room.getCheckOutDate();
        this.createdAt = room.getCreatedAt().format(DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm"));
        this.likeStatus = likeStatus;
    }
}
