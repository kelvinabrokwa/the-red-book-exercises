/** Fibonacci */

object Fibonacci {
  def fib(n: Int): Int = {
    def loop(i: Int, j: Int, m: Int): Int = {
      if (n == m) i + j
      else loop(j, i + j, m + 1)
    }

    if (n == 1) 0
    else if (n == 2) 1
    else loop(0, 1, 3)
  }
}
