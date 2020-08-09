object Q1 extends App{
  val p1=point(2,3)
  val p2=point(3,5)
  println(p1+p2)
}
case class point(a:Int,b:Int){
  def x:Int=a
  def y:Int=b
  def +(p:point)=point(this.x+p.x,this.y+p.y)
}
