void call() {
  stage('Hello'){
    docker.image("alpine").inside {
      sh "echo 'Hello, World!'"
    }
  }
}
