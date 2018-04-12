import scala.collection.mutable.StringBuilder

object Pal {
	def isPal(str : String) : Boolean = {
		if ((str.length == 0) || (str.length == 1)) {
			true
		} else {
			var low1 = 0
			var low2 = 0

			var high1 = 0
			var high2 = 0

			if (str.length % 2 == 0) {
				low1 = 0
				low2 = str.length / 2
					
				high1 = (str.length / 2) - 1
				high2 = str.length - 1

			} else {
				low1 = 0
				low2 = (str.length / 2) + 1
					
				high1 = (str.length / 2) - 1
				high2 = str.length - 1
			}

			val str1 = new StringBuilder()
			val str2 = new StringBuilder()

			for {
				l <- low1 to high1
			} yield {
				str1.append(str(l))
			}

			for {
				h <- high2 to low2 by -1
			} yield {
				str2.append(str(h))
			}

			str1.toString == str2.toString
		}

	}

	def main(args : Array[String]) = {
		val arg = args(0)

		if (isPal(arg)) {
			println(s"$arg is a palindrome")
		} else {
			println(s"$arg is not a palindrome")
		}
	}
}
