
object Q4 extends App{

  val p1=point3(2,3)
  val p2=point3(5,7)
println(p1.invert)
  println(p2.invert)
}
case class point3(a:Int,b:Int){
  def x:Int=a
  def y:Int=b
def invert()=(this.y,this.x)

}