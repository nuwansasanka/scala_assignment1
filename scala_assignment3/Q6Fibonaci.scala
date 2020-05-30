object Q6Fibonaci extends App {
  def fibonaci(n:Int):Int=n match {
    case 0 =>0
    case 1 =>1
    case _ => fibonaci(n-1)+fibonaci(n-2)
  }
  def finbonaciseq(n:Int):Unit={
    if(n>0) finbonaciseq(n-1)
    println(fibonaci(n))
  }
finbonaciseq(7)
}
