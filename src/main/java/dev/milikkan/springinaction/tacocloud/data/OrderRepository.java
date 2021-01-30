package dev.milikkan.springinaction.tacocloud.data;

import dev.milikkan.springinaction.tacocloud.domain.Order;

public interface OrderRepository {
    Order save(Order order);
}
