package com.example.account.dto;

import lombok.*;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

public class DeleteAccount {

    //계좌 삭제 시 요청정보
    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Request{
        @NotNull
        @Min(1)
        private Long userId;

        @NotBlank
        @Size(min = 10, max =10)
        private String accountNumber;
    }

    //계좌 삭제 시 반환정보
    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class Response{
        private Long userId;
        private String accountNumber;
        private LocalDateTime unregisteredAt;

        //accountdto에서 데이터를 가져옴
        public static Response from(AccountDto accountDto){
            return Response.builder()
                    .userId(accountDto.getUserId())
                    .accountNumber(accountDto.getAccountNumber())
                    .unregisteredAt(accountDto.getUnregisteredAt())
                    .build();
        }


    }

}
