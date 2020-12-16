package task_3

object Main extends App {
  var myName = "Svyatoslav"
  var greetings = Array("Hola", "hello", "Hi")
  var names = Array(myName, myName.reverse, "Simon")

  def greet(greeting: String, name: String): Unit = {
    println(s"$greeting Scala! This is $name")
  }

  greetings.foreach(greeting => {
    names.foreach(name => {
      greet(greeting, name)
    })
  })
}
