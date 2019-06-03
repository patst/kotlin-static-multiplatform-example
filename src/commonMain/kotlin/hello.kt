fun main() {
  println("Hello Kotlin/Native from Common Folder!")
  println("Platform: ${Platform.name}")
}

expect object Platform {
  val name: String
}