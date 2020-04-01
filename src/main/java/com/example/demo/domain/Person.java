package com.example.demo.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor
public class Person {

    @Id
    private Long id;

    @NonNull
    private String firstName;
    @NonNull
    private String lastName;
}
