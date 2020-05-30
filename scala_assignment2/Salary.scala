object Salary extends App {
  def wage(y:Double):Double=150*y
  println(wage(40))

  def OT(z:Double):Double=75*z
  println(OT(20))

  def Tax(Total:Double):Double=Total*10/100
  println(Tax(wage(40)+OT(20)))

  def Salary(sal:Double,tax:Double):Double=sal-tax
   println(Salary(wage(40)+OT(20),Tax(wage(40)+OT(20))))
}
