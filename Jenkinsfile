pipeline {
    agent any
    environment {
        DOCKERHUB_CREDENTIALS = credentials('DockerHub')
    }
    stages {
        stage('Build') {
            steps {
                git 'https://github.com/ozmen54/sbt.git'
                sh "gradle clean bootJar"
            }
        }
        stage('Docker image'){
            steps{
                sh "docker build -t aozmen54/app:$BUILD_NUMBER ."
            }
        }
        stage('DockerHub login'){
            steps{
                sh 'echo $DOCKERHUB_CREDENTIALS_PSW | docker login -u $DOCKERHUB_CREDENTIALS_USR --password-stdin'
            }
        }
        stage('Push the image'){
            steps{
                sh 'docker push aozmen54/app:$BUILD_NUMBER'
            }
        }
    }
}