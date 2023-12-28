
class Person {

    static int instacesCount = 0;
    String name;
    double salary;

    Person(String name, double salary) {
        
        this.name = name;
        this.salary = salary;
        instacesCount++;
    }

    String getName() {

        return name.toString();
    }

    double getSalary() {

        return salary;
    }

    int getInstances() {

        return instacesCount;
    }
}

class CountInstances {

    public static void main(String[] args) {

        Person P1 = new Person("Vikas", 120.00);
        Person P2 = new Person("Laxman",1000.00);

        System.out.println("Number of instances are : " + Person.instacesCount);
        System.out.println("Number of Instances are : " + P1.getInstances());

        System.out.println(P1.getName());
        System.out.println(P1.getSalary());

        System.out.println(P2.getName());
        System.out.println(P2.getSalary());
    }
}
