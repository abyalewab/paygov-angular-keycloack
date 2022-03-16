pipeline {
    environment {
        registry = "abyalewab"
        registryCredential = 'dockerhub_id'
        dockerImage = 'paygov_k'
    }
    agent any
    triggers {
       pollSCM('*/5 * * * *')
    }
    stages {
        stage('Cloning our Git') {
            steps {
             git 'https://github.com/abyalewab/paygov-angular-keycloack.git'
            }
        }
        stage('Compile') {
            steps {
                gradlew('clean', 'classes')
            }
        }
        stage('Building our image') {
            steps{
                script {
                 dockerImage = docker.build registry + ":$BUILD_NUMBER"
                }
            }
        }
        stage('Deploy our image') {
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
            sh "docker rmi $registry:$BUILD_NUMBER"
            }
        }
    }
}
