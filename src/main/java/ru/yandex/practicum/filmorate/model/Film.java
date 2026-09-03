package ru.yandex.practicum.filmorate.model;

import lombok.Data;

import jakarta.validation.constraints.*;
import java.time.LocalDate;

@Data
public class Film {
    private Integer id;

    @NotBlank(message = "Name cannot be blank")
    private String name;

    @Size(max = 200, message = "Description length must not exceed 200 characters")
    private String description;

    @NotNull(message = "Release date cannot be null")
    private LocalDate releaseDate;

    @Positive(message = "Duration must be positive")
    private int duration;
}