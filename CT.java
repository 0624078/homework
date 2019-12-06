abstract class CShape{
    protected String color;
    
    public void setcoler(String str){
        color=str;  
      }

      
  
   public void show();
}

class CTriangle extends CShape{
 double llong,width,hypotenuse
 public void setside(double a,b,c){
 llong=a;
 width=b;
 hypotenuse=c;
 }
 
 public void show(){
 System.out.print("面積為:"+llong*width/2)
 System.out.print("color:"+color)
 }
public static void main(String[] args){
CTriangle c=new CTriangle("red");
c.setside(3,4,5);
c.show();

} 

}
