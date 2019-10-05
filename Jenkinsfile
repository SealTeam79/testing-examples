pipeline {
    agent any
    stages {
        stage('Compile') {
            steps {
            	snDevOpsStep()
                echo 'Compiling ....'
                echo 'Completed compile'
            }
        }
        stage('Unit Tests') {
            stages {
                stage("Unit Tests - cucumber") {
                    steps {
                         echo 'running cucumber unit tests ....'
                         echo 'Completed cucumber unit tests..'
                    }
                }
                stage("Unit Tests - selenium") {
                    steps {
                        echo 'running selenium unit tests ....'
                        echo 'Completed selenium unit tests..'
                    }
                }
                stages {
                    stage("Unit Test - base1"){
                        steps {
                            snDevOpsStep()
                            echo 'running base1 unit tests ....'
                            echo 'Completed base1 unit tests..'
                        }
                    }
                    stage("Unit Test - base2"){
						steps {
                            snDevOpsStep()
                            echo 'running base2 unit tests ....'
                            echo 'Completed base2 unit tests..'
                        }
                    }
                }
            }
        }
        stage('Integration Tests') {
            parallel {
            	stage('INT-Test-basic') {
               		steps{
                 		snDevOpsStep ()
                 		echo 'Start Basic Integration tests..'
                        echo '1-Running basic Integration tests..'
                        echo '2-Running basic Integration tests..'
                 		echo 'End Basic Integration tests'
               		}
            	}
            	stage('INT-Test-advanced') {
               		steps{
                 		snDevOpsStep ()
                 		echo 'Start Advanced Integration tests..'
                        echo '1-Running Advanced Integration tests..'
                        echo '2-Running Advanced Integration tests..'
                        echo 'End Advanced Integration tests'
               		}
            	}
         	}
        }
    }
}
