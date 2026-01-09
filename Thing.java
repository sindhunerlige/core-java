class Thing{
String pen;
String book;
public String getThing(){
return "penname";
}
public String getThing(String pen){
if(pen.equals("redpen")){
return "pen is redpen";
}else if(pen.equals("bluepen")){
return "pen is bluepen";
}
return getPen();
}
public void setPen(String pen){
this.pen=pen;
}
public String getPen(){
return pen;
}
public void setBook(String book){
this.book=book;
}
public String getBook(){
return book;
}
}