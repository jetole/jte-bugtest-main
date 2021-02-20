void call() {
  docker.image("alpine".inside {
    sh "echo 'Hello, World!'"
  }
}
