class Box{
double wid,hei,bre;
void setdim(double w,double h,double b)
{
 wid=w;
hei=h;
bre=b;
}
double vol(){
return wid*hei*bre;}}
class Boxdemo{
public static void main(String args[]){
Box mybox1=new Box();
mybox1.setdim(43,23,22);
System.out.println("the volume is"+mybox1.vol());}}