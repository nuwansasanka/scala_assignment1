import scala.math.sqrt
object case_class extends App {

  val p1=point(2,3)
  val p2=point(5,7)
  val p3=p2.move(1,2)


  println("Addition of P1 and P2 points: "+(p1+p2))
  println("After moving P2: "+p3)
  println("Distance between P1 and P2: "+p1.distance(p2))
  println("Invert of P2: "+p2.invert())

}
case class point(a:Int,b:Int){
  def x:Int=a
  def y:Int=b

  def +(p:point)=point(this.x+p.x,this.y+p.y)
  def move(dx:Int,dy:Int)=point(this.x+dx,this.y+dy)
  def distance(pi:point):Double=sqrt((this.x-pi.x)*(this.x-pi.x)+(this.y-pi.y)*(this.y-pi.y))
  def invert()=(this.y,this.x)
}
