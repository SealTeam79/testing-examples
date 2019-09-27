pipeline {
    agent any
    stages {
        stage('Compile') {
            
            steps {
                snDevOpsStep()
                echo 'Compiling ..'
            }
        }
        stage('Unit Tests') {
            
            steps {
                snDevOpsStep()
                echo 'Running unit tests..'
            }
        }
         stage('Integration Tests') {
     
            steps {
                snDevOpsStep()
                echo 'Running integration tests..'
            }
        }
    }
}
