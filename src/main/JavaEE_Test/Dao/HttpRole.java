package Dao;

import com.fasterxml.jackson.annotation.JsonProperty;

public class HttpRole {

    private int id;

    private String name;

    @Override
    public String toString() {
        return "HttpRole{" +
                "id=" + id +
                ", name=" + name +
                '}';
    }
}
