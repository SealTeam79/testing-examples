pipeline {
    agent any
    stages {
        stage('Compile') {
            snDevOpsStep()
            steps {
                echo 'Compiling ..'
            }
        }
        stage('Unit Tests') {
            snDevOpsStep()
            steps {
                echo 'Running unit tests..'
            }
        }
         stage('Integration Tests') {
            snDevOpsStep()
            steps {
                echo 'Running integration tests..'
            }
        }
    }
}
