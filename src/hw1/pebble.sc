
def count(n : Int, k : Int) = {
  var numbers = List(1)
  for {
    i <- 2 to n
  }  numbers = numbers.sum :: numbers.take(k - 1)
  numbers.head
}
count(7, 2)