public class employee{
    string name;
    int age;
    string city;
}

public void display(){
    system.out.println("Name is"+name);
    system.out.println("age is"+age);
    system.out.println("city is"+city;)
}

public static void main(string[] args){
    employee obj=new employee();
    obj.name="Ankita";
    obj.age=21;
    obj.city="Shimla";
    obj.display();
    employee obj2=new employee();
    obj2.name="Anhita";
    obj2.age=25;
    obj2.city="manali";
    obj2.display();

}

}