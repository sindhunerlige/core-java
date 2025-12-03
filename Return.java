class Return {
public static void main(String[] args) {
int add = addition();
System.out.println(add);
String walk = walking();
System.out.println(walk);
char b = sleepy();
System.out.println(b);
Boolean d = exam();
System.out.println(d);
float c = num();
System.out.println(c);
}
public static int addition(){
int num1 = 35;
int num2 = 76;
int result = num1+ num2;
return result;
}
public static String walking(){
String a = "walking";
return a;
}
public static char sleepy(){
char b = 'd';
return b;
}
public static float num(){
float c = 87.9f;
return c;
}
public static boolean exam(){
boolean d = true;
return d;
}
 }

