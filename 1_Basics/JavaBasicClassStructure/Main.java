class Main {
    public static void main(String[] args) {
        
        /*
        * Using the all argument constructor of and getters of Person
        */
        Person person1 = new Person("James", "Dillon", 26);
        System.out.println("Person 1 name:" + person1.getFirstName() + " " + person1.getLastName() 
                            + " and " + person1.getAge() + " years of age.");


        /*
        * Using getters and setters of Person
        */
        Person person2 = new Person();
        person2.setFirstName("Adam");
        person2.setLastName("Gilcrist");
        person2.setAge(39);
        System.out.println("Person 2 name:" + person2.getFirstName() + " " + person2.getLastName() 
                            + " and " + person2.getAge() + " years of age.");

    }
}