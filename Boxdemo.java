class Box{
double width,height,breath;
double vol(){
return width*height*breath;}}
class Boxdemo{
public static void main(String args[])
{
 Box mybox=new Box();
 mybox.width=10;
 mybox.height=20;
 mybox.breath=30;
 double v=mybox.vol();
System.out.println(v);
}}