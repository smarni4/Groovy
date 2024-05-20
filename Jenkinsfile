pipeline{
    agent any

    stages {
        stage('checkout') {
            steps {
                checkout scm
            }
        }
        stage('Build') {
            agent {
                docker { image 'maven:3.3.3' }
            }
            steps {
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
