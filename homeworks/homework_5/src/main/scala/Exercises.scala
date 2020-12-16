object Exercises {
  trait Animal {
    def name: String
  }

  case class Cat(override val name: String) extends Animal

  case class Dog(override val name: String) extends Animal



  case class Shelter [+T <: Animal] (animals: List[T]) {
    def +[A >: T <: Animal](newAnimal: A): Shelter[A] =
      Shelter[A](animals :+ newAnimal)

    def ++[A >: T <: Animal](other: Shelter[A]): Shelter[A] =
      Shelter[A](animals ++ other.animals)

    def getNames: List[String] = {
      animals.map(_.name)
    }

    def feed[A >: T <: Animal](food: Food[A]): Seq[String] = {
      animals.map(food.feed)
    }
  }

  trait Food [T <: Animal] {
    def feed(animal: T): String = s"${animal.name} eats ${this.toString()}"
  }

  case object Meat extends Food[Animal] {
    override def toString(): String = "meat"
  }

  case object Milk extends Food[Cat] {
    override def toString(): String = "milk"
  }

  case object Bread extends Food[Dog] {
    override def toString(): String = "bread"
  }
}
