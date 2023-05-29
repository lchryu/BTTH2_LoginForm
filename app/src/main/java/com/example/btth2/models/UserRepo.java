package com.example.btth2.models;

import java.util.ArrayList;

public class UserRepo {
    static public ArrayList<User> userList = new ArrayList<>();

    public UserRepo() {
        userList.add(new User("adm", "adm"));
    }
}
