

 class  Trade(
              val id:String,
              val symbol : String,
              val quantity:Int,
              var initialPrice : Double

            ){

require(initialPrice>0)
  require(quantity>0)
  private var _price = initialPrice

  def getPrice = _price //getter method
  def setPrice(value:Double) = { if (value >= 0) _price = value }  //setter method

    override def toString: String =  s" id : $id \n  Symbol: $symbol \n Quantity :  $quantity \n  Price : $initialPrice"
    def value() = quantity * initialPrice


}

object Trade {
  def apply(id: String, symbol: String, quantity: Int, initialPrice: Double) = new Trade(id, symbol, quantity, initialPrice)
}