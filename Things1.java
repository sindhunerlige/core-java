class Things1 extends Thing{
public String getPen(String pen){
if(pen.equals("redpen")){
return "i have red pen";
}else if(pen.equals("bluepen")){
return "i have blue pen";
}
return "have non of the pen";
}
}