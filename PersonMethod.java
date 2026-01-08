class PersonMethod{
String name;
String section;
public String getDetails(){
return "StudentName";
}
public String getDetails(String section){
if(section.equals("A")){
return "belongs to A section";
}else if(section.equals("B")){
return "belongs to B section";
}
return "non of the  two section";
}
public void setName(String name){
this.name=name;
}
public String getName(){
return name;
}
public void setSection(String section){
this.section=section;
}
public String getSection(){
return section;
}
}