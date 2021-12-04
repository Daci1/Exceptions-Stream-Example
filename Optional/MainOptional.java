package Optional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

//se foloseste pentru a se evita NullPointerException
//nu se face get fara a se verifica daca e prezent
public class MainOptional {
    public static void main(String[] args) {
        String[] users = {"user1", "user2", "user3", "user4", "user5", "user6", "user7"};
        List<String> usersList = new ArrayList<>(Arrays.asList(users));
        usersList.set(2, null);
        Optional<String> optionalUser = Optional.ofNullable(usersList.get(2));

        if(optionalUser.isPresent()){
            System.out.println(optionalUser.get());
        }

        if(optionalUser.isEmpty()){
            System.out.println("Nu exista user pe pozitia cautata");
        }
    }

}
