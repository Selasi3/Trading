class FXTrade( id:String,   initialPrice : Double)
extends  AbstractTrade(id,initialPrice ) {
  override def isExecutable(): Boolean = false

  override def toString: String =super.toString+ "FxTrade"
}

