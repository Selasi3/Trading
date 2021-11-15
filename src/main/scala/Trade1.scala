

object Trade1  extends App{
  val t1 = new Trade("TRAD01","T001",5,55.00)
  println("Class: "+t1.getClass)
  println("Hashcode: "+t1.hashCode())
  println(t1.toString())
  println("Value: "+t1.value)
  val tObject   = Trade("TRAD41","T002",5,55.00)
  println(tObject.toString)
val Case= TradeCase("TRAD11","T012",6,58.00)
  println(Case.toString)
  val trad3 = Case.copy( symbol = "TTW22")
  println("Trade3: "+trad3)
  t1.setPrice(-10)
  println("-----------------------")
  println(t1.toString())


}
