/** 2.2 - IsSorted */

object IsSorted {
  def isSorted(as: Array[A], ordered: (A,A) => Boolean): Boolean = {
    @annotation.tailrec
    def go(i: Int): Boolean = {
      if (i + 1 == as.length) true
      else if (!ordered(as(i), as(i + 1))) false
      else go(i + 1)
    }
    go(0)
  }
}
