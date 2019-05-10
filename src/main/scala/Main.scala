object Main {
  val v1: Option[Int] = Some(2)
  val v2: Option[Int] = Some(3)
  val v3: Option[Int] = Some(5)
  val v4: Option[Int] = Some(7)
  val v5: Option[Int] = Some(11)

  // mapとflattenで一生懸命頑張るパターン
  val result1 = v1.map(x1 => 
    v2.map(x2 =>
    v3.map(x3 =>
    v4.map(x4 =>
    v5.map(x5 => x1 * x2 * x3 * x4 * x5)).flatten).flatten).flatten).flatten
  
  // flatMapを使用して少し簡単にする
  val result2 = v1.flatMap(x1 =>
    v2.flatMap(x2 =>
    v3.flatMap(x3 =>
    v4.flatMap(x4 =>
    v5.map(x5 => x1 * x2 * x3 * x4 * x5)))))
  
  // for式を使用してすっきりさせる
  val result3 = for (x1 <- v1; x2 <- v2; x3 <- v3; x4 <- v4; x5 <- v5) yield x1 * x2 * x3 * x4 * x5
}
