pipeline {
    agent any
    stages {
        stage('Compile') {
            snDevOpsStep()
            steps {
                sh 'mvn clean package -DskipTests=true'
            }
        }
        stage('Unit Tests') {
            snDevOpsStep()
            steps {
                sh 'mvn surefire:test'
            }
        }
         stage('Integration Tests') {
            snDevOpsStep()
            steps {
                sh 'mvn failsafe:integration-test'
            }
        }
    }
    post {
        always {
            junit 'target/surefire-reports/TEST-*.xml'
        }
        failure {
            mail to: 'nitin.parashar@servicenow.com', subject: 'The Pipeline failed :(', body:'The Pipeline failed :('
        }
    }
}
