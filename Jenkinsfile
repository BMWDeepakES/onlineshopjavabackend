pipeline{
    agent any

    tools {
            maven 'maven'
            jdk 'jdk17'

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
               sh 'cp target/*.war /opt/tomcat9/webapps/'
            }
        }
    }
}