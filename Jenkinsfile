pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                echo 'Build from Jenkinsfile'
            
            }
            post{
                success{
                    echo 'build Successful'
                }
                failure{
                    echo "Build failed'
                }
            }
        
        }
    }
}
