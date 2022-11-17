class Box{
double width,height,depth;
Box(double w,double h,double d){
width=w; height=h; depth=d;}
double vol(){
return width*height*depth;}}
class Boxdemo{
public static void main(String args[])
{
Box mybox=new Box(20,20,12);
System.out.println("the volume is: "+mybox.vol());}}