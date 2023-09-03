package dev.melnikova.restfulapiexample.model;

public class Client {
    private final String id;
    private final String name;
    private final Integer age;
    private final String email;

    public Client(final String id,
                  final String name,
                  final Integer age,
                  final String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }
}
