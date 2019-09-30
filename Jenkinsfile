pipeline {
    agent any
    stages {
        stage('Compile') {
            
            steps {
                snDevOpsStep()
                echo 'log line 1 ..'
                echo 'log line 2 ..'
                echo 'log line 3 ..'
                echo 'log line 4 ..'
                echo 'log line 5 ..'
                echo 'log line 6 ..'
                echo 'log line 7 ..'
                sleep 10
                echo 'log line 8 ..'
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
                sleep 10
            }
        }
    }
}
