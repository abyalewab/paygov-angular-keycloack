pipeline {
    environment {
        registry = "abyalewab"
        registryCredential = 'dockerhub_id'
        dockerImage = ''
    }
    agent any
    triggers {
       pollSCM('* * * * *')
    }
    stages {
        stage('Cloning Git') {
            steps {
             git 'https://github.com/abyalewab/paygov-angular-keycloack.git'
            }
        }
        stage('Compile') {
            steps {
                bat "./gradlew clean build"
            }
        }
        stage('Building project image') {
            steps{
                script {
                   dockerImage = docker.build registry + ":$BUILD_NUMBER"
                }
            }
        }
        stage('Deploy project image') {
            steps{
                script {
                    docker.withRegistry( '', registryCredential ) {
                       dockerImage.push()
                    }
                }
            }
        }
        stage('Cleaning up') {
            steps{
               bat "docker rmi $registry:$BUILD_NUMBER"
            }
        }
    }
}
