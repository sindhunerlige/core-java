class MonthOfTheYear{
public static void main(String[] args){
int month = 7;
if(month == 0){
System.out.println("january");
}else if(month==1){
System.out.println("february");
}else if(month==2){
System.out.println("march");
}else if(month==3){
System.out.println("april");
}else if(month==4){
System.out.println("may");
}else if(month==5){
System.out.println("june");
}else if(month==6){
System.out.println("july");
}else if(month==7){
System.out.println("august");
}else if(month==8){
System.out.println("september");
}else{
System.out.println("invalid month");
}
switch(month){
case 1 :System.out.println("january");
         break;
case 2 : System.out.println("february");
        break;
case 3 : System.out.println("march");
        break;
case 4 : System.out.println("april");
        break;
case 5 : System.out.println("may");
        break;	
case 6 : System.out.println("june");
        break;	
case 7 : System.out.println("july");
        break;
case 8 : System.out.println("august");
        break;	
default : System.out.println("invalid month");	
}
}
}
