
object BaseType {
	def apply(i : Int) : BaseType = {
		new BaseType(i)
	}
}
class BaseType(i : Int) {
	def ident = {
		println("I am a BaseType")
	}

	def doSomething() = {
		println(s"doSomething multiply by 2 = ${i * 2}")
	}
}

object ChildType {
	def apply(i : Int) : ChildType = {
		new ChildType(i)
	}
}
class ChildType(i : Int) extends BaseType(i) {
	override def ident = {
		println("I am a ChildType")
	}

	override def doSomething() = {
		println(s"doSomething divide by 2 = ${i / 2}")
	}
}

object Parents {
	def main(args : Array[String]) = {
		val b = BaseType(10)
		val c = ChildType(10)

		b.ident
		c.ident

		b.doSomething
		c.doSomething

		val bc : BaseType = ChildType(30)
		bc.ident
		bc.doSomething
	}
}
