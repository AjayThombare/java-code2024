class P8{

public static void main(String[] args)  {

int num = 7853;
int temp = num;
int rem = 0;
int var = 0;

while(num>0) {
rem = num%10;
var = var * 10 + rem;

num = num / 10;


}
System.out.println("Reverse of "+ temp+ " is "+var);
}
}
