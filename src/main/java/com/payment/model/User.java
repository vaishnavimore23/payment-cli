package com.payment.model;

import java.util.Objects;
import java.util.UUID;

public class User {
    private String UserID;
    private String name;
    private String email;

    public User(String name, String email) {
        this.UserID = UUID.randomUUID().toString();
        this.name = name;
        this.email = email;
    }

    public String getUserID() {
        return UserID;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof User))
            return false;
        User user = (User) o;
        return Objects.equals(UserID, user.UserID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(UserID);
    }

    @Override
    public String toString() {
        return String.format("User{id='%s', name='%s', email='%s'}", UserID, name, email);
    }

}
