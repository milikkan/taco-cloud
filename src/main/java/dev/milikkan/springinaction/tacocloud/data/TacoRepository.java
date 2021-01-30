package dev.milikkan.springinaction.tacocloud.data;

import dev.milikkan.springinaction.tacocloud.domain.Taco;

public interface TacoRepository {
    Taco save(Taco taco);
}
