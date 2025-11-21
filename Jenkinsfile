pipeline{
    agent any

    tools {
            maven 'Maven'   // this must match the name in Global Tool Configuration
            jdk 'JDK 17'    // if using Java 17
        }

    stages {
        stage('Build') {
            steps {
                echo 'Building...'
                sh 'mvn clean install'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing...'
                sh 'mvn test'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying...'
                sh 'mvn deploy'
            }
        }
    }
}