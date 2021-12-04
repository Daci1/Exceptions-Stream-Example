package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
	    //exceptii: verificate si neverificate
        //neverificate: nullpointer, out of bound index ...
//        String[] nume = new String[3];
//        nume[0] = "andrei";
//        nume[1] = "mara";
//        System.out.println(nume[2]);

//        try{
//            //code
//            System.out.println(nume[3]); // arunca exceptia ArrayIndexOutOfBoundsException
//        }catch(Exception e){
//            e.printStackTrace(); // exceptia este prinsa aici
//        }

//        try{
//            //code
//            System.out.println(nume[3]);
//            System.out.println("aici");
//            System.out.println(nume[2].toUpperCase(Locale.ROOT));
//        }catch(ArrayIndexOutOfBoundsException e){
//            System.out.println("S-a prins exceptia ArrayIndexOutOfBoundsException");
//        }catch(NullPointerException e){
//            System.out.println("S-a prins exceptia NullPointerException");
//        }finally {// se executa mereu, chiar daca nu s-a aruncat o exceptie
//            System.out.println("Done try-catch");
//        }

//        System.out.println("Done");

        String[] users = {"user1", "user2", "user3", "user4", "user5", "user6", "user7"};
        List<String> usersList = new ArrayList<>(Arrays.asList(users));

        try{
            addUser(usersList, "user8");
            addUser(usersList, "user8");
            System.out.println("Linia 46");
        }catch (UserAlreadyExsistsException e){
           e.printStackTrace();
        }finally {
            System.out.println(usersList);
        }


    }

    private static void addUser(List<String> users, String userToAdd) throws UserAlreadyExsistsException{
        for(String user : users){
            if(user.equals(userToAdd)){
                throw new UserAlreadyExsistsException(userToAdd); // daca ajunge, se opreste executia
            }
        }

        users.add(userToAdd);
    }
}
