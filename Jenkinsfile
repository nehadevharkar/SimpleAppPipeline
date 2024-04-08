pipeline {
    agent any
    pipeline {
    agent any

    environment {
        // Define environment variables here
        GIT_REPO_URL = 'https://github.com/nehadevharkar/SimpleAppPipeline.git'
        MAVEN_OPTS = '-Xmx512m -XX:MaxPermSize=256m'
    }

    stages {
        stage('Checkout') {
            steps {
                // Checkout code from Git repository
                git '''${https://github.com/nehadevharkar/SimpleAppPipeline.git}'''
            }
        }

        stage('Build') {
            steps {
                // Build the Maven project
                sh 'mvn clean install'
            }
            post {
                failure {
                    // Handle build failure
                    echo 'Build failed. Please investigate.'
                }
            }
        }

        stage('Test') {
            steps {
                // Run Selenium tests
                sh 'mvn test'
            }
            post {
                failure {
                    // Handle test failure
                    echo 'Tests failed. Please investigate.'
                }
            }
        }

        stage('Deploy') {
            steps {
                // Deployment steps go here
                // e.g., deploy the application to a server
                sh 'mvn package'
                // Add actual deployment steps here
            }
            post {
                failure {
                    // Handle deployment failure
                    echo 'Deployment failed. Please investigate.'
                }
            }
        }
    }
}
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
