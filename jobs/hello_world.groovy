job('Hello World') {
  logRotator(30, -1, 1, -1)
  steps {
    shell('echo "Hello World!"')
  }
}
