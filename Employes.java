class Employes{
String name;
int salary;
public Employes(){
}
public Employes(String name,int salary){
this.name=name;
this.salary=salary;
}
public static void main(String[] args){
Employes employes = new Employes();
System.out.println(employes.getName());
System.out.println(employes.getSalary());
}
public void setName(String name){
this.name=name;
}
public String getName(){
return name;
}
public void setSalary(int salary){
this.salary=salary;
}
public int getSalary(){
return salary;
}
}