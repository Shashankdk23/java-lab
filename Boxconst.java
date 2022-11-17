class Box{
double width,height,depth;
Box(){
 width=19;
 height=10;
 depth=1;}
double vol()
{
return width*height*depth;}
}
class Boxdemo{
public static void main(String args[]){
Box mybox=new Box();
System.out.println("The volume is:"+mybox.vol());}}