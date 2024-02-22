class BcaStudent{
    private String name;
    private int age;
    private String address;


    public BcaStudent(String newName, int newAge, String newAddress) {
        name = newName;
        age = newAge;
        address = newAddress;
    }
/* 
    public void setName(String newName){
        name = newName;
    }
    public void setAge(int newAge){
        age = newAge;
    }
    public void setAddress(String newAddress){
        address = newAddress;
    }*/

/* 
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getAddress(){
        return address;
    }*/
    public void display(){
        System.out.println(name + " " + address + " " + age);
    }
}