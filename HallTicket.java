class HallTicket{
public static void main(String[] args){
String hallticket = "yes";
String hallticketissue = hallTicketissue(hallticket);
System.out.println(hallticketissue);
}
public static String hallTicketissue( String hallticket){
if(hallticket == "yes"){
return "allow to write a exam";
}
if(hallticket == "No"){
return "do not allow to write a exam";
}
return "hallTicketissue";
}
}
