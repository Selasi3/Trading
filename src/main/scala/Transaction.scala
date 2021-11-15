class Transaction(id:String, symbol:String, quantity:Int, initialPrice:Double) extends  EquityTrade(id, symbol, quantity, initialPrice) with  FeePayable  with Taxable {
  val values = super.value()
   def amount() = (values+fee)*tax + (values+fee)
}
