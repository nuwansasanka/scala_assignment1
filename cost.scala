object cost extends App {
  def calculate(t:Double): Double=if(t>50) {
    (t-50)*0.75+3+t*24.95*60/100
  }
  else
  {
    3+t*24.95*60/100
  }
  println(calculate(60))
}
