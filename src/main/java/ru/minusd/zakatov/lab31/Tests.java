package ru.minusd.zakatov.lab31;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import ru.minusd.zakatov.lab29.extensions.IllegalTableNumber;
import ru.minusd.zakatov.lab29.extensions.OrderAlreadyAddedException;
import ru.minusd.zakatov.lab29.items.Dish;
import ru.minusd.zakatov.lab29.items.Drink;
import ru.minusd.zakatov.lab29.items.DrinkTypeEnum;
import ru.minusd.zakatov.lab29.items.MenuItem;
import ru.minusd.zakatov.lab29.managers.TableOrdersManager;
import ru.minusd.zakatov.lab29.orders.Order;
import ru.minusd.zakatov.lab29.orders.TableOrder;

import java.util.List;

public class Tests {
    private static Order order;
    private static List<MenuItem> items;
    private static TableOrdersManager ordersManager;

    @BeforeAll
    public static void setup() {
        order = new TableOrder(5);
        ordersManager = new TableOrdersManager(1);
        items = List.of(
                new Drink(300, "Wine", "Red European Wine", 13, DrinkTypeEnum.WINE),
                new Dish(1000, "Fish", "Fish")
        );
    }

    @Test
    public void testTableOrder() {
        for (var i : items) {
            order.add(i);
            ordersManager.add(i, 0);
        }

        Assertions.assertEquals(2, order.itemsQuantity());
        Assertions.assertEquals(1300, order.costTotal());
        Assertions.assertThrowsExactly(OrderAlreadyAddedException.class, () -> {
           ordersManager.add(order, 0);
        });
        Assertions.assertThrowsExactly(IllegalTableNumber.class, () -> {
            ordersManager.add(order, 1);
        });
    }
}
