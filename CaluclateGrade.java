class CaluclateGrade {
public static void main(String[] args) {
int marks = 90;
String grade = CaluclateGrade.caluclateGrade(marks);
System.out.println(grade);
}

public static String caluclateGrade(int marks) {
 if(marks == 90){
 return "A+";
}
 if(marks == 80) {
return "A";
}
if(marks == 70) {
return "B+";
}
if(marks == 60){
return "B";
}
if(marks == 50){
return "C";
}
if(marks == 35){
return "fail";
}
return "invalid number";
}
}



