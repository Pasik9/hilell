package com.hillel.jdbc.staff;

import java.sql.*;

public class Actor extends Personnel {

    public Actor(int id, String name, String date) {
        super(id, name, date);
    }

    public Actor(String name) {
        super(name);
    }

}
