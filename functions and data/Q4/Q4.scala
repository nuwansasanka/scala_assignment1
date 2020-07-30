object Q4 extends App {
  var AC1=new Accountn("972524345v",9852,-10001.25)
  var AC2=new Accountn("922524345v",9252,-20001.25)
  var AC3=new Accountn("992545645v",1052,30000.25)
  val bank:List[Accountn]=List[Accountn](AC1,AC2,AC3)

  val find=(Id:String,bank:List[Accountn])=>bank.filter(Acc=>Acc.Nic.equals(Id))
  val overdraf=(bank:List[Accountn])=>bank.filter(Acc=>Acc.Balance<0)
  val Allbalance=(bank:List[Accountn])=>bank.reduce((Acc1,Acc2)=>new Accountn("",Acc1.Ac_number,Acc1.Balance+Acc2.Balance))
  val Interest=(bank:List[Accountn])=>bank.map(Acc=>if(Acc.Balance>0) Acc.Balance*1.05 else Acc.Balance*1.1)
  val Inbalance=(Interest:List[Double])=>Interest.reduce((Interest1,Interest2)=>Interest1+Interest2)


  println("\nAccounts with negative balance :"+overdraf(bank))
  println("\nAll accounts balance :"+Allbalance(bank).Balance)
  println("\nAll acounts balance after adding interset :"+Inbalance(Interest(bank)))


}
class Accountn(Id:String,AcNo:Int,Aball:Double){
  val Nic=Id
  val Ac_number=AcNo
  var Balance=Aball
  def withdraw(a:Double)=this.Balance=this.Balance-a
  //override def toString:String="["+Nic+" , "+Ac_number+" , "+Balance+"]"

  def deposit(a:Double)=this.Balance=this.Balance+a
  def transfer(acc:Accountn,a:Double)={
    this.withdraw(a)
    acc.deposit(a)
  }
  override def toString:String="["+Nic+" , "+Ac_number+" , "+Balance+"]"
}
