package ru.yandex.practicum.filmorate.model;

import lombok.Data;

import jakarta.validation.constraints.*;
import java.time.LocalDate;

@Data
public class User {
    private Integer id;

    @NotBlank(message = "Email cannot be blank")
    @Email(message = "Email should be valid")
    private String email;

    @NotBlank(message = "Login cannot be blank")
    @Pattern(regexp = "^\\S+$", message = "Login cannot contain spaces")
    private String login;

    private String name;

    @PastOrPresent(message = "Birthday cannot be in the future")
    private LocalDate birthday;
}