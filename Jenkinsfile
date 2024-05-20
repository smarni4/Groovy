pipeline{
    agent any

    stages {
        stage('Build') {
            docker.image('maven:3.3.3').inside {
                sh 'mvn --version'
            }
        }
    }
}