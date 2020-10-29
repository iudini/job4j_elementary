package ru.job4j.pojo;

import java.util.Date;

public class Police {
    public static void main(String[] args) {
        License license = new License();
        license.setOwner("Petr Arcadievich");
        license.setModel("Bentley");
        license.setCode("x111xx111");
        license.setCreated(new Date());

        System.out.println(license.getOwner() + " has a car " + license.getModel() + " : " + license.getCode());
    }
}
