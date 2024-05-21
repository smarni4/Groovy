pipeline{
    agent any

    stages {
        stage('checkout') {
            steps {
                checkout scm
            }
        }
        stage('Build') {
            
            steps {
                sh 'yum update -y'
                sh 'mvn --version'
            }    
        }
    }
    post {
        always {
            cleanWs()
        }
        failure {
            echo "Build failed"
        }
    }
}

