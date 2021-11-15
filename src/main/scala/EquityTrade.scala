class EquityTrade( id:String,  symbol : String,  quantity:Int,  initialPrice : Double)
  extends  AbstractTrade(id,initialPrice ){
  override def isExecutable(): Boolean = true
  def value() = quantity * initialPrice
  override def toString: String = super.toString + " EquityTrade"
}
