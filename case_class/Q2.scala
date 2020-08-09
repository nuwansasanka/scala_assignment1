object Q2 extends App{
  val p1=point1(2,3)
  val p2=point1(3,5)
val p3=p1.move(1,2)
  val p4=p2.move(3,2)
  println(p3)
  println(p4)

}
case class point1(a:Int,b:Int){
  def x:Int=a
  def y:Int=b

  def move(dx:Int,dy:Int)=point1(this.x+dx,this.y+dy)

}
