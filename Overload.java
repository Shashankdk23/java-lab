class example{
int a,b;
void test(){
a=0;b=0;}
 void test(int c,int d){
a=c;
c=d;
}
int test(int d)
{
a=d;
return a*a;
}
}
class Overload{
public static void main(String args[]){
example e=new example();
 e.test();
System.out.println(e.test);}}