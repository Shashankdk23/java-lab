//import java.util.*;
class trap{
 public static void main(String[] args)
{
 
 int h[]={4,2,0,6,3,2,5};
 int rh[]=new int[h.length];
int lh[]=new int[h.length];
 for(int i=0;i<h.length;i++)
 {
  for(int j=0;j<=i;j++)
  {
   int l=Math.max(h[h.length-i],h[h.length-j]);
   int k=Math.max(h[i],h[j]);
  lh[i]=Math.max(lh[i],k);
  rh[h.length-i]=Math.max( rh[h.length-i],l);
  }
 }
for(int i=0;i<h.length;i++)
System.out.println(lh[i]);
}
}
