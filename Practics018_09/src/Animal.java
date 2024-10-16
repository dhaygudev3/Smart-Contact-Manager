public class Animal implements Comparable<Animal> {
    int id;
    String name;
    int age ;

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


    public Animal(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }


    @Override
    public int compareTo(Animal o) {
        return this.age-o.age;
    }
}
