import scala.math.sqrt
object Q3 extends App{
  val p1=point2(2,3)
  val p2=point2(5,7)

  println(p1.distance(p2))

}
case class point2(a:Int,b:Int){
  def x:Int=a
  def y:Int=b

  def distance(pi:point2):Double=sqrt((this.x-pi.x)*(this.x-pi.x)+(this.y-pi.y)*(this.y-pi.y))
}

