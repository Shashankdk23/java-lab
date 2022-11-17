class Box{
double w,h,b;
void setdim(double w,double h,double b)
{
 this.w=w;
this.h=h;
this.b=b;
}
double vol(){
return w*h*b;}}
class Boxdemo{
public static void main(String args[]){
Box mybox1=new Box();
mybox1.setdim(43,23,22);
System.out.println("the volume is"+mybox1.vol());}}