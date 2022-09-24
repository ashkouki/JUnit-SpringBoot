pipeline {
    agent any
    tools {
        maven 'maven'
    }
    stages {
        stage('Build') {
            steps {
                bat 'mvn clean install'
            }
        }
        stage('Testing'){
            steps{
                //sonarqube
                bat 'mvn test'
            }
        }
        stage("Build docker image"){
            steps{
                script{
                    bat "docker build -t lexicography ."
                }
            }
         }
    }
}
