object Q2 extends App{
  val x = new NRational(10, 7)
  val y = new NRational(6, 7)
  val z = new NRational(41, 7)
  var answer: NRational=x-y-z
  println(answer)
}

class NRational(x:Int,y:Int){


  def numer=x/gcd(x,y)
  def denom=y/gcd(x,y)
  def this(x:Int)=this(x,1)
  private def gcd(a:Int,b:Int):Int=if(b==0) a else gcd(b,a%b)
  def +(r:NRational)=new NRational(this.numer*r.denom+this.denom*r.numer,this.denom*r.denom)

  def neg=new NRational(-this.numer,this.denom)
  def -(r:NRational)=this+r.neg

  override def toString=numer+"/"+denom
}
