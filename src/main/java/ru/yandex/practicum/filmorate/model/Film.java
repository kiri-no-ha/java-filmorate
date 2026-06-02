package ru.yandex.practicum.filmorate.model;

import lombok.Getter;
import lombok.Setter;

@Data
public class Film {
    private Integer id;

    @NotBlank
    private String name;

    @Size(max = 200)
    private String description;

    private LocalDate releaseDate;

    @Positive
    private int duration;
}
