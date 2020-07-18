object Caesar_Cipher extends App {
  val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

  val text="Hello"
   val Encrypt=(c:Char,shiftkey:Int,a:String)=> a((a.indexOf(c.toUpper)+shiftkey)%a.size)
   val Decrypt=(c:Char,shiftkey:Int,a:String)=> a((a.indexOf(c.toUpper)-shiftkey+a.size)%a.size)

  val cipher=(algo:(Char,Int,String)=>Char,S:String,shiftkey:Int,a:String)=>S.map(algo(_,shiftkey,a))
   val Encrypttxt=cipher(Encrypt,text,5,alphabet)
  val Decrypttxt=cipher(Decrypt,Encrypttxt,5,alphabet)
  println("Text:"+" "+text)
  println("Encrypt Text:"+" "+Encrypttxt)
  println("Decrypt Text:"+" "+Decrypttxt)
}