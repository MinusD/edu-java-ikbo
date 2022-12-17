package alsu;

import org.junit.Test;
import ru.minusd.gizatullina.lab29.*;

public class TestTest {
    @Test()
    public void test() {

        Dish dish1 = new Dish("1", "dish1", 100);
        Dish dish2 = new Dish("2", "dish2", 200);
        Dish dish3 = new Dish("3", "dish3", 300);
        Drink dish4 = new Drink("3", "drink1", 400);
        Drink dish5 = new Drink("2", "drink2", 455);

        OrderManager orderManager = new OrderManager();
        RestaurantOrder restaurantOrder = new RestaurantOrder();
        restaurantOrder.add(dish1);
        InternetOrder internetOrder = new InternetOrder();
        internetOrder.add(dish2);
    }
}
