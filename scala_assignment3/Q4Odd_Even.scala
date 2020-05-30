object Q4Odd_Even extends App {
  def isEven(n:Int):Boolean=n match {
    case 0 => true
    case _ => isOdd(n-1)

  }
  def isOdd(n:Int):Boolean= !isEven(n)

  println(isEven(9))

}
