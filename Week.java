class Week{
public static void main(String[] args){
int value = 7;
dayInWeek(value);
}
public static void dayInWeek(int value){
if(value==3){
System.out.println("Monday");
}
else if(value==1){
System.out.println("tuesday");
}
else if(value==2){
System.out.println("wednesday");
}
else if(value==3){
System.out.println("thursday");
}
else if(value==4){
System.out.println("friday");
}
else if(value==5){
System.out.println("saturday");
}
else {
System.out.println("no day present in week");
}
}
}