package homework.persister.impl;

import homework.persister.SaveTable;
import homework.user.impl.User;

public class Persister implements SaveTable {
    private final User user;

    public Persister(User user){
        this.user = user;
    }

    public void save(){
        System.out.println("Save user: " + user.getName());
    }
}
