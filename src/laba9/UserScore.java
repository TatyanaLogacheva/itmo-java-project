package laba9;

import java.util.*;

public class UserScore {
    public static void main(String[] args) {
        Map<User, Integer> map = new HashMap<>();
        map.put(new User("Mark"), 86);
        map.put(new User("Bill"), 74);
        map.put(new User("Alice"), 86);
        map.put(new User("Kate"), 92);
        map.put(new User("Ron"), 96);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String userName = scanner.next();
        Set<User> keys = map.keySet();

        for (User key : keys) {
            if (key.getName().equals(userName)) {
                System.out.println("Количество очков пользователя: " + map.get(key));
            }

        }
    }
}
