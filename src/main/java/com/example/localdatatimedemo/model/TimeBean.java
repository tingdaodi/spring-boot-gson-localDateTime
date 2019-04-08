package com.example.localdatatimedemo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * Description TODO
 *
 * @author Roye.L
 * @since 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TimeBean {
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime nowTime;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate nowDate;

}
