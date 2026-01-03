class Fruit{
String name;
String type;
public Fruit(){
}
public Fruit(String name,String type){
this.name=name;
this.type=type;
}
public static void main(String[] args){
Fruit fruit = new Fruit("Apple","kashmir Apple");
System.out.println(fruit.getName());
System.out.println(fruit.getType());
}
public void setName(String name){
this.name=name;
}
public String getName(){
return name;
}
public void setType(String type){
this.type=type;
}
public String getType(){
return type;
}
}
