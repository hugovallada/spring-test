package com.github.hugovallada.springboottestingprimer.collaborators;

import java.time.Instant;

public class Collaborator {
    private String name;
    private int age;

    public Collaborator(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isCurrentInStockOfCompetitor(String productName) {
        return Instant.now().toEpochMilli() % 2 == 0;
    }

    public void notify(String productName) {
        System.out.println(productName);
    }

}
