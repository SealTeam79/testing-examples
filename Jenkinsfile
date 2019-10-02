pipeline {
    agent any
    stages {
        stage('Compile') {
            steps {
            	snDevOpsStep()
                sh 'mvn clean package -DskipTests=true'
                echo 'Completed compile'
            }
        }
        stage('Unit Tests') {
            steps {
             	snDevOpsStep()
                sh 'mvn surefire:test'
                echo 'Completed unit tests..'
            }
        }
        stage('Integration Tests') {
            parallel {
            	stage('INT-Test1') {
               		steps{
                 		snDevOpsStep ()
                 		snDevOpsChange()
                 		echo 'Start INT-test1..'
                 		sh 'mvn failsafe:integration-test'
                 		echo 'End INT-test1..'
               		}
            	}
            	stage('INT-Test2') {
               		steps{
                 		snDevOpsStep ()
                 		snDevOpsChange()
                 		echo 'Start INT-test2..'
                 		sh 'mvn failsafe:integration-test'
                 		echo 'End INT-test2..'             
               		}
            	}
         	}
        }
    }
    post {
        always {
            junit 'target/surefire-reports/TEST-*.xml'
        }
        failure {
            mail to: 'nitin.parashar@servicenow.com', subject: 'The Pipeline failed :(', body:'The Pipeline failed :)'
        }
    }
}
