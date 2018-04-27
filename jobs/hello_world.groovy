job('Hello World') {
  // This defines job parameters that are populated before job is run or default is used
  parameters {
        booleanParam('FLAG', true)
        choiceParam('OPTION', ['option 1 (default)', 'option 2', 'option 3'])
    }

  // Triggers define how the job is triggered.
  // Jobs may still be triggered manually or by webhook as well here.
  triggers {
    cron('@daily')
  }

  stages {
    stage("Hello World") {
      steps {
        echo "hello"
      }
    }
  }
}
