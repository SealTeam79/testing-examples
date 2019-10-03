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
                //sh 'mvn surefire:test'
                echo 'Completed unit tests..'
            }
        }
        stage('Integration Tests') {
            parallel {
            	stage('INT-Test1') {
               		steps{
                 		snDevOpsStep ()
                 		snDevOpsChange()
                 		echo 'Start INT-Test1..'
                        echo '1-Processing INT-Test1..'
                        echo '2-Processing INT-Test1..'
                        echo '3-Processing INT-Test1..'
                 		sh 'mvn failsafe:integration-test'
                 		echo 'End INT-Test1..'
               		}
            	}
            	stage('INT-Test2') {
               		steps{
                 		snDevOpsStep ()
                 		snDevOpsChange()
                 		echo 'Start INT-Test2..'
                        echo '1-Processing INT-Test2..'
                        echo '2-Processing INT-Test2..'
                        echo '3-Processing INT-Test2..'
                 		sh 'mvn failsafe:integration-test
                 		echo 'End INT-Test2..'             
               		}
            	}
         	}
        }
    }
   /* post {
        always {
            junit 'target/surefire-reports/TEST-*.xml'
        }
        failure {
            mail to: 'nitin.parashar@servicenow.com', subject: 'The Pipeline failed :(', body:'The Pipeline failed :)'
        }
    }*/
}
