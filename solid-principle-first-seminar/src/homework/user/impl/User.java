package homework.user.impl;

import homework.user.ReportTable;

public class User implements ReportTable {
    private final String name;

    public User(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    @Override
    public void report(){
        System.out.println("Report for user: " + name);
    }
}


