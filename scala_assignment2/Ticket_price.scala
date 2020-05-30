object Ticket_price extends App {

    def attendee(tp:Double):Double=120-(tp-15)/5*20
    println(attendee(20))

  def revanue(p:Double):Double=p*attendee(p)
  println(revanue(20))

  def cost(x:Double):Double=500+x*3
   println(cost(attendee(20)))

def profit(t:Double,y:Double):Double=t-y
  println(profit(revanue(20),cost(attendee(20))))
}
