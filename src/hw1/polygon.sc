
def area(vertices: List[(Int, Int)]) = {
  var area = 0
  val polygon = vertices.takeRight(2) ++ vertices
  for (i <- List.range(1, vertices.size + 1)) {
    area += polygon(i)._1 * (polygon(i + 1)._2 - polygon(i - 1)._2)
  }
  Math.abs(area / 2.0)
}
area(List((0, 0), (0, 1), (1, 1), (1, 0)))

def perimeter(vertices: List[(Int, Int)]) = {
  var perimeter = 0.0
  val polygon = vertices.last :: vertices
  for (i <- List.range(0, vertices.size)) {
    perimeter += Math.sqrt((polygon(i + 1)._1 - polygon(i)._1) * (polygon(i + 1)._1 - polygon(i)._1)
        + (polygon(i + 1)._2 - polygon(i)._2) * (polygon(i + 1)._2 - polygon(i)._2))
  }
  perimeter
}
perimeter(List((0, 0), (0, 1), (1, 1), (1, 0)))