object Main {
  val v1: Option[Int] = Some(2)
  val v2: Option[Int] = Some(3)
  val v3: Option[Int] = Some(5)
  val v4: Option[Int] = Some(7)
  val v5: Option[Int] = Some(11)

  def beginner(): Option[Int] = {
    for(l1 <- v1; l2 <-v2; l3 <-v3; l4<-v4; l5<-v5) yield l1 * l2  * l3 * l4 * l5
  }

  val f1: Option[Int => Int] = Some((x) => x * 2)
  val f2: Option[Int => Int] = Some((x) => x + 10)
  val f3: Option[Int => Int] = Some((x) => x / 3)

  def intermediate(x: Int): Option[Int] =
    for(l1 <- f1; l2 <- f2; l3 <- f3)
      yield l3(l2(l1(x)))
}
