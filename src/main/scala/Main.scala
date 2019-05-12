import scala.annotation.tailrec

object Main {
  //  2001
  @tailrec
  def series(n: Int, acc: Int): Int = {
    if (n == 0) {
      acc
    } else {
      series(n - 1, acc + n)
    }
  }

  //  2001-1
  @tailrec
  def fact(n: Int, acc: Int): Int = if (n <= 1) acc else fact(n - 1, acc * n)

  //  2001-2
  case class Switch(var isOn: Boolean)

  def toggle(switch: Switch): Unit = {
    if (switch.isOn) Switch(false) else Switch(true)
  }

  //  2001-3
  def twice(f: Int => Int): Int => Int = (x) => f(f(x))

  //  2002-1
  case class Pair[T1, T2](t1: T1, t2: T2)

  //  2002-3
  def isSorted[E](sortedSeq: Seq[E])(ordered: (E, E) => Boolean): Boolean = {
    def isSortedRec(i: Int): Boolean = {
      if (i == sortedSeq.length - 1) true
      else if (!ordered(sortedSeq(i), sortedSeq(i + 1))) false
      else isSortedRec(i + 1)
    }

    if (sortedSeq.length == 0) true
    else isSortedRec(0)
  }

  //  2003-1
  val v1: Option[Int] = Some(2)
  val v2: Option[Int] = Some(3)
  val v3: Option[Int] = Some(5)
  val v4: Option[Int] = Some(7)
  val v5: Option[Int] = Some(11)
  val result =
  for {
    i1 <- v1
    i2 <- v2
    i3 <- v3
    i4 <- v4
    i5 <- v5
  }
    yield i1 * i2 * i3 * i4 * i5
}
