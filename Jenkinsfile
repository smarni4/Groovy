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
                sh 'sudo yum install maven -y'
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

