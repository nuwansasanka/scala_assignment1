object Q5Addeven extends App {
  def add(n:Int,a:Int=1):Int =a match{
    case x if(x==n) =>0
    case x if(x%2==0) => x+add(n,x+1)
    case _ => add(n,a+1)
  }
println(add(9))
}
