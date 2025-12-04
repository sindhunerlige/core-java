class Voting {
public static void main(String[] args){
int age = 18;
eligibleForVoting(age);
}
public static void eligibleForVoting(int age){
if(age <18){
System.out.println("Not eligible for voting");
}
else{
System.out.println("eligible for voting");
}
}
}

