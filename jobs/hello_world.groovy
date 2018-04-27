job('Hello World') {
  // This defines job parameters that are populated before job is run or default is used
  parameters {
        booleanParam('FLAG', true)
        choiceParam('OPTION', ['option 1 (default)', 'option 2', 'option 3'])
    }

  stages {
    stage("Hello World") {
      steps {
        echo "hello"
      }
    }
  }
}
