case class TradeCase(id:String, symbol : String, quantity:Int, initialPrice : Double){
  object TradeCase{
    def apply( id:String, symbol : String, quantity:Int, initialPrice : Double)= new TradeCase(id, symbol, quantity, initialPrice)
  }
}
