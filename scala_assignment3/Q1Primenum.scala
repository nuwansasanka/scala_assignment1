object Q1Primenum extends App {
  def GCD(n: Int, y: Int): Int = y match {
    case 0 => n
    case x if (x > n) => GCD(x, n)
    case _ => GCD(y, n % y)
  }



  def Prime(a: Int, b: Int = 2): Boolean = b match {
    case x if (a == 1) => false
    case x if (x == a) => true
    case x if GCD(a, x) > 1 => false
    case x => Prime(a, x + 1)
  }
  println(Prime(5))
  println(Prime(8))
}