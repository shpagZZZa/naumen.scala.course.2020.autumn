import scala.collection.mutable

class Table(val width: Int, val height: Int) {
  private var cellsList = new mutable.MutableList[Cell]
  for (i <- 0 to width * height){
    cellsList += new EmptyCell()
  }

  def getCell(x: Int, y: Int): Option[Cell] = {
    if (x < 0 || x >= width || y < 0 || y >= height)
      None
    else
      cellsList.get(x + width * y)
  }

  def setCell(ix: Int, iy: Int, cell: Cell): Unit = cellsList(ix + iy * width) = cell
}