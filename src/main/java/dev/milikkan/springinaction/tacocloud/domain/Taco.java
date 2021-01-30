package dev.milikkan.springinaction.tacocloud.domain;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.List;

@Data
public class Taco {

    private Long id;

    @NotNull
    @Size(min = 5, message = "Name must be at least 5 characters long")
    private String name;

    private Date createdAt;

    @NotEmpty
    @Size(min = 1, message = "You must choose at least 1 ingredient")
    private List<String> ingredients;
}
