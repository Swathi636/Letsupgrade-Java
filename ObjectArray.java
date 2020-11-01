class ObjectArray{
public static void main(String args[]){
Account obj[] = new Account[1] ;
obj[0] = new Account();
obj[0].setData(1,2);
System.out.println("For Array Element 0");
obj[0].showData();
}
}
class Account{
int a;
int b;
public void setData(int c,int d){
a=c;
b=d;
}
public void showData(){
System.out.println("Value of a ="+a);
System.out.println("Value of b ="+b);
}
}