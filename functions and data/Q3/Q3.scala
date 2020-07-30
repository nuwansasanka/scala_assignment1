object Q3 extends App {
var AC1=new Account("972524345v",9852,15001.25)
  var AC2=new Account("922524345v",9252,20001.25)
  var AC3=new Account("992545645v",1052,30000.25)
  val bank:List[Account]=List[Account](AC1,AC2,AC3)
  println("\n Account Balance Before the Transfer")
  for(details<-bank){
    println(details)
  }
  println("\nAccount After the Transfer")
  bank(1).transfer(bank(2),1.25)

  for(details<-bank){
    println(details)
  }

}
class Account(Id:String,AcNo:Int,Aball:Double){
  val Nic=Id
  val Ac_number=AcNo
  var Balance=Aball
  def withdraw(a:Double)=this.Balance=this.Balance-a


  def deposit(a:Double)=this.Balance=this.Balance+a
  def transfer(acc:Account,a:Double)={
    this.withdraw(a)
    acc.deposit(a)
  }
  override def toString:String="["+Nic+" , "+Ac_number+" , "+Balance+"]"
}