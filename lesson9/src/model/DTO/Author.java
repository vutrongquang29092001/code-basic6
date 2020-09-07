package model.DTO;


import java.util.UUID;
import java.util.Date;

public class Author {
   String id = UUID.randomUUID().toString();
   String name;
   int age;
   Date birthday;

    public Author() {
    }

    public Author(String name, int age, Date birthday) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Author{" + "id=" + id + ", name=" + name + ", age=" + age + ", birthday=" + birthday + '}';
    }
    
}
