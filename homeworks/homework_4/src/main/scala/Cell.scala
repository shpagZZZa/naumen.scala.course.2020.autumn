trait Cell

class EmptyCell extends Cell {
  override def toString: String = "empty"
}

class NumberCell(value: Int) extends Cell {
  override def toString: String = value.toString
}

class StringCell(value: String) extends Cell {
  override def toString: String = value
}

class ReferenceCell(x: Int, y: Int, val table: Table) extends Cell {
  override def toString: String = {
    if (x < 0 || x >= table.width || y < 0 || y >= table.height)
      "outOfRange"
    else {
      val nextCell = getNextCell
      nextCell match {
        case Some(cell: ReferenceCell) =>
          if (cell.getNextCell.get == this) "cyclic"
          else cell.getNextCell.get.toString
        case Some(cell: Cell) => cell.toString
      }
    }
  }

  def getNextCell: Option[Cell] = table.getCell(x, y)
}
