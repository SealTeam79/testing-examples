pipeline {
    agent any
    stages {
        stage('Compile') {
            
            steps {
                snDevOpsStep()
                echo 'Compiling ..'
                sleep 10
            }
        }
        stage('Unit Tests') {
            
            steps {
                snDevOpsStep()
                echo 'Running unit tests..'
                sleep 10
            }
        }
         stage('Integration Tests') {
     
            steps {
                snDevOpsStep()
                snDevOpsChange()
                echo 'Running integration tests..'
                sleep 60
            }
        }
    }
}
