package education.cursor.milestone2;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class MilestoneMain2 {

    public static void main(String[] args) {

        User user1 = new User("user1@gmail.com", LocalDate.of(2022, 1, 1), "Alpha");
        User user2 = new User("user2@gmail.com", LocalDate.of(2022, 1, 2), "Alpha");
        User user3 = new User("user3@gmail.com", LocalDate.of(2022, 1, 21), "Lambda");
        User user4 = new User("user4@gmail.com", LocalDate.of(2022, 1, 22), "Lambda");
        User user5 = new User("user5@gmail.com", LocalDate.of(2022, 1, 23), "Nuts");

        List<User> userList = new ArrayList<>();
        Collections.addAll(userList, user1, user2, user3, user4, user5);
        System.out.println("It's a list of users: ");
        userList.forEach(System.out::println);

        var userList2 = userList.stream()
                .filter(it -> it.getLoginDate().isAfter(LocalDate.now().minusDays(7)))
                .collect(Collectors.groupingBy(User::getTeam));

        System.out.println("\nIt's a map of users logged in after a week ago: \n" + userList2);

    }
}
