object Q2PrimeSeq extends App {
  def GCD(n: Int, y: Int): Int = y match {
    case 0 => n
    case x if (x > n) => GCD(x, n)
    case _ => GCD(y, n % y)
  }


  def Prime(a: Int, b: Int = 2): Boolean = b match {
    case x if (a < 2) => false
    case x if (x == a) => true
    case x if GCD(a, x) > 1 => false
    case x => Prime(a, x + 1)
  }

  def primeseq(n: Int):Unit={
    

    if(n>0) primeseq(n-1)
    if(Prime(n-1)==true)  println(n-1)
  }
  primeseq(10)
}