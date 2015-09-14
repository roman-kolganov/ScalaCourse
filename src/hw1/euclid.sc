import scala.annotation.tailrec

@tailrec
def extendedEuclid(a: Int, b: Int, aCoef: (Int, Int) = (1, 0), bCoef: (Int, Int) = (0, 1)):
    (Int, Int, Int) = {
  if (b == 0) {
    (a, aCoef._1, aCoef._2)
  } else {
    aCoef match {
      case (xa, ya) => bCoef match {
        case (xb, yb) => extendedEuclid(b, a % b, bCoef, (xa - xb * (a / b), ya - yb * (a / b)))
      }
    }
  }
}

extendedEuclid(5, 8)