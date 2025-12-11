class IntArray{
public static void main(String[] args){
int a[] = {20,30,40,50,60,70,80,90,100};
System.out.println(a[0]);
System.out.println(a[1]);
System.out.println(a[2]);
System.out.println(a[3]);
System.out.println(a[4]);
System.out.println(a[5]);
System.out.println(a[6]);
System.out.println(a[7]);
System.out.println(a[8]);

System.out.println("for loop");
for(int i=0;i<=a.length-1;i++){
System.out.println(a[i]);
}

System.out.println("while loop");
int k=0;
while(k<=a.length-1){
System.out.println(a[k]);
k++;
}

System.out.println("do while loop");
int l=0;
do{
System.out.println(a[l]);
l++;
}while(l<=a.length-1);
{
}
}
}


