pipeline {
    agent any
    
    stages {
        stage('Checkout') {
            steps {
                // Checkout code from Git repository
                git 'https://github.com/nehadevharkar/SimpleAppPipeline.git'
            }
        }
        
        stage('Build') {
            steps {
                // Build the Maven project
                sh 'mvn clean install'
            }
        }
        
        stage('Test') {
            steps {
                // Run Selenium tests
                sh 'mvn test'
            }
        }
        
        stage('Deploy') {
            steps {
                // Deployment steps go here
                // e.g., deploy the application to a server
                sh 'mvn package'

            }
        }
    }
}
