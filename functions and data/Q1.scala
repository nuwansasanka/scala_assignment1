object Q1 extends App {
  val r1= new Rational(10,7)
  val r2=new Rational(3,7)

  println(r1.neg)
  println(r2.neg)
}

class Rational(x:Int,y:Int){


  def numer=x/gcd(x,y)
  def denom=y/gcd(x,y)
  def this(x:Int)=this(x,1)
  private def gcd(a:Int,b:Int):Int=if(b==0) a else gcd(b,a%b)

  def neg=new Rational(-this.numer,this.denom)

  override def toString=numer+"/"+denom
}