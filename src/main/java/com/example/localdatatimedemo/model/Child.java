package com.example.localdatatimedemo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * Description TODO
 *
 * @author Roye.L
 * @date 2019/4/8 23:07
 * @since 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Child {
    private String firstName;
    private String lastName;
    private LocalDateTime dateTimeofBirth;

}
