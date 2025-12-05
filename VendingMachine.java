class VendingMachine{
public static void main(String[] args){
int value = 2;
vendingMachine(value);
}
public static void vendingMachine(int value){
if(value==0){
System.out.println("machine provide water");
}
else if(value == 1){
System.out.println("machine provide tea");
}
else if(value == 2) {
System.out.println("machine provide coffe");
}
else if(value >= 3){
System.out.println("machine provide boost");
}
else {
System.out.println("machine will not provide anything");
}
}
}


