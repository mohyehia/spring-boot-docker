pipeline {
  agent any
  stages {
    stage('Checkout') {
      steps {
        echo 'Checkout from github Completed .....'
      }
    }

    stage('Build') {
      steps {
        echo 'Build Completed .....'
      }
    }

    stage('Test') {
      steps {
        echo 'Test Completed .....'
      }
    }

    stage('Deploy') {
      steps {
        input(message: 'Are u sure u want to deploy?', ok: 'Yes, I am sure')
        echo 'Deploy Completed .....'
      }
    }

    stage('Notify') {
      steps {
        echo 'New Build Completed!'
      }
    }

  }
}