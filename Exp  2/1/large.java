
class large{
public static void main(String args[]){
int a,b,c;
a=Integer.parseInt(args[0]);
b=Integer.parseInt(args[1]);
c=Integer.parseInt(args[2]);
if(a>b&&a>c){
System.out.println("greatest number is " + a);
}
else if(b>a&&b>c){
System.out.println("greatest number is " + b);
}
else{

System.out.println("greatest number is " + c);
}
}
}