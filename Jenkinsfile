pipeline {
    agent any

    stages {

        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/yuvarajsaravanan21/Jenkin.git'
            }
        }

        stage('Compile') {
            steps {
                bat 'javac Hello.java'
            }
        }

        stage('Run') {
            steps {
                bat 'java Hello'
            }
        }
    }

    post {
        success {
            echo 'Build and Compilation Successful'
            archiveArtifacts artifacts: '*.class'
        }
        failure {
            echo 'Build Failed due to error'
        }
    }
}
