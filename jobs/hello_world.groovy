job('Hello World') {
  logRotator(30, 30, 1, -1)
  triggers {
        scm('H/15 * * * *')
    }
  steps {
    shell('echo "Hello World!"')
  }
}
