class Tempareture{
public static void main(String[] args){
int value = 10;
tempreture(value);
}
public static void tempreture(int value){
if(value > 60){
System.out.println("tempreture is very hot");
}
else if(value >= 50){
System.out.println("tempreture is hot");
}
else if(value > 40){
System.out.println("tempreture is warm");
}
else{
System.out.println("tempreture is cold");
}
}
}