job('Hello World') {
  options {
    buildDiscarder(logRotator(numToKeepStr: '30', artifactNumToKeepStr: '30'))
  }
  steps {
    shell('echo "Hello World!"')
  }
}
