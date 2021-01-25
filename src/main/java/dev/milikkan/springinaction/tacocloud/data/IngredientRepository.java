package dev.milikkan.springinaction.tacocloud.data;

import dev.milikkan.springinaction.tacocloud.domain.Ingredient;

public interface IngredientRepository {

    Iterable<Ingredient> findAll();

    Ingredient findOne(String id);

    Ingredient save(Ingredient ingredient);

}
