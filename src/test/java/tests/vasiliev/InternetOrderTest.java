package tests.vasiliev;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.minusd.vasiliev.lab31.classes.Customer;
import ru.minusd.vasiliev.lab31.classes.items.MenuItem;
import ru.minusd.vasiliev.lab31.classes.orders.InternetOrder;

import static org.junit.jupiter.api.Assertions.*;

class InternetOrderTest {

    @Test
    @DisplayName("Добавление элемента в заказ")
    void add() {
        var order = new InternetOrder(null);
        assertTrue(order.add(new MenuItem(1, "", "")));
    }

    @Test
    @DisplayName("Получение списка названий элементов заказа")
    void itemsNames() {
        var order = new InternetOrder(null);
        order.add(new MenuItem(1, "item1", ""));
        order.add(new MenuItem(2, "item2", ""));
        order.add(new MenuItem(3, "item3", ""));
        var names = order.itemsNames();
        assertEquals("item1", names[0]);
        assertEquals("item2", names[1]);
        assertEquals("item3", names[2]);
    }

    @Test
    @DisplayName("Получение количества элементов в заказе")
    void itemsQuantity() {
        var order = new InternetOrder(null);
        order.add(new MenuItem(1, "item1", ""));
        order.add(new MenuItem(2, "item2", ""));
        order.add(new MenuItem(3, "item3", ""));
        assertEquals(3, order.itemsQuantity());
    }

    @Test
    @DisplayName("Получение количества элементов с заданным названием в заказе")
    void testItemsQuantity() {
        var order = new InternetOrder(null);
        order.add(new MenuItem(1, "item1", ""));
        order.add(new MenuItem(2, "item2", ""));
        order.add(new MenuItem(3, "item3", ""));
        order.add(new MenuItem(4, "item1", ""));
        assertEquals(2, order.itemsQuantity("item1"));
    }

    @Test
    @DisplayName("Получение количества элементов, равных данному, в заказе")
    void testItemsQuantity1() {
        var order = new InternetOrder(null);
        var testItem = new MenuItem(4, "item1", "");
        var items = new MenuItem[] {
                testItem,
                new MenuItem(2, "item2", ""),
                new MenuItem(3, "item3", ""),
                testItem
        };
        for (var item : items) {
            order.add(item);
        }
        assertEquals(2, order.itemsQuantity(testItem));
    }

    @Test
    @DisplayName("Получение массива позиций заказа")
    void getItems() {
        var items = new MenuItem[] {
                new MenuItem(1, "item1", ""),
                new MenuItem(2, "item2", ""),
                new MenuItem(3, "item3", ""),
                new MenuItem(4, "item4", "")
        };
        var order = new InternetOrder(null);
        for (var item: items) {
            order.add(item);
        }
        var orderItems = order.getItems();
        for (int i = 0; i < items.length; i++) {
            assertEquals(items[i], orderItems[i]);
        }
    }

    @Test
    @DisplayName("Удаление элемента заказа по названию")
    void remove() {
        var order = new InternetOrder(null);
        var items = new MenuItem[] {
                new MenuItem(1, "item1", ""),
                new MenuItem(2, "item2", ""),
                new MenuItem(3, "item3", ""),
                new MenuItem(4, "item4", "")
        };
        for (var item: items) {
            order.add(item);
        }
        assertTrue(order.remove("item2"));
        assertEquals(3, order.itemsQuantity());
        assertEquals(order.getItems()[1], items[2]);
    }

    @Test
    @DisplayName("Удаление элемента заказа по значению")
    void testRemove() {
        var order = new InternetOrder(null);
        var items = new MenuItem[] {
                new MenuItem(1, "item1", ""),
                new MenuItem(2, "item2", ""),
                new MenuItem(3, "item3", ""),
                new MenuItem(4, "item4", "")
        };
        for (var item: items) {
            order.add(item);
        }
        assertTrue(order.remove(items[2]));
        assertEquals(3, order.itemsQuantity());
        assertEquals(order.getItems()[2], items[3]);
    }

    @Test
    @DisplayName("Удаление всех позиций заказа с заданным именем")
    void removeAll() {
        var order = new InternetOrder(null);
        var items = new MenuItem[] {
                new MenuItem(1, "item1", ""),
                new MenuItem(2, "item2", ""),
                new MenuItem(3, "item3", ""),
                new MenuItem(4, "item1", "")
        };
        for (var item: items) {
            order.add(item);
        }
        assertEquals(2, order.removeAll("item1"));
        assertEquals(2, order.itemsQuantity());
        assertEquals(order.getItems()[0], items[1]);
        assertEquals(order.getItems()[1], items[2]);
    }

    @Test
    @DisplayName("Удаление всех позиций заказа, равных переданному")
    void testRemoveAll() {
        var order = new InternetOrder(null);
        var items = new MenuItem[] {
                new MenuItem(1, "item1", ""),
                new MenuItem(2, "item2", ""),
                new MenuItem(3, "item3", ""),
                new MenuItem(4, "item1", "")
        };
        for (var item: items) {
            order.add(item);
        }
        assertEquals(1, order.removeAll(items[0]));
        assertEquals(3, order.itemsQuantity());
        assertEquals(order.getItems()[0], items[1]);
    }

    @Test
    @DisplayName("Сортировка по убыванию цены")
    void sortedItemsByCostDesc() {
        var order = new InternetOrder(null);
        var items = new MenuItem[] {
                new MenuItem(1, "item1", ""),
                new MenuItem(2, "item2", ""),
                new MenuItem(3, "item3", ""),
                new MenuItem(4, "item4", "")
        };
        for (var item: items) {
            order.add(item);
        }
        var sortedItems = order.sortedItemsByCostDesc();
        for (int i = 0; i < items.length; i++) {
            assertEquals(items[items.length - i - 1], sortedItems[i]);
        }
    }

    @Test
    @DisplayName("Получение полной стоимости заказа")
    void costTotal() {
        var order = new InternetOrder(null);
        var items = new MenuItem[] {
                new MenuItem(1, "item1", ""),
                new MenuItem(2, "item2", ""),
                new MenuItem(3, "item3", ""),
                new MenuItem(4, "item4", "")
        };
        for (var item: items) {
            order.add(item);
        }
        assertEquals(10, order.costTotal());
    }

    @Test
    @DisplayName("Установка посетителя, связанного с заказом")
    void setCustomer() {
        var order = new InternetOrder(null);
        order.setCustomer(Customer.MATURE_UNKNOWN_CUSTOMER);
        assertEquals(Customer.MATURE_UNKNOWN_CUSTOMER, order.getCustomer());
    }

    @Test
    @DisplayName("Нагрузочное тестирование добавления и удаления позиций заказа")
    void loadTest() {
        var order = new InternetOrder(null);
        var items = new MenuItem[100000];
        for (int i = 0; i < items.length; i++) {
            items[i] = new MenuItem(i, "item" + i, "");
        }
        for (var item: items) {
            order.add(item);
        }
        for (var item: items) {
            order.remove(item);
        }
        assertEquals(0, order.itemsQuantity());
    }
}