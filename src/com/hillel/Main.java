package com.hillel;

import com.hillel.jdbc.db.WorkDB;

public class Main {
    public static void main(String[] args) {

        WorkDB db = new WorkDB();

        System.out.println(db.findFilmsForYear(2018,2019));
        System.out.println(db.findActorForFilm("Aliens"));
        System.out.println(db.findAcror(2));
        System.out.println(db.findActorAsDirector());
        db.deleteFilm(1986);
    }
}
