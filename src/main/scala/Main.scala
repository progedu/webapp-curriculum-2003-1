object Main {
  val v1: Option[Int] = Some(2)
  val v2: Option[Int] = Some(3)
  val v3: Option[Int] = Some(5)
  val v4: Option[Int] = Some(7)
  val v5: Option[Int] = Some(11)
}

/* REPL
for { i1 <- Main.v1
      i2 <- Main.v2
      i3 <- Main.v3
      i4 <- Main.v4
      i5 <- Main.v5} yield i1 * i2 * i3 * i4* i5
 */