object Q3Addition extends App {
  def Add(n:Int,b:Int=0):Int =n match {
    case 0 => 0
    case x if x>b => n+Add(x-1,b)
  }
println(Add(5))
}
