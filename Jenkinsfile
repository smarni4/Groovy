pipeline{
    agent any

    stages {
        stage('Install') {
            steps {
                sh 'yum install docker'
            }
        }
        stage('Build') {
            steps {
                docker.image('maven:3.3.3').inside {
                    sh 'mvn --version'
                }
        }
    }
}
}